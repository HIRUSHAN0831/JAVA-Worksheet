package LW_03;
import java.util.Scanner;

class Temperature1 {
    // private variable to store temperature in Celsius
    private double celsius;

    // No-argument constructor
    public Temperature1() {
        celsius = 0.0;
    }

    // Parameterized constructor
    public Temperature1(double celsius) {
        this.celsius = celsius;
    }

    // Setter for Celsius
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    // Setter for Fahrenheit
    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }

    // Getter for Celsius
    public double toCelsius() {
        return celsius;
    }

    // Getter for Fahrenheit
    public double toFahrenheit() {
        return celsius * 9 / 5 + 32;
    }
}

public class Q02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get temperature in Fahrenheit from user
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Create Temperature object
        Temperature1 temp = new Temperature1();

        // Use setFahrenheit method
        temp.setFahrenheit(fahrenheit);

        // Display equivalent Celsius
        System.out.println("Temperature in Celsius: " + temp.toCelsius());

        input.close();
    }
}
