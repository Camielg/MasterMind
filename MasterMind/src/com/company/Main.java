package com.company;

public class Main {

    public static void main(String[] args) {

        //menu aanmaken om spel te spelen of highscores te zien en het spel af te kunnen sluiten

        //te raden code aanmaken (klaar)
        CodeGenerator generator = new CodeGenerator();
        generator.Generator();

        //forloop aanmaken om UserGuess en HasPlayerWon 10x te herhalen
        UserGuess userInput = new UserGuess();
        userInput.UserGuessInput();
    }
}
