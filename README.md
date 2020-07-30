# Learn Korean

#### https://github.com/msukmoon/learn-korean

Learn Korean is a simple Android application that helps users learn Korean alphabets and pronunciation.

<br/>
<p align="center">
  <img src="doc/screenshots/main.png" title="Main Menu" width="250">
</p>
<p align="center">Main Menu</p>
<br/>
<p align="center">
  <img src="doc/screenshots/tutorial-1.png" title="Tutorial Page 1" width="250">
  <img src="doc/screenshots/tutorial-2.png" title="Tutorial Page 2" width="250">
</p>
<p align="center">Tutorial Page</p>
<br/>
<p align="center">
  <img src="doc/screenshots/learning-1.png" title="Learning Mode 1" width="250">
  <img src="doc/screenshots/learning-2.png" title="Learning Mode 2" width="250">
</p>
<p align="center">Learning Mode</p>
<br/>
<p align="center">
  <img src="doc/screenshots/game-1.png" title="Game Mode 1" width="250">
  <img src="doc/screenshots/game-2.png" title="Game Mode 2" width="250">
</p>
<p align="center">Game Mode (Incomplete)</p>

## Program Description

This application has learning and game mode which helps users to pick up their new language more easily.

### Learning Mode

Users must learn the alphabets of their new language before they move on to playing games. The learning mode of this application makes sure that the users know all alphabets by going through them randomly until they decide to move on to the game mode.

The learning mode will always generate a unique set of random Korean alphabets. Buttons with an alphabet could be clicked to view a pronunciation of an alphabet. Clicking `Get New Characters` button on the bottom of the page will get a new set of alphabets by clearing all alphabets and pronunciations and then generating a unique set of random Korean alphabets again.

Going through multiple random alphabets at once is better than going through a single alphabet at a time when the users have some knowledge on their new language -- they do not know what alphabets they are missing, so going through the list of alphabets randomly and then finding a few that they are missing will be more helpful.

### Game Mode

When the users feel confident about their new language, they could test their knowledge by playing a game. This will not only test their knowledge but also give them a chance to learn even more about their new language by checking what they are missing. The most important aspect about this mode is that the users get to enjoy the learning process because it is a game. When it's fun, things get easier.

The game mode will have 5 unique alphabets and 5 matching pronunciations. (_To be implemented from this part_) The user should pair an alphabet and its matching pronunciation to clear them. The user will then continue with 4 remaining alphabets and their 4 matching pronunciations to match and clear another pair. The user will repeat this until clearing all pairs on the screen to complete a single round. The user will move on to the next round by getting a new set of alphabets and pronunciations.

## Getting Started

This is a Android Studio project that has not been published. It is required to import this project to Andriod Studio to run it.

### Running the Application

In Andriod Studio's welcome page,

1. Select `Check out project from Version Control`.

2. Select `Git`.

3. Put `https://github.com/msukmoon/learn-korean` for the URL and then select `Clone`.

4. Select `Run`. You will need an Android Virtual Device (AVD) with Android 7.0 (API level 24) or higher.

### Checking Source Codes

Source codes are in `app/src/main`. In this directory, Java source codes are in `com.example.learnkorean`, and XML resource files are in `res`.

## Author

- **Myungsuk (Jay) Moon** - [msukmoon](https://github.com/msukmoon) - jaymoon9876@gmail.com
