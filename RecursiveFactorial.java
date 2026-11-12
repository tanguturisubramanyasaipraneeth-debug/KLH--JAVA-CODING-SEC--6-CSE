import java.util.Scanner;

public class RecursiveFactorial {

    static long factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } 
        else if (n > 20) {
            System.out.println("Number is too large");
        } 
        else {
            System.out.println("Factorial of " + n + " = " + factorial(n));
        }

        sc.close();
    }
}