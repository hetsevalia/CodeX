import java.util.Scanner;

public class SpyNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int originalNum = num;
        int sumOfDigits = 0;
        int productOfDigits = 1;

        while (num > 0) 
        {
            int digit = num % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            num /= 10;
        }

        if (sumOfDigits == productOfDigits) 
        {
            System.out.println(originalNum + " is a Spy number.");
        } 
        else 
        {
            System.out.println(originalNum + " is not a Spy number.");
        }
    }
}
