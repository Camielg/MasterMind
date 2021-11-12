package camiel.nl;

import java.util.Scanner;

public class UserGuess {

    private int firstDigit;
    private int secondDigit;
    private int thirdDigit;
    private int fourthDigit;

    public UserGuess(int firstDigit, int secondDigit, int thirdDigit, int fourthDigit){
        this.firstDigit=firstDigit;
        this.secondDigit=secondDigit;
        this.thirdDigit= thirdDigit;
        this.fourthDigit = fourthDigit;
    }
// speler kan de 4 getallen invoeren
    public void userGuessInput(){

        boolean repeatUserInput = true;

        while(repeatUserInput) {

            boolean validateUserInput = true;

            while(validateUserInput){


            Scanner userInput = new Scanner(System.in);

            System.out.println("Vul je eerste cijfer in (1 t/m 6)");
            firstDigit = userInput.nextInt();
            System.out.println("Vul je tweede cijfer in (1 t/m 6)");
            secondDigit = userInput.nextInt();
            System.out.println("Vul je derde cijfer in (1 t/m 6)");
            thirdDigit = userInput.nextInt();
            System.out.println("vul je vierder cijfer in (1 t/m 6)");
            fourthDigit = userInput.nextInt();


            System.out.println("Dit heb je in gevuld eerste cijfer is " + firstDigit + " tweede cijfer " + secondDigit + " derde cijfer " + thirdDigit + " vierde cijfer " + fourthDigit);
            System.out.println("klopt dit? toests 1 voor ja, zoniet toests 2 voor nee");

            int validate = userInput.nextInt();
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
            if(repeatUserInput = false){
                break;
            }

        }
    }

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
