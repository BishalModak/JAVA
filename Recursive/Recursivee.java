package Recursive;
import java.util.Scanner;

public class Recursivee {
    /// factorial(0)=1
    /// factorial(n) n=n*n-1n....1
    /// factorial(n)=n*factorial(n-1)

    static int factorial(int n) {
        if (n==0||n==1) {
            return 1;
        } 
        else {
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int x=scanner.nextInt();  // Read user input

        if (x<0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } 
        else {
            System.out.println("The factorial value of "+x+" is: " +factorial(x));
        }
    }
}
