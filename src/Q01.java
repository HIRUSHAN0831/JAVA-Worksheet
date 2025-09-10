import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an odd-length word: ");
        String word = sc.nextLine();

        if (word.length() % 2 == 0) {
            System.out.println("The word must have an odd length!");
        } else {
            int middleIndex = word.length() / 2;
            char middleChar = word.charAt(middleIndex);
            System.out.println("The middle character is: " + middleChar);
        }

        sc.close();
    }
}
