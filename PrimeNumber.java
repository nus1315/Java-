import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input
        System.out.print("Enter n: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("n is int");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("This is prime number");
        } else {
            System.out.println("Not prime");
        }
    }
}


