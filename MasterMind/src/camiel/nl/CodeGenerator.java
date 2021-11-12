package camiel.nl;

import java.util.Random;

public class CodeGenerator {

    private int firstNumberCode;
    private int secondNumberCode;
    private int thirdNumberCode;
    private int fourthNumberGuess;

    public CodeGenerator(int firstNumberGuess, int secondNumberGuess, int thirdNumberGuess, int fourthNumberGuess){
        this.firstNumberCode = firstNumberGuess;
        this.secondNumberCode = secondNumberGuess;
        this.thirdNumberCode = thirdNumberGuess;
        this.fourthNumberGuess = fourthNumberGuess;
    }
    public CodeGenerator(){

    }



    // te raden code aanmaken
    public void generator(){

        int maximum = 6;

        Random codeGenerator = new Random();

       firstNumberCode = codeGenerator.nextInt(maximum)+ 1;
       secondNumberCode = codeGenerator.nextInt(maximum) + 1;
       thirdNumberCode = codeGenerator.nextInt(maximum) + 1;
       fourthNumberGuess = codeGenerator.nextInt(maximum) + 1;
    }

    public int getFirstNumberCode(){
        return firstNumberCode;
    }

    public int getSecondNumberCode(){
        return secondNumberCode;
    }

    public int getThirdNumberCode(){
        return thirdNumberCode;
    }

    public int getFourthNumberGuess(){
        return fourthNumberGuess;
    }
}

