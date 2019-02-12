import java.util.Scanner;

public class Runner {

    public static void main(){
        Game round = new Game();
        Scanner sc = new Scanner(System.in);
        System.out.println(System.in);
        System.out.println("Enter your guess.");
        String letter = sc.nextLine();
        System.out.println(round.guessLetter(letter));
    }

}
