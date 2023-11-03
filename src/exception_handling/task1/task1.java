package exception_handling.task1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        byte a = sc.nextByte();
        byte b = sc.nextByte();
        System.out.println(multiply(a,b));
    }
    static int multiply(byte a, byte b){
        int result = 0;
        try{
            result = a*b;
            return result;
        } catch (ArithmeticException e) {
            System.out.println("enter a valid number");
            throw new RuntimeException(e);
        }
    }

}
