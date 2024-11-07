import java.util.Scanner;

/*
 * Perfect Numbers Finder
 * This program identifies and displays perfect numbers within a specified range.
 * A perfect number is an integer that is equal to the sum of its proper divisors,
 * excluding the number itself.
 */

public class PerfectNumbers {

    public static void main(String[] args) {
        // Display perfect numbers between 1 and 200 initially
        displayPerfectNumbers(200);

        // Scanner to take user input for a custom range
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the upper limit of the search
        System.out.print("Enter an upper limit to search for perfect numbers: ");
        long upperLimit = scanner.nextLong();

        // Display perfect numbers up to the user-defined limit
        displayPerfectNumbers(upperLimit);
    }

    /**
     * This method finds and prints perfect numbers up to a given limit.
     *
     * @param upperLimit The maximum number to check for perfect numbers
     */
    public static void displayPerfectNumbers(long upperLimit) {
        for (long number = 1; number <= upperLimit; number++) {
            if (isPerfect(number)) {
                System.out.println(number + " is a perfect number.");
            }
        }
    }

    /**
     * This method checks whether a number is perfect.
     *
     * @param number The number to check
     * @return true if the number is perfect, false otherwise
     */
    public static boolean isPerfect(long number) {
        long sum = 0;

        // Calculate the sum of proper divisors of the number
        for (long i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of divisors equals the number
        return sum == number;
    }
}
