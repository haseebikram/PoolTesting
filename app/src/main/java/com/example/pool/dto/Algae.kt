package com.example.pool.dto

/**
 * Algae Type
 *
 * @property type, whether the Algae is green, black, or gold in color - NOTE: Still need to clarify Algae types.
 * @property hoursCantSwim, number of hours it is unsafe to swim
 * @property ozPerGallon, ounces of algecide needed per gallon of pool water. Again, can adjust units
 * of measure
 * @property chlBoostPerGallon, amount of chlorine needed to boost the algecide for algae elimination
 * @constructor creates a chemical based on supplied properties
 */
class Algae(val type: String, val hoursCantSwim: Float, val ozPerGallon: Float, val chlBoostPerGallon: Float) {
    /**
     * @param poolGallonSize is the size of the pool
     * @return amount of algecide that needs to be added.
     */
    fun calcAlgNeeded(poolGallonSize: Float): Float {
        return ozPerGallon * poolGallonSize
    }
    /**
     * @param poolGallonSize is the size of the pool
     * @return amount of chlorine that needs to be added, or zero for none. a negative number
     * represents having too much, and needing to remove it.
     */
    fun calcChlNeeded(poolGallonSize: Float): Float {
        return (chlBoostPerGallon * 2) * poolGallonSize
    }

    /**
     * @override toString function
     * @return chemical name and a small summary about the chemical
     */

    @Override
    override fun toString(): String {
        if (this.hoursCantSwim > 0 ) {
            "There are more than 21,000 types of algae, typically classified by color. Alkalinity for pool water should be between 7.4 and 7.6, and anywhere between 80 and 140 ppm. " + return this.type + " should never appear, and any amount is dangerous. " + this.ozPerGallon + " of algecide and " +
            this.chlBoostPerGallon + " of chlorine are necessary are necessary to both shock and treat the system, and it isn't safe for pool goers for at least " + this.hoursCantSwim + " after use."
        }
        else
        {
            "Alkalinity for pool water should be between 7.4 and 7.6, and anywhere between 80 and 140 ppm. " + return this.type + " is within a safe range, and your pool is safe for pool goers."
        }
    }
}
