# PoolTesting

Design Document
<br>
Haseeb Ikram
<br>
Chris Royce
<br>

<h2>INTRODUCTION</h2>
User inputs information about their pool's chemical levels. The app basically recommends you the amount you need with links to products.

<h2>STORYBOARD</h2>
![pool tester](https://github.com/haseebikram/PoolTesting/issues/2#issue-1152722589)

<h2>FUNCTIONAL REQUIREMENTS</h2>
<h4>SCENARIO</h4>
As a user who has a pool, I wish to understand the chemical aspects of my pool.

<h4>ASSUMPTIONS</h4>
Numbers are input in a float point format.

<h4>EXAMPLES</h4>
Given the app is making proper calculations:

When I input a pH level of 5.0 & a pool size of 15000 gallons

Then I should recieve proper guidance and chemical recommendations: "Your pH level is too low, add 4.5oz of dry acid to your pool. Do not swim for 8 hours after application."

<h4>ASSUMPTIONS</h4>
Numbers are input in a float point format.

<h4>EXAMPLES</h4>
Given the app is making proper calculations:

When I input a CYA value of -100

Then I should recieve a message asking for a vaild input range: "That is not a valid input, please input a positive number in the range (range for chemical)."

<h2>CLASS DIAGRAM</h2>

![Chemicals](https://github.com/haseebikram/PoolTesting/issues/1#issue-1152708982)

<h2>CLASS DIAGRAM DESCRIPTION</h2>

MainActivity: The first screen the user sees, which will have areas to input different specifications about their pool.

PoolDetailActivity: Displays information about the current state of the user's pool, and what they can do to improve it.

Chemical: Noun class that represents various pool chemicals.

<h2>ROLES</h2>

DevOps/Product Owner/Scrum Master: Haseeb Ikram
<br>
Frontend Developer: Haseeb Ikram, Chris Royce
<br>
Integration Developer: Chris Royce
<br>


<h2>WEEKLY MEETING</h2>
Fridays at 9:00PM on Microsoft Teams