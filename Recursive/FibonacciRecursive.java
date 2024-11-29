package Recursive;
import java.util.Scanner;
public class FibonacciRecursive {
    /// Fibonacci sequence: F(0) = 0, F(1) = 1
    /// F(n) = F(n-1) + F(n-2) for n > 1

    static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case
        } else if (n == 1) {
            return 1; // Base case
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate the Fibonacci value: ");
        int x = scanner.nextInt(); // Read user input
        if (x < 0) {
            System.out.println("Fibonacci is not defined for negative numbers.");
        } 
        else {
            System.out.println("The Fibonacci value at position " + x + " is: " + fibonacci(x));
        }
    }
}

