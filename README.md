# Let's play Wordle

This document explains the complete Wordle game implementation in Java, including all classes, methods, and their roles in the program.

## Project Files

- Dictionary.java — Loads and manages words from a text file.  
- Feedback.java — Compares a player’s guess to the secret word.  
- WordleGame.java — Runs the gameplay loop and handles user interaction.  
- words.txt — Text file containing valid 5-letter words.

## Class Dictionary

The Dictionary class manages the word list used in the game. It reads words from a file, checks if a word is valid, and randomly selects the secret word.

### Methods

### addWords

Reads the words.txt file and stores each line as a word in an ArrayList.

### isValid

Checks whether a given word is part of the loaded dictionary.

### getRandomWord

Selects and returns a random word from the dictionary.

## Class Feedback

The Feedback class evaluates a player’s guess compared to the secret word and generates a feedback pattern. Each letter is marked as correct (G), present in the word but misplaced (Y), or incorrect (B).

### Methods

### getPattern

Compares the guessed word with the secret word and produces a feedback pattern.

### isCorrect

Determines whether the player has guessed the word correctly.

### Getter Methods

Provide access to the private attributes of the Feedback object.

## Class WordleGame

The WordleGame class controls the overall flow of the game. It handles player input, manages guesses, and determines when the game is over.

### MakeGuess

Prompts the player to input a guess and checks it against the secret word.

### getSecretWord

Retrieves a random secret word from a Dictionary object.

### isGamerOver

Determines whether the game should end.

### startGame

Sets up the initial state of the game









