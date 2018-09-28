import java.util.Random;
import java.util.Scanner;

public class testfile {
    public static void main(String[] args)
    {
        //double computerGuess = Math.random();
        //int computerGuessInt = (int)computerGuess;
        System.out.println("Choose a number from 0 - 100 and I will try to guess it");
        System.out.println("If the guess is wrong, type 'higher'(case sensitive) if its higher and 'lower'(case sensitive) if its lower");
        Scanner input = new Scanner(System.in);
        int computerGuessInt = 100;
        int computerGuess = computerGuessInt/2;
        int playerNumber =input.nextInt();
        int range = 25;
        System.out.println("Is 50 your number?");
        while(computerGuessInt != playerNumber)
        {
            String higher = input.nextLine();
            if(higher.equals("higher"))
            {
                computerGuess = computerGuess + range;
                range = range/2+1;
                System.out.println("Is" + " " + computerGuess + " " + "your number?");
            }
            if(higher.equals("lower"))
            {
                computerGuess = computerGuess - range;
                range = range/2 +1;
                System.out.println("Is" + " " + computerGuess + " " + " your number?");
            }
        }
        String answer = input.nextLine();
        if(answer.equals("yes"))
        {
            System.out.println("it works");
            return;
        }
        else
        {
            System.out.println("Don't lie please");
        }
    }
}
