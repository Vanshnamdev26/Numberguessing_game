import java.util.Scanner;

public class Numberguessing_game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");

        //Generate a number to guess from 1 to 100
        int numToGuess = (int) (Math.random() * 100) + 1;

        // Numbers of attempts the user has made
        int k = 10;

        System.out.println("Number is choosen between 1 to 100. You have " + k + " attempts to guess the number.");

        for(int i = 0; i <= k; i++) {

            System.out.println("Guess the number: ");
            int userguess = sc.nextInt();

            if (userguess == numToGuess) {
                System.out.println("Congralutations ! you guessed the number");
                break;
            }
            else if (userguess < numToGuess) {
                System.out.println("The number is greater than " + userguess);
            }
            else {
                System.out.println("The number is less than " + userguess);
            }

            if (i == k) {
                System.out.println("You have exhausted all attempts. The number was: " + numToGuess);
            }
        }

        

    }
}
