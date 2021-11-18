package camiel.nl;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HighScoreManager {
    //velden
    private  static  final String secretKey = "ssssshhhhhh!!!!";
    private ArrayList<String> highScores;
    //contructor
    public HighScoreManager(){
        this.highScores = this.readHighScores();
    }
    //methodes
    // highscores weg schrijven (geëncrypt)
    public void writeHighScores() {
        String highScoreString = String.join("\n", this.highScores);
        String encryptedString = SecureData.encrypt(highScoreString, secretKey);
        try {
            FileWriter writer = new FileWriter("data.txt",false);
            writer.write(encryptedString);
           // writer.write(score +" = ");
            // writer.write(name + "\r");


            writer.close();


        }
        catch (Exception ex){
            System.out.println("Er is iets fout gegaan");
        }
    }
    // lijst van highscores toonbaar maken (gedeëncrypt)
    public ArrayList <String> readHighScores(){
        ArrayList <String> list = new ArrayList<>();


        try {
            File data = new File("data.txt");

            Scanner myFileReader = new Scanner(data);
            if ( myFileReader.hasNextLine()){

                String dataLine = myFileReader.nextLine();
                String decryptedString = SecureData.decrypt(dataLine, secretKey);
                // uit lezen van de highscores gedecrypt de String manipulatie met behulp van een 3de (maatje)

                if(decryptedString !=null && !decryptedString.isEmpty()){
                // hier vangt hij op dat de decryptedString geen null of leeg kan zijn, dit was nodig omdat hij anders een error kan geven wanneer dit zo was


                Scanner myStringReader = new Scanner(decryptedString);
                while (myStringReader.hasNextLine()){
                    String highScoreEntry = myStringReader.nextLine();
                    list.add(highScoreEntry);
                   // System.out.println(highScoreEntry);
                }
                }
            }
            myFileReader.close();

        }
        catch (Exception ex){
            return list;

        }

        return list;
    }

    public void storeHighScore(String name, int score){
        this.highScores.add(name + " : " + score);
        this.writeHighScores();
    }
    public ArrayList<String> getHighScores(){
        return this.highScores;

    }
}
