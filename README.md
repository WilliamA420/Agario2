# Agario
![ezgif-1-5d8730afe9](https://user-images.githubusercontent.com/81203435/171082720-93023173-f92c-4095-a60f-5ba88927b369.gif)
## Game Overview
In this game you are a circular object which you can control to move around the screen eating food particles. The main objective of the game is to get the highest score possible before losing all your strength by colliding with the enemy object (pacman), if your strengh goes below 0 the game will end. In the main menu, The User can use the "A" & "D" key to change their current skin which they will play as in the game. While in game the the player can use the arrow keys to move around freely, and pressing the keys repeatedly will increase the speed! 

## Controls/Usage

Up Arrow Key --> move Upwards

Down Arrow Key --> move Downards

Left Arrow Key --> move to the Left

Right Arrow Key --> move to the Right

"A" & "D" key --> change skin

## Classes

![hat-removebg-preview](https://user-images.githubusercontent.com/81203435/171095110-7f433105-1ee5-45d8-bc88-a3872ac9a319.png)
### Hat Class:

This class contains all of the properties of the Hat including boundries, movement, and displaying it in real time!


## Frame Class:



The Frame class has all of the background code which is needed to display and run the code. Some of the contents include point values for the different colored food, boundries, text boxes, hitboxes, keystrokes, as well as just storing information in order for the game to run peroperly

![Screen Shot 2022-05-30 at 10 47 50 PM](https://user-images.githubusercontent.com/81203435/171101609-15e57ef7-558a-456d-b257-07121737a42a.jpg


## A.I. Class:

![pixil-frame-0_(15)](https://user-images.githubusercontent.com/81203435/171104953-6eae975a-e7b4-4f9c-952f-a4f991c2f94e.png)

The AI Class is responsible for the pacmna object that floats around the screen and substracts from your total score if collided with. It moves around by detecting when it hits the corners of the screen and adjusts its velocity in order to bounce off an infinite amount of times. Depending on the stage of the game you are at, your score will get subtracted from with the higher stages subtracting more per second that you are in contact with the enemey object.

![Screen Shot 2022-05-30 at 11 12 41 PM](https://user-images.githubusercontent.com/81203435/171104894-fd0049b3-d9bd-4f42-bcd5-279b9e96daf1.jpg)


## BGMain & Background Class::

These two classes store the image that is displayed onto the screen at any given moment, it allows it to change depending on what needs to be displayed at the current time whether its the main screen of the game itself.

![Screen Shot 2022-05-30 at 11 07 08 PM](https://user-images.githubusercontent.com/81203435/171104249-66be3d0d-94cc-4ddc-b35c-ec5e850b202b.jpg)



## Food Classes:

### Flower Class:

![pixil-frame-0_(18)](https://user-images.githubusercontent.com/81203435/171103079-a64ce2f1-9118-4159-b46a-aed354a43207.png)
The Flower class adds another type of point booster which is seperate from the regular colored circles scattered throughout the map. The flowers start to spawn more and more frequently throughout the course of the game and as the Player's score gets higher!

![Screen Shot 2022-05-30 at 10 53 57 PM](https://user-images.githubusercontent.com/81203435/171102379-d6429fab-8337-46fa-8962-d167795e4e67.jpg)


### Colors:

#### {Red, Yellow, Green, Blue, & Purple}:

The color classes include 5 different classes which each display an array of food in the color of the class it is under in random positions and assigns a specific value which corresponds to a certain color.

![Screen Shot 2022-05-30 at 10 06 48 PM](https://user-images.githubusercontent.com/81203435/171096873-6edcedd3-2ca1-4c9e-a795-17302350952e.jpg)

![Screen Shot 2022-05-30 at 10 06 58 PM](https://user-images.githubusercontent.com/81203435/171096852-308aff87-00c3-4aa5-9a53-83de9759058a.jpg)



