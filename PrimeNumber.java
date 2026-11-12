
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        if (n <= 1) {
            count = 1;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    count = 1;
                    break;
                }
            }
        }

        if (count == 0) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is Not a Prime Number");
        }

        sc.close();
    }
}