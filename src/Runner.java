import java.util.Scanner;

public class Runner {

    public static void main(String[] args){
        Game round = new Game();
        System.out.println(round.initialBlank());
        while (round.getGuessNumber() <= 8){
            Scanner sc = new Scanner(System.in);
            System.out.println(System.in);
            System.out.println("Enter your guess.");
            if (sc.hasNextLine()) {
                String input = sc.nextLine();
                System.out.println(round.guessLetter(input));
            } else {
                System.out.println("This is not a letter!");
            }
        }
    }

}
