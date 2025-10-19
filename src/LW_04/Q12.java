package LW_04;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        System.out.print("Enter the word to replace: ");
        String oldWord = input.nextLine();
        System.out.print("Enter the replacement word: ");
        String newWord = input.nextLine();
        String result = sentence.replace(oldWord, newWord);
        System.out.println("Updated sentence: " + result);
    }
}
