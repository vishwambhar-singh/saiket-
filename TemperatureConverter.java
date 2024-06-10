import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option: ");
        int option = scanner.nextInt();

        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        double result;
        if (option == 1) {
            // Celsius to Fahrenheit formula: (temperature * 9/5) + 32
            result = (temperature * 9.0/5) + 32;
            System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit.%n", temperature, result);
        } else {
            // Fahrenheit to Celsius formula: (temperature - 32) * 5/9
            result = (temperature - 32) * 5.0/9;
            System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius.%n", temperature, result);
        }
    }
}
