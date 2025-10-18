package LW_03;
import java.util.Scanner;


class Temperature {

    private double celsius;


    public Temperature() {
        celsius = 0.0;
    }


    public Temperature(double celsius) {
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

public class Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        Temperature temp = new Temperature(celsius);

        System.out.println("Temperature in Fahrenheit: " + temp.toFahrenheit());

        input.close();
    }
}
