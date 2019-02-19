import java.util.Scanner;

public class Runner {

    public static void main(String[] args){
        Game round = new Game();
        System.out.println(round.initialBlank());
        while (round.getGuessNumber() < 8){
            Scanner sc = new Scanner(System.in);
            System.out.println(System.in);
            System.out.println("Enter your guess.");
            if (sc.hasNextLine()) {
                String input = sc.nextLine();
                if(round.repeatCheck(input).equals("alright")){
                    String result = round.guessLetter(input);
                    System.out.println(round.addSpaces(result));
                    System.out.println(round.continueOrNo(result));
                } else {
                    System.out.println(round.repeatCheck(input));
                }
            } else {
                System.out.println("This is not a letter!");
            }
        }
    }

}
