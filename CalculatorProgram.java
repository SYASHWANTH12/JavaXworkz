import java.util.Scanner;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero!");
        }
    }
}

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        Calculator calculator = new Calculator();

        int sum = calculator.add(num1, num2);
        System.out.println("Sum: " + sum);

        int difference = calculator.subtract(num1, num2);
        System.out.println("Difference: " + difference);

        int product = calculator.multiply(num1, num2);
        System.out.println("Product: " + product);

        try {
            int quotient = calculator.divide(num1, num2);
            System.out.println("Quotient: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
