package assignment2;
import java.util.Scanner;

public class Assignment1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the word: ");

        // Input word
        //
        String word = scanner.nextLine();

        // Input String c and migrate it to char type
        //
        System.out.print("Input the character: ");
        String c = scanner.nextLine();
        char d = c.charAt(0);

        // Create int count and initialize it to zero
        //
        int count = 0;

        for (int i = 0; i < word.length(); i++)
        {
            char a = word.charAt(i);
            if (a == d)
            {
              count++;
            }
        }
        System.out.println(word + " has " + count + " "+ d);
    }
}
