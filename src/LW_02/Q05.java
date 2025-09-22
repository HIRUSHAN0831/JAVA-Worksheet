package LW_02;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        StringTokenizer st = new StringTokenizer(input, " ,.!?;:-'\"");
        String cleaned = "";

        while (st.hasMoreTokens()) {
            cleaned += st.nextToken().toLowerCase();
        }

        String reversed = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        sc.close();
    }
}
