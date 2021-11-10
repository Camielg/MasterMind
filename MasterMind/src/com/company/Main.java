package com.company;

public class Main {

    public static void main(String[] args) {

        //menu aanmaken om spel te spelen of highscores te zien en het spel af te kunnen sluiten

        //te raden code aanmaken (klaar)
        CodeGenerator generator = new CodeGenerator();
        generator.Generator();


        UserGuess userInput = new UserGuess();
        userInput.UserGuessInput();
    }
}
