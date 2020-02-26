import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle{
    private String puz;
    private int correct;
    private ArrayList<String> guesses= new ArrayList<String>();
    private String g;
    private String[] display= new String[9];
    public Puzzle(){
        puz="asdfghjkl";
        correct=0;
        for(int i=0; i<display.length; i++){
            display[i]="_";
        }
        g="";
    }

    public boolean isUnsolved(){
        if(correct<puz.length()){
            return true;
        } else {
            return false;
        }
    }

    public void show(){
        for(int i=0; i<puz.length(); i++){
            if(puz.substring(i,i+1).equals(g)){
                display[i]=g;
            }
        }
        System.out.println(Arrays.toString(display));
        System.out.print("Guessed: "+ this.guesses);

    }

    public boolean makeGuess(String guessed){
        boolean a=false;
        guesses.add(0,guessed);
        g=guessed;
        for(int i=0; i<puz.length(); i++){
            if(puz.substring(i,i+1).equals(guessed)){
                a= true;
                correct++;
            }
        }
        return a;
    }

    public String getWord(){
        return puz;
    }
}