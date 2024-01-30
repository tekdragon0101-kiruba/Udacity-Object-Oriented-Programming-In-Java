import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        guessTheNumber(100);
    }

    static void guessTheNumber(int number) {
        // print some information about the game
        System.out.println("I have randomly guess the number between 1 to " + number);
        System.out.println("Try to guess it.");
        Scanner input = new Scanner(System.in);
        // get the random number
        // plus 1 to avoid guess is zero
        int guess = (int) (Math.random() * 100) + 1;
        // Get the user input
        int noOfGuesses = 10;
        int userNumber = 0;
        while (noOfGuesses > 0 && userNumber != guess) {
            System.out.print("You have " + noOfGuesses + " guesses. Enter the number between 1 to " + number + ": ");
            userNumber = input.nextInt();
            if (userNumber < guess) {
                System.out.println("It's greater than " + userNumber + ".");
            } else if (userNumber > guess) {
                System.out.println("It's smaller than " + userNumber + ".");
            } else {
                System.out.println("Congrats! You guessed correctly.");
            }
            noOfGuesses--;
        }
        if (userNumber != guess) System.out.println("Game Over. The correct number is " + guess);
    }
}
