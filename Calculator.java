//Calculator.java

public class Calculator {

    
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero.");
            return Double.NaN;
        }
        return num1 / num2;
    }

  
    public static long fibonacci(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

    
    public static double sumOfArray(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum;
    }

    
    public static double meanOfArray(double[] array) {
        if (array.length == 0) {
            System.out.println("Array is empty, cannot calculate mean.");
            return Double.NaN;
        }
        return sumOfArray(array) / array.length;
    }
}
