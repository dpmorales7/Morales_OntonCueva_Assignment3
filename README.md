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
