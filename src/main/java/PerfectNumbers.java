import java.util.Scanner;

/*
 * Perfect Numbers Finder
 * This program finds and displays all perfect numbers between 1 and a user-defined upper limit.
 * A perfect number is a number that is equal to the sum of its proper divisors,
 * excluding the number itself.
 */

public class PerfectNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter upper limit
        System.out.print("Enter the upper limit for finding perfect numbers: ");
        long upperLimit = scanner.nextLong();

        findPerfectNumbers(upperLimit);
    }

    // Method to find and print perfect numbers up to a given limit
    public static void findPerfectNumbers(long upperLimit) {
        for (long number = 1; number <= upperLimit; number++) {
            long sum = 0;

            // Find divisors and calculate their sum
            for (long i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            // Check if the number is perfect
            if (sum == number) {
                System.out.println(number + " is a perfect number.");
            }
        }
    }
}
