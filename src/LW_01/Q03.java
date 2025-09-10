package LW_01;

import java.util.Scanner;
public class Q03 {
    public static void main(String[] args) {
        System.out.println("Enter length in Centimetres: ");
        Scanner sc = new Scanner(System.in);
        double cm= sc.nextDouble();
        double feet = cm/(2.54*12);
        double Rinches =cm%(2.54*12);
        double inches = Rinches/2.54;
        double rcm = Rinches%2.54;
        System.out.println((int)feet+" feet "+(int)inches+" inches "+(int)rcm+" centimetres" );
    }
}
