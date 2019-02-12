import java.util.Random;

public class Game {

    private String[] selection = {"apple", "pear", "banana"};
    private int placement = new Random().nextInt(selection.length);
    private String word = selection[placement];
    int guesses;

    public Game() {
        this.guesses = 0;
    }

    // Scanner sc = new Scanner(System.in);
    //System.out.println();

}
