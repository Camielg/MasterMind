package camiel.nl;

public class HasPlayerWon {
    // velden
    private boolean checkIfPlayerHasWon;

    //contructors
    public HasPlayerWon(boolean checkIfPlayerHasWon){
        this.checkIfPlayerHasWon = checkIfPlayerHasWon;
    }

    public HasPlayerWon(){

    }

    //methodes
    // kijken of de speler gewonnen heeft

    public boolean checkIfPlayerHasWon(CodeGenerator generator, UserGuess userInput){
        if(generator.getFirstNumberCode() == userInput.getFirstDigit() && generator.getSecondNumberCode()== userInput.getSecondDigit() &&generator .getThirdNumberCode() == userInput.getThirdDigit() && generator.getFourthNumberGuess() == userInput.getFourthDigit()){

        return checkIfPlayerHasWon = true;
        } else {
        return checkIfPlayerHasWon = false;
        }
    }

    // als de speler niet gewonnen heeft kijken of er cijfers goed staan of voor komen in de combinatie

    public void checkCorrectDigitPlace(CodeGenerator generator, UserGuess userInput){



         
        System.out.println(" X: staat het cijfer op de juiste plaats");
        System.out.println(" O: dan kom het cijfer voor in de code");
        System.out.println("Je in voer is gecontroleerd en dit is het resultaat");

        if(checkIfPlayerHasWon == false){


            if(userInput.getFirstDigit() == generator.getFirstNumberCode()){
               // checkFirstToken = correctToken;
                System.out.print("X |");
            } else if(userInput.getFirstDigit() == generator.getSecondNumberCode()){
                //checkFirstToken = wrongPositionToken;
                System.out.print("O |");
            } else if(userInput.getFirstDigit() == generator.getThirdNumberCode()){
                //checkFirstToken = wrongPositionToken;
                System.out.print("O |");
            } else if(userInput.getFirstDigit() == generator.getFourthNumberGuess()){
                //checkFirstToken = wrongPositionToken;
                System.out.print("O |");

            } else if (userInput.getFirstDigit()!= generator.getFirstNumberCode() && userInput.getFirstDigit()!= generator.getSecondNumberCode()&& userInput.getFirstDigit()!=generator.getThirdNumberCode()&& userInput.getFirstDigit()!= generator.getFourthNumberGuess()){
                System.out.print("_ |");
            }

            if(userInput.getSecondDigit() == generator.getSecondNumberCode()){
               //checkSecondToken = correctToken;
                System.out.print("X |");

            } else if(userInput.getSecondDigit() == generator.getFirstNumberCode()){
                //checkSecondToken = wrongPositionToken;
                System.out.print("O |");

            } else if(userInput.getSecondDigit() == generator.getThirdNumberCode()){
                //checkSecondToken = wrongPositionToken;
                System.out.print("O |");

            } else if(userInput.getSecondDigit() == generator.getFourthNumberGuess()){
                //checkSecondToken = wrongPositionToken;
                System.out.print("O |");

            } else if (userInput.getSecondDigit()!= generator.getFirstNumberCode() && userInput.getSecondDigit()!= generator.getSecondNumberCode()&& userInput.getSecondDigit()!=generator.getThirdNumberCode()&& userInput.getSecondDigit()!= generator.getFourthNumberGuess()){
                System.out.print("_ |");
            }

            if(userInput.getThirdDigit() == generator.getThirdNumberCode()){
                System.out.print("X |");

            } else if(userInput.getThirdDigit() == generator.getFirstNumberCode()){
                System.out.print("O |");

            } else if(userInput.getThirdDigit() == generator.getSecondNumberCode()){
                System.out.print("O |");

            } else if(userInput.getThirdDigit() == generator.getFourthNumberGuess()){
                System.out.print("O |");

            } else if (userInput.getThirdDigit() != generator.getFirstNumberCode() && userInput.getThirdDigit() != generator.getSecondNumberCode()&& userInput.getThirdDigit() != generator.getThirdNumberCode()&& userInput.getThirdDigit() != generator.getFourthNumberGuess()){
                System.out.print("_ |");
            }

            if(userInput.getFourthDigit() == generator.getFourthNumberGuess()){
                //checkFourthToken = correctToken;
                System.out.print("X |");
                System.out.println();

            } else if(userInput.getFourthDigit() == generator.getFirstNumberCode()){
                //checkFourthToken = wrongPositionToken;
                System.out.print("O |");
                System.out.println();

            } else if(userInput.getFourthDigit() == generator.getSecondNumberCode()){
                //checkFourthToken = wrongPositionToken;
                System.out.print("O |");
                System.out.println();

            } else if(userInput.getFourthDigit() == generator.getThirdNumberCode()){
                //checkFourthToken = wrongPositionToken;
                System.out.print("O |");
                System.out.println();

            }else if (userInput.getFourthDigit() != generator.getFirstNumberCode() && userInput.getFourthDigit() != generator.getSecondNumberCode()&& userInput.getFourthDigit() != generator.getThirdNumberCode()&& userInput.getFourthDigit() != generator.getFourthNumberGuess()){
                System.out.print("_ |");
                System.out.println();
            }


        }


    }

}
