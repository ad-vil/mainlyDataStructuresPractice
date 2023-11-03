package stuff1;

import java.util.Scanner;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("cannot divide by zero");
        }
        return a / b;
    }
}

class ScientificCalculator extends Calculator {
    public double sin(double a) {
        return Math.sin(a);
    }

    public double cos(double a) {
        return Math.cos(a);
    }

    @Override
    public int add(int a, int b) {
        return (int) super.add(a, b);
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScientificCalculator calculator = new ScientificCalculator();

        System.out.print("enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("enter the second number: ");
        int num2 = scanner.nextInt();

        int result = calculator.add(num1, num2);
        System.out.println("the result of addition is: " + result);

        double result2 = calculator.divide(num1, num2);
        System.out.println("the result of division is: " + result2);

        double result3 = calculator.sin(num1);
        System.out.println("the result of sine is: " + result3);

        int result4 = calculator.multiply(num1, num2);
        System.out.println("the result of multiplication is: " + result4);
    }
}
