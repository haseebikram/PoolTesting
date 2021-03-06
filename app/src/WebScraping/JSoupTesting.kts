/**
//Variable for website main link
val wiki = "https://en.wikipedia.org"

// Connecting Jsoup to sample site
fun JSoupTesting() {
    val doc = Jsoup.connect("$wiki/wiki/List_of_films_with_a_100%25_rating_on_Rotten_Tomatoes").get()    // <1>
    doc.select(".wikitable:first-of-type tr td:first-of-type a")    // <2>
            .map { col -> col.attr("href") }    // <3>
            .parallelStream()    // <4>
            .map { extractMovieData(it) }    // <5>
            .filter { it != null }
            .forEach { println(it) }
}
//Sets the class for the data recieved
class Movie {
    var title: String? = ""
    var directedBy: String = ""
    var producedBy: String = ""
    var writtenBy: String = ""
    var starring: String = ""
    var musicBy: String = ""
    var releaseDate: String = ""

    override fun toString(): String {
        return "Movie(title='$title')"
    }

}
//Pulls the movie data from the page and creates an object for it
fun extractMovieData(url: String): Movie? { // <1>
    val doc: Document
    try {
        doc = Jsoup.connect("$wiki$url").get()  // <2>
    }catch (e: Exception){
        return null
    }

    val movie = Movie() // <3>
    doc.select(".infobox tr")   // <4>
            .forEach { ele ->   // <5>
                when {
                    ele.getElementsByTag("th")?.hasClass("summary") ?: false -> {   // <6>
                        movie.title = ele.getElementsByTag("th")?.text()
                    }
                    else -> {
                        val value: String? = if (ele.getElementsByTag("li").size > 1)
                            ele.getElementsByTag("li")
                                    .map(Element::text)
                                    .filter(String::isNotEmpty)
                                    .joinToString(", ") else
                            ele.getElementsByTag("td")?.first()?.text() // <7>

                        when (ele.getElementsByTag("th")?.first()?.text()) {    // <8>
                            "Directed by" -> movie.directedBy = value ?: ""
                            "Produced by" -> movie.producedBy = value ?: ""
                            "Written by" -> movie.writtenBy = value ?: ""
                            "Starring" -> movie.starring = value ?: ""
                            "Music by" -> movie.musicBy = value ?: ""
                            "Release date" -> movie.releaseDate = value ?: ""
                            "title" -> movie.title = value ?: ""
                        }
                    }
                }
            }
    return movie
}
*/