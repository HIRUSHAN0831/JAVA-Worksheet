package LW_03;
import java.util.Scanner;

class Temperature1 {
    private double celsius;

    public Temperature1() {
        celsius = 0.0;
    }

    public Temperature1(double celsius) {
        this.celsius = celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }

    public double toCelsius() {
        return celsius;
    }

    public double toFahrenheit() {
        return celsius * 9 / 5 + 32;
    }
}

public class Q02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        Temperature1 temp = new Temperature1();

        temp.setFahrenheit(fahrenheit);

        System.out.println("Temperature in Celsius: " + temp.toCelsius());

        input.close();
    }
}
