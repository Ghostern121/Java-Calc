\\UserInput.java

import java.util.Scanner;

public class UserInput {

    private Scanner scanner = new Scanner(System.in);

    
    public double[] getTwoNumbers() {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return new double[]{num1, num2};
    }

    
    public int getFibonacciNumber() {
        System.out.print("Enter the index for Fibonacci sequence: ");
        return scanner.nextInt();
    }

    
    public double[] getArrayInput() {
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        double[] array = new double[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }
        return array;
    }
}
