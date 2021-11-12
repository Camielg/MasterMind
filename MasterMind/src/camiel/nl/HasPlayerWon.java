package camiel.nl;

public class HasPlayerWon {

    private boolean CheckIfPlayerHasWon;
    private String Correcttoken;
    private String WrongPositionToken;

    public HasPlayerWon(boolean checkIfPlayerHasWon, String correcttoken, String wrongPositionToken){
        this.CheckIfPlayerHasWon = checkIfPlayerHasWon() ;
        this.Correcttoken= "X";
        this.WrongPositionToken= "O";
    }


// kijken of de speler gewonnen heeft
    public boolean checkIfPlayerHasWon(UserGuess firstDigit, UserGuess secondDigit, UserGuess thirdDigit, UserGuess fourthDigit){
        if(board[0] = firstDigit.getFirstDigit() && board[1]== secondDigit.getSecondDigit() && board[2] == thirdDigit.getThirdDigit() && board[3] == fourthDigit.getFourthDigit()){
        return true;
    } else {
        return false;
    }

    }

// als de speler niet gewonnen heeft kijken of er cijfers goed staan of voor komen in de combinatie
    public void checkCorrectDigitPlace(UserGuess firstDigit, UserGuess secondDigit, UserGuess thirdDigit, UserGuess fourthDigit, CodeGenerator board[]){

        String checkFirstDigit;
        String checkSecondDigit;
        String checkThirdDigit;
        String checkFourthDigit;

        if(CheckIfPlayerHasWon = false){

            if(firstDigit.getFirstDigit() = CodeGenerator board[0]){
                checkFirstDigit = Correcttoken;
            } else if(firstDigit.getFirstDigit() = board[1]){
                checkFirstDigit = WrongPositionToken;
            } else if(firstDigit.getFirstDigit() = board[2]){
                checkFirstDigit = WrongPositionToken;
            } else if(firstDigit.getFirstDigit() = board[3]){
                checkFirstDigit = WrongPositionToken;
            }

            if(secondDigit.getSecondDigit() = board[0]){
               checkSecondDigit =  Correcttoken;
            } else if(secondDigit.getSecondDigit() = board[1]){
                checkSecondDigit =  WrongPositionToken;
            } else if(secondDigit.getSecondDigit() = board[2]){
                checkSecondDigit =  WrongPositionToken;
            } else if(secondDigit.getSecondDigit() = board[3]){
                checkSecondDigit =  WrongPositionToken;
            }

            if(thirdDigit.getThirdDigit() = board[0]){
                checkThirdDigit = Correcttoken;
            } else if(thirdDigit.getThirdDigit() = board[1]){
                checkThirdDigit = WrongPositionToken;
            } else if(thirdDigit.getThirdDigit() = board[2]){
                checkThirdDigit = WrongPositionToken;
            } else if(thirdDigit.getThirdDigit() = board[3]){
                checkThirdDigit = WrongPositionToken;
            }

            if(fourthDigit.getFourthDigit() = board[0]){
                checkFourthDigit = Correcttoken;
            } else if(fourthDigit.getFourthDigit() = board[1]){
                checkFourthDigit = WrongPositionToken;
            } else if(fourthDigit.getFourthDigit() = board[2]){
                checkFourthDigit = WrongPositionToken;
            } else if(fourthDigit.getFourthDigit() = board[3]){
                checkFourthDigit = WrongPositionToken;
            }

        }
        System.out.println(" X: staat het cijfer op de juiste plaats");
        System.out.println(" O: dan kom het cijfer voor in de code");
        System.out.println("Je in voer is gecontroleerd en dit is het resultaat");
        System.out.println(checkFirstDigit + "-" + checkSecondDigit + "-" + checkThirdDigit + "-" + checkFourthDigit);
    }



}
