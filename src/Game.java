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
                if(check.substring(a, a+1).equals(this.guesses[b])){
                    builder += this.guesses[b];
                }
            }
            if (builder.length() - 1 != a){
                builder += "_";
            }
        }
        return builder;
    }

    public String continueOrNo(String result){
        String message = "";
        int endingGame = 9;
        String wordTest = this.word;
        if (result.equals(this.word)){
            this.guessNumber = endingGame;
            return "You won!";
        } else if (this.guessNumber == endingGame) {
            return "You lost! The word was " + this.word + ".";
        }
        return message;
    }

    public String addSpaces(String input){
        String output = "";
        String inputAdd = input + " ";
        for (int c = 0; c < this.word.length(); c++){
            output += inputAdd.substring(c, c+1) + " ";
        }
        return output;
    }

    public String repeatCheck(String input){
        for (int a = 0; a < this.guesses.length; a++){
            if (input.equals(this.guesses[a])){
                return "You already guessed that letter.";
            }
        }
        return "alright";
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
