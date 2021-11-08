package com.company;

import java.util.Scanner;

public class UserGuess {
    public void UserGuessInput(){

        boolean validateUserInput = true;

        while(validateUserInput) {

            Scanner userInput = new Scanner(System.in);

            System.out.println("Vul je eerste cijfer in (1 t/m 6)");
            int firstDigit = userInput.nextInt();
            System.out.println("Vul je tweede cijfer in (1 t/m 6)");
            int secondDigit = userInput.nextInt();
            System.out.println("Vul je derde cijfer in (1 t/m 6)");
            int thirdDigit = userInput.nextInt();
            System.out.println("vul je vierder cijfer in (1 t/m 6)");
            int fourthDigit = userInput.nextInt();

            System.out.println("Dit heb je in gevuld eerste cijfer is " + firstDigit + " tweede cijfer " + secondDigit + " derde cijfer " + thirdDigit + " vierde cijfer " + fourthDigit);
            System.out.println("klopt dit? toests 1 voor ja, zoniet toests 2 voor nee");

            int validate = userInput.nextInt();
            if (validateUserInput){
                switch(validate){
                     case 1:
                        validateUserInput= false;
                        // win conditie kopppelen, handiger om hier dan velden te maken om daar naar te kunnen referen en te gebuiken voor andere classen betekend ook constructor en getters aanmaken dan
                         break;
                    case 2:
                         validateUserInput= true;
                        break;
                        //terug kopppelen naar regel 23
                     default:
                         //terug koppelen naar regel 23

                }
            }

        }
    }
}
