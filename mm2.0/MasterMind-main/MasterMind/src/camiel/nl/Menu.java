package camiel.nl;


import java.util.ArrayList;


import java.util.Scanner;

public class Menu {

    private String name;
    private int score;
    private static final String secretKey = "ssssshhhhhh!!!!";
    private HighScoreManager highScoreManager;

    //public Menu (String name){
    //  this.name = name;
    // this.score = 0;
    // }

    public Menu() {
        this.highScoreManager = new HighScoreManager();

    }


    public int askUserInput() {
        Scanner userNameInput = new Scanner(System.in);

        Scanner askName = new Scanner(System.in);


// menu aan maken
        System.out.println("Dit zijn de volgende optie's");
        System.out.println();
        System.out.println("1. Spel spelen");
        System.out.println("2. High scores bekijken");
        System.out.println("3. Afsluiten");
        System.out.println();
        //System.out.println("Vul het nummer in die overeen komt met de optie die je wilt doen. (1 t/m3)");

        boolean repeatMenuOrExit = true;

        int optionInput;
        do {
            System.out.println("Vul het nummer in die overeen komt met de optie die je wilt doen. (1 t/m3)");
            try {
                optionInput = userNameInput.nextInt();
            }
            catch(Exception e) {
                optionInput = 0;
                userNameInput.next();

            }
        }
        while(optionInput < 1 || optionInput > 3);


        switch (optionInput) {

            // speler kan het spel spelen
            case 1:
                System.out.println("Het spel wordt gestart");


                //  naam vragen
                System.out.println("Vul je naam in");

                do {
                    name = askName.nextLine();
                }
                while (name.isEmpty());

                //te raden code aanmaken
                CodeGenerator generator = new CodeGenerator();
                generator.generator();


                // getallen invullen door user
                UserGuess userInput = new UserGuess();
                HasPlayerWon hasPlayerwon = new HasPlayerWon();

                while (hasPlayerwon.checkIfPlayerHasWon(generator, userInput) == false) {

                    userInput.userGuessInput();

                    //score bijhouden hoe vaak je erover hebt gedaan om het te raden
                    score = score + 1;

                    // kijken of je gewonnen hebt

                    hasPlayerwon.checkIfPlayerHasWon(generator, userInput);

                    //wanneer gewonnen, naam en score wegschrijven(geëncrypt)   }
                    if (hasPlayerwon.checkIfPlayerHasWon(generator, userInput) == true) {

                        //System.out.println(encryptedString);

                        this.highScoreManager.storeHighScore(name, score);

                        System.out.println("Proficiat je hebt gewonnen");
                        System.out.println("naam en score worden aan de lijst van scores toegevoegd");
                        System.out.println("Kijk vanuit het menu waar je in de highscores bent gekomen");
                        break;
                    }


                    // checken welke getallen je goed/voorkomen en deze terug geven( methode in UserGuess)
                    hasPlayerwon.checkCorrectDigitPlace(generator, userInput);


                }
                score = 0;
                break;

            // speler kan highscores zien
            case 2:
                System.out.println("High scores worden getoond");
                ArrayList<String> names = new ArrayList<>();

                names = this.highScoreManager.getHighScores();

                for (int i = 0; i < names.size(); i++) {
                    System.out.println(names.get(i));
                }

                break;

            // speler kan het spel afsluiten
            case 3:
                System.out.println("Het programma wordt afgeloten");
                repeatMenuOrExit = false;
                break;

            default:
                // terug verwijzen  naar menu
                System.out.println();

        }

        if (!repeatMenuOrExit)
            System.exit(0);

        return askUserInput();

    }

}
