import java.util.Scanner;

public class SumEvenPlaces {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        n = Math.abs(n);

        int sum = 0;
        int position = 1;

        while (n > 0) {

            int digit = n % 10;

            if (position % 2 == 0) {
                sum = sum + digit;
            }

            n = n / 10;
            position++;
        }

        System.out.println("Sum of even place digits = " + sum);

        sc.close();
    }
}