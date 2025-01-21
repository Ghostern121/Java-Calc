//Main.java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Welcome to the Calculator Program!");
        System.out.println("Please select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Fibonacci Sequence");
        System.out.println("6. Sum of Array");
        System.out.println("7. Mean of Array");
        
        
        int choice = scanner.nextInt();
        
        
        UserInput userInput = new UserInput();
        switch (choice) {
            case 1:
               
                double[] addNumbers = userInput.getTwoNumbers();
                double sum = Calculator.add(addNumbers[0], addNumbers[1]);
                System.out.println("Result: " + sum);
                break;
            case 2:
               
                double[] subtractNumbers = userInput.getTwoNumbers();
                double difference = Calculator.subtract(subtractNumbers[0], subtractNumbers[1]);
                System.out.println("Result: " + difference);
                break;
            case 3:
                
                double[] multiplyNumbers = userInput.getTwoNumbers();
                double product = Calculator.multiply(multiplyNumbers[0], multiplyNumbers[1]);
                System.out.println("Result: " + product);
                break;
            case 4:
                
                double[] divideNumbers = userInput.getTwoNumbers();
                double quotient = Calculator.divide(divideNumbers[0], divideNumbers[1]);
                System.out.println("Result: " + quotient);
                break;
            case 5:
                
                int fibonacciIndex = userInput.getFibonacciNumber();
                long fibonacciResult = Calculator.fibonacci(fibonacciIndex);
                System.out.println("Fibonacci number at index " + fibonacciIndex + ": " + fibonacciResult);
                break;
            case 6:
                
                double[] arrayForSum = userInput.getArrayInput();
                double arraySum = Calculator.sumOfArray(arrayForSum);
                System.out.println("Sum of array: " + arraySum);
                break;
            case 7:
                
                double[] arrayForMean = userInput.getArrayInput();
                double arrayMean = Calculator.meanOfArray(arrayForMean);
                System.out.println("Mean of array: " + arrayMean);
                break;
            default:
                System.out.println("Invalid selection.");
        }
        
        scanner.close();
    }
}
