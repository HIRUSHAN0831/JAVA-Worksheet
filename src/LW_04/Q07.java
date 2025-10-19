package LW_04;
import java.util.Scanner;

public class Q07 {
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer: ");
            int num = input.nextInt();
            if (num < 0) {
                break;
            }
            System.out.println("Number of digits: " + countDigits(num));
        }
    }
}

