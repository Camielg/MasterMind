package camiel.nl;

import java.lang.reflect.Array;
import java.util.Random;

public class CodeGenerator {

     //private int[] toGuessCode;
    private Integer[] toGuessCode;
     // ieder array positie een eigen veld creeren?

    // te raden code aanmaken
    public void generator(){

        int maximum = 6;

        Random codeGenerator = new Random();
        
        toGuessCode = new Integer[4];
        for(int i = 0; i < toGuessCode.length; i++){
            toGuessCode[i] = codeGenerator.nextInt(maximum)+ 1;
        }
    }
    //public void toInteger(){


    //}

    public Integer[] getToGuessCode(){

        return toGuessCode;
    }
}
