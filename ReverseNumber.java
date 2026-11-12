import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int reverse = 0;
        int temp = Math.abs(n);

        while (temp > 0) {

            int digit = temp % 10;

            reverse = reverse * 10 + digit;

            temp = temp / 10;
        }

        if (n < 0) {
            reverse = -reverse;
        }

        System.out.println("Reverse of " + n + " = " + reverse);

        sc.close();
    }
}