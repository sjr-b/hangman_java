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
        this.guessNumber = 0;
    }

    public String guessLetter(String letter) {
        this.guesses[this.guessNumber] = letter;
        String check = this.word + " ";
        String builder = "";
        for (int a = 0; a < this.word.length(); a++){
            for (int b = 0; b < this.guesses.length; b++){
                if(check.substring(a, a+1).equals(b)){
                    builder += b;
                } else {
                    builder += "_";
                }
            }
        }
        return builder;
    }

    // Scanner sc = new Scanner(System.in);
    //System.out.println();

}
