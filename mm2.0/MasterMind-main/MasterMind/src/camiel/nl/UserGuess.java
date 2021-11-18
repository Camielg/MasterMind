package camiel.nl;

import java.util.Scanner;

public class UserGuess {
    //velden
    private int firstDigit;
    private int secondDigit;
    private int thirdDigit;
    private int fourthDigit;

    //constructor
    public UserGuess(int firstDigit, int secondDigit, int thirdDigit, int fourthDigit){
        this.firstDigit=firstDigit;
        this.secondDigit=secondDigit;
        this.thirdDigit= thirdDigit;
        this.fourthDigit = fourthDigit;
    }
    public UserGuess(){

    }
    //methodes
    // speler kan de 4 getallen invoeren
    public void userGuessInput(){

        boolean repeatUserInput = true;

        while(repeatUserInput) {

            boolean validateUserInput = true;

            while(validateUserInput){


            Scanner userInput = new Scanner(System.in);

            do {
                System.out.println("Vul je eerste cijfer in (1 t/m 6)");
                try {
                    firstDigit = userInput.nextInt();
                } catch (Exception e) {
                    firstDigit = 0;
                    userInput.next();
                }
            }
            while (firstDigit < 1 || firstDigit > 6);

            do {
                System.out.println("Vul je tweede cijfer in (1 t/m 6)");
                try {
                    secondDigit = userInput.nextInt();
                } catch (Exception e) {
                    secondDigit = 0;
                    userInput.next();
                }
            }
            while (secondDigit < 1 || secondDigit > 6);

            do {
                System.out.println("Vul je derde cijfer in (1 t/m 6)");
                try {
                    thirdDigit = userInput.nextInt();
                } catch (Exception e) {
                    thirdDigit = 0;
                    userInput.next();
                }
            }
            while (thirdDigit< 1 || thirdDigit >6);

            do {
                System.out.println("vul je vierder cijfer in (1 t/m 6)");
                try {
                    fourthDigit = userInput.nextInt();
                } catch (Exception e) {
                    fourthDigit = 0;
                    userInput.next();
                }
            }
            while( fourthDigit< 1 || fourthDigit > 6);


            System.out.println("Dit heb je in gevuld,  eerste cijfer = " + firstDigit + ","+ " tweede cijfer = " + secondDigit + "," + " derde cijfer = " + thirdDigit + "," + " vierde cijfer = " + fourthDigit);
            int validate;
            do {
                System.out.println("klopt dit? toests 1 voor ja, zoniet toests 2 voor nee");
                try {
                    validate = userInput.nextInt();
                } catch (Exception e) {
                    validate = 0;
                    userInput.next();
                }
            }
            while(validate<1 || validate>2);
                 if (repeatUserInput) {
                     switch (validate) {
                         case 1:
                        repeatUserInput = false;
                        validateUserInput = false;
                        break;

                          case 2:

                        break;

                          default:
                              break;
                    }
                }
            }
            if(repeatUserInput == false){
                break;
            }

        }
    }
    //getters
    public int getFirstDigit(){
        return firstDigit;
    }

    public int getSecondDigit(){
        return secondDigit;
    }

    public int getThirdDigit() {
        return thirdDigit;
    }

    public int getFourthDigit() {
        return fourthDigit;
    }
}
