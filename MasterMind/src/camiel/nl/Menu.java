package camiel.nl;

import java.util.Scanner;

public class Menu {
    private String name;
    private int score;

    public Menu (String name){
        this.name = name;
        this.score = 0;
    }

    public Menu(){

    }
    // menu aan maken
    // menu misschien in main classe zetten(?)
    public void showOptions(){
        System.out.println("Dit zijn de volgende optie's");
        System.out.println("1. Spel spelen");
        System.out.println("2. High scores bekijken");
        System.out.println("3. Afsluiten");
    }

    public int askUserInput(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Vul het nummer in die overeen komt met de optie die je wilt doen. (1 t/m3)");
        boolean repeatMenuOrExit = true;
        int optionInput = userInput.nextInt();
        Scanner askName = new Scanner(System.in);

        switch(optionInput){
            // speler kan het spel spelen
            case 1:
                System.out.println("Het spel wordt gestart");
                name = askName.nextLine();

                break;

            // speler kan highscores zien
            case 2:
                System.out.println("High scores worden getoond");

                break;

            // speler kan het spel afsluiten
                case 3:
                System.out.println("Het programma wordt afgeloten");
                repeatMenuOrExit = false;
                break;
            default:
                System.out.println();
        }
        if(!repeatMenuOrExit)
            System.exit(0);

        return askUserInput();

    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }
}
