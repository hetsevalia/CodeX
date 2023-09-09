import java.util.Scanner;

public class WordAndLine 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        System.out.print("Enter a line: ");
        String line = scanner.nextLine();

        System.out.println(word + " " + line);
    }
}