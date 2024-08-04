package Programs;
import java.util.ArrayList;
import java.util.List;
public class PrimePattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pattern
        // Calculate the number of primes needed to fill the triangular pattern
        List<Integer> primes = generate(rows * (rows + 1) / 2);
        int index = 0; // Index to track the current position in the list of primes
        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Loop to print numbers in the current row
            for (int j = 0; j < i; j++) {
                // Print the current prime number
                System.out.print(primes.get(index) + " ");
                index++; // Move to the next prime number
            }
            System.out.println(); // Move to the next line after printing all numbers in the current row
        }
    }
    // Method to generate a list of the first n prime numbers
    public static List<Integer> generate(int count) {
        List<Integer> primes = new ArrayList<>();
        int num = 2; // Starting from the first prime number
        
        // Continue generating primes until we have 'count' primes
        while (primes.size() < count) {
            if (isPrime(num)) {
                primes.add(num); // Add the prime number to the list
            }
            num++; // Move to the next number
        }
        return primes; // Return the list of prime numbers
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // Numbers less than or equal to 1 are not prime
        // Check if num is divisible by any number from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false; // Not a prime number if divisible
        }
        return true; // The number is prime
    }
}
