package camiel.nl;

public class Main {

    public static void main(String[] args) {

        //menu tonen (while loop alles blijft herhalen en bij optie 3 break geven en exit, methode in Menu classe)
        Menu menu = new Menu();
        menu.showOptions();

        // speler menu input vragen ( methode in Menu classe)
        menu.askUserInput();

        //1. spel spelen{       (onder case1 zetten in de Menu classe)
        // dit in het menu onder optie 1 zetten?

        // 3letters aanvragen (zoals oude pinball score dat ook deed) of hele naam nog niet overuit

        //te raden code aanmaken (methode in CodeGenerator classe)
        CodeGenerator generator = new CodeGenerator();
        generator.generator();

        //checken of je gewonnen hebt ( methode in UserGuess)
        UserGuess userInput = new UserGuess();
        userInput.userGuessInput();

        // kijken of je gewonnen hebt
        HasPlayerWon hasPlayerwon = new HasPlayerWon();
        hasPlayerwon.checkIfPlayerHasWon();

        // checken welke getallen je goed/voorkomen en deze terug geven( methode in UserGuess)
        hasPlayerwon.checkCorrectDigitPlace();

        //score bijhouden hoevaak je erover hebt gedaan om het te raden

        //wanneer gewonnen de 3 letters/naam en score wegschrijven(geëncrypt)   }

        // 2. high scores opvragen en tonen (onder case2 zetten in de Menu classe)

        //3. applicatie afsluiten (onder case3 zetten in de Menu classe)
    }
}
