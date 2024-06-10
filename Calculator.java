import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operator;

        System.out.println("Enter the first number:");
        num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        num2 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /):");
        operator = scanner.next().charAt(0);

        Calculator calc = new Calculator();
        double output;

        try {
            output = calc.calculate(num1, num2, operator);
            System.out.println("The result is: " + output);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public double calculate(double num1, double num2, char operator) throws Exception {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new Exception("Division by zero is not allowed.");
                }
            default:
                throw new Exception("The operator is not correct.");
        }
    }
}
