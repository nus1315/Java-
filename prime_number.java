import java.util.Scanner;

public class prime_number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        // Check for negative or zero input
        if (num <= 0) {
            System.out.println("Invalid input: Please enter a positive integer.");
        } else {
            // Efficient prime number check using a loop
            boolean isPrime = true;
            if (num > 1) {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // Output result
            System.out.println(num + (isPrime ? " is a prime number." : " is not a prime number."));
        }
    }
}
/*/import java.util.Scanner;

public class PrimeNumberSwitch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        boolean isPrime = true; // Assume prime until proven otherwise

        switch (num) {
            case 1: // Special case: 1 is not prime
                isPrime = false;
                break;
            case 2: // Special case: 2 is the only even prime
                isPrime = true;
                break;
            default: // Check for divisibility by even numbers
                if (num % 2 == 0) {
                    isPrime = false;
                } else {
                    // Check for divisibility by odd numbers up to the square root
                    for (int i = 3; i * i <= num; i += 2) {
                        if (num % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
*/
