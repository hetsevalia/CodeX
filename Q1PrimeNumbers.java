/*Q1) Create a program that defines a method called isPrime that takes an integer as a parameter and
 returns a boolean indicating whether the number is prime or not. Use this method to find and display the first 10 prime numbers.
 */
public class Q1PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        System.out.println("First 10 prime numbers:");
        while (count < 10) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
