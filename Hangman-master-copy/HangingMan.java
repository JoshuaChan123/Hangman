public class HangingMan {

    private int numWrongGuesses;
    String[] HangmanImage = {"+----+\n"+
            "|\n"+
            "|\n"+
            "|\n"+
            "/\\n",

            "+----+\n"+
            "|    O\n"+
            "|\n"+
            "|\n"+
            "/\\n",

            "+----+\n"+
            "|    O\n"+
            "|    +\n"+
            "|\n"+
            "/\\n",

            "+----+\n"+
            "|    O\n"+
            "|    +-\n"+
            "|\n"+
            "/\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|\n"+
            "/\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|   / \n"+
            "/\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|   / \\n"+
            "/\\n",
        };
    public HangingMan(){
        numWrongGuesses=0;
    }

    public boolean isntDead(){
        if(this.numWrongGuesses<7)
            return true; else return false;
    }

    public void dieSomeMore(){
        this.numWrongGuesses++;
    }

    public void show(){
        System.out.println(HangmanImage[this.numWrongGuesses]);
    }
}