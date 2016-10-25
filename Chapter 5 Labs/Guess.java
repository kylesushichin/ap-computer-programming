// ************************************************************
// Guess.java
//
// Play a game where the user guesses a number from 1 to 10
//
// ************************************************************
import java.util.Scanner;
import java.util.Random;
public class Guess
{
    public static void main(String[] args)
    {
        int numToGuess; //Number the user tries to guess
        int guess = 0; //The user's guess
        int guessAmount = 0;
        int guessHigh = 0;
        int guessLow = 0;
        
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        
        numToGuess = generator.nextInt(10) + 1;//randomly generate the number to guess
        //print message asking user to enter a guess
        //read in guess
        System.out.println("Enter a guess for a number 1-10");//print message saying guess is wrong
        guess = scan.nextInt();
        guessAmount++;
        
        while ( guess != numToGuess ) //keep going as long as the guess is wrong
        {
            //get another guess from the user
            if (guess < numToGuess) 
            {
                System.out.println("Your guess was low, guess again!");
                guess = scan.nextInt();
                guessLow++;
            }
            if (guess > numToGuess) 
            {
                System.out.println("Your guess was high, guess again!");
                guess = scan.nextInt();
                guessHigh++;
            }
            guessAmount++;
        }
        if (guess == numToGuess) System.out.println("Congratulation you guessed the number correctly! With " + guessAmount + " guesses, " + guessHigh + " high guesses, and " + guessLow + " low guesses.");//print message saying guess is right
    }
}