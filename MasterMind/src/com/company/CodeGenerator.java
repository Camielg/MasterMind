package com.company;

import java.util.Random;

public class CodeGenerator {
    public void Generator(){
        int maximum = 6;

        Random codeGederator = new Random();
        
        int[] toGuessCode = new int[4];
        for(int i = 0; i < toGuessCode.length; i++){
            toGuessCode[i] = codeGederator.nextInt(maximum)+ 1;
        }
    }
}
