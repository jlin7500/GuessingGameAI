import java.util.Random;
import java.util.Scanner;

public class testfile {
    public static void main(String[] args)
    {
        //double computerGuess = Math.random();
        //int computerGuessInt = (int)computerGuess;
        System.out.println("Choose a number from 0 - 100 and I will try to guess it");
        Scanner input = new Scanner(System.in);
        int playerGuess = input.nextInt();
        Random computerGuess = new Random();
        int computerGuessInt = computerGuess.nextInt(101);
        while(computerGuessInt != playerGuess)
        {
            String answer = input.nextLine();
            if(answer.equals("yes"))
            {
                System.out.println("it works");
                return;
            }
            computerGuess = new Random();
            computerGuessInt = computerGuess.nextInt(101);
            System.out.println("Is" + " " + computerGuessInt + " " + "Your number");
            System.out.println("If no, type 'higher' if its higher and 'lower' if its lower");
        }
        //String higherOrLower = input.nextLine();
    }
}
