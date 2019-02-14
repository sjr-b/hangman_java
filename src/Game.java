import java.util.Random;

public class Game {

    String[] guesses;
    String word;
    int guessNumber;

    public Game() {
        String[] selection = {"apple", "pear", "banana"};
        int placement = new Random().nextInt(selection.length);
        this.word = selection[placement];
        this.guesses = new String[word.length()];
        this.guessNumber = -1;
    }

    public String guessLetter(String letter) {
        this.guessNumber++;
        this.guesses[this.guessNumber] = letter;
        String check = this.word + " ";
        String builder = "";
        for (int a = 0; a < this.word.length(); a++){
            for (int b = 0; b < this.guesses.length; b++){
                String test1 = check.substring(a, a+1);
                if(check.substring(a, a+1).equals(this.guesses[b])){
                    builder += this.guesses[b];
                }
            }
            int test = builder.length();
            if (builder.length() - 1 != a){
                builder += "_ ";
            }
        }
        return builder;
    }

    public String initialBlank(){
        String builder = "";
        for (int a = 0; a < this.word.length(); a++){
            builder += "_ ";
        }
        return builder;
    }

    public int getGuessNumber() {

        return guessNumber;

    }

    // Scanner sc = new Scanner(System.in);
    //System.out.println();

}
