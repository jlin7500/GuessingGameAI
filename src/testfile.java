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
        //double computerNumber = Math.random()*100;
        //int computerGuessInt = (int)computerNumber;
        //System.out.println(computerGuessInt);
        int computerGuessInt = 100;
        int playerNumber =input.nextInt();
        System.out.println("Is 50 your number?");
        while(computerGuessInt != playerNumber)
        {
            String higher = input.nextLine();
            int computerGuess = computerGuessInt/2;
            if(higher.equals("higher"))
            {
                int computerGuess2 = computerGuess/2 + 50;
                System.out.println("Is" + " " + computerGuess2 + " " + "your number?");
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
