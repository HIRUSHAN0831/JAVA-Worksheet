package LW_01;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        System.out.println("Enter Your full name(first middle last ): ");
        Scanner sc = new Scanner(System.in);
        String fname = sc.nextLine();
        String [] parts = fname.split(" ");

        if (parts.length==3){
            String first = parts[0];
            String second = parts[1];
            String last = parts[2];

            char middleInitial = second.charAt(0);
            System.out.println("New name format is: "+last+" "+first+" "+middleInitial+".");
        } else {
            System.out.println("Enter valid full name");
        }

    }
}