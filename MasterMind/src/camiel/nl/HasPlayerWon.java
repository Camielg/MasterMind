package camiel.nl;

public class HasPlayerWon {

    private boolean CheckIfPlayerHasWon;
    private String correctToken;
    private String wrongPositionToken;

    public HasPlayerWon(boolean checkIfPlayerHasWon){
        this.CheckIfPlayerHasWon = checkIfPlayerHasWon;
        this.correctToken = "X";
        this.wrongPositionToken = "O";
    }

    public HasPlayerWon(){

    }


// kijken of de speler gewonnen heeft
    public boolean checkIfPlayerHasWon(UserGuess firstDigit, UserGuess secondDigit, UserGuess thirdDigit, UserGuess fourthDigit, CodeGenerator firstCodeNumber, CodeGenerator secondCodeNumber, CodeGenerator thirdCodeNumber, CodeGenerator fourthCodeNumber){
        if(firstCodeNumber.getFirstNumberCode() == firstDigit.getFirstDigit() && secondCodeNumber.getSecondNumberCode()== secondDigit.getSecondDigit() && thirdCodeNumber.getThirdNumberCode() == thirdDigit.getThirdDigit() && fourthCodeNumber.getFourthNumberGuess() == fourthDigit.getFourthDigit()){

        return true;
    } else {
        return false;
    }

    }

// als de speler niet gewonnen heeft kijken of er cijfers goed staan of voor komen in de combinatie
    public void checkCorrectDigitPlace(UserGuess firstDigit, UserGuess secondDigit, UserGuess thirdDigit, UserGuess fourthDigit, CodeGenerator firstCodeNumber, CodeGenerator secondCodeNumber, CodeGenerator thirdCodeNumber, CodeGenerator fourthCodeNumber){

        String checkFirstToken = "";
        String checkSecondToken = "";
        String checkThirdToken = "";
        String checkFourthToken = "";

        if(CheckIfPlayerHasWon = false){

            if(firstDigit.getFirstDigit() == firstCodeNumber.getFirstNumberCode()){
                checkFirstToken = correctToken;
            } else if(firstDigit.getFirstDigit() == secondCodeNumber.getSecondNumberCode()){
                checkFirstToken = wrongPositionToken;
            } else if(firstDigit.getFirstDigit() == thirdDigit.getFirstDigit()){
                checkFirstToken = wrongPositionToken;
            } else if(firstDigit.getFirstDigit() == fourthCodeNumber.getFourthNumberGuess()){
                checkFirstToken = wrongPositionToken;
            }

            if(secondDigit.getSecondDigit() == secondCodeNumber.getSecondNumberCode()){
               checkSecondToken = correctToken;
            } else if(secondDigit.getSecondDigit() == firstCodeNumber.getFirstNumberCode()){
                checkSecondToken = wrongPositionToken;
            } else if(secondDigit.getSecondDigit() == thirdCodeNumber.getThirdNumberCode()){
                checkSecondToken = wrongPositionToken;
            } else if(secondDigit.getSecondDigit() == fourthCodeNumber.getFourthNumberGuess()){
                checkSecondToken = wrongPositionToken;
            }

            if(thirdDigit.getThirdDigit() == thirdCodeNumber.getThirdNumberCode()){
                checkThirdToken = correctToken;
            } else if(thirdDigit.getThirdDigit() == firstCodeNumber.getFirstNumberCode()){
                checkThirdToken = wrongPositionToken;
            } else if(thirdDigit.getThirdDigit() == secondCodeNumber.getSecondNumberCode()){
                checkThirdToken = wrongPositionToken;
            } else if(thirdDigit.getThirdDigit() == fourthCodeNumber.getFourthNumberGuess()){
                checkThirdToken = wrongPositionToken;
            }

            if(fourthDigit.getFourthDigit() == fourthCodeNumber.getFourthNumberGuess()){
                checkFourthToken = correctToken;
            } else if(fourthDigit.getFourthDigit() == firstCodeNumber.getFirstNumberCode()){
                checkFourthToken = wrongPositionToken;
            } else if(fourthDigit.getFourthDigit() == secondCodeNumber.getSecondNumberCode()){
                checkFourthToken = wrongPositionToken;
            } else if(fourthDigit.getFourthDigit() == thirdCodeNumber.getThirdNumberCode()){
                checkFourthToken = wrongPositionToken;
            }

        }
        System.out.println(" X: staat het cijfer op de juiste plaats");
        System.out.println(" O: dan kom het cijfer voor in de code");
        System.out.println("Je in voer is gecontroleerd en dit is het resultaat");
        System.out.println(checkFirstToken + "-" + checkSecondToken + "-" + checkThirdToken + "-" + checkFourthToken);
    }



}
