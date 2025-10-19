package LW_04;
import java.util.Scanner;
import java.util.Random;

public class Q11 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        Scanner input = new Scanner(System.in);
        int guess = 0;
        while (guess != number) {
            System.out.print("Guess the number: ");
            guess = input.nextInt();
            if (guess < number) {
                System.out.println("Higher");
            } else if (guess > number) {
                System.out.println("Lower");
            } else {
                System.out.println("Correct! The number was " + number);
            }
        }
    }
}

