import java.util.Scanner;

public class ExtraCredit
{
    // Description:
    //  Reverse a string word by word and cut of leading or trailing or multiple spaces
    // Return:
    //  String reversedString
    //
    public static String reverse(String string)
    {
        String reverseString = "";
        String word = "";
        String space = " ";
        int count = 0;

        for (int i = string.length() - 1; i >= 0; i --)
        {
            char c = string.charAt(i);
            if (c != ' ')
            {
                word = word + c;
            }
            else if(!word.equals(""))
            {
                reverseString = reverseString + space.repeat(count) + reverse(word);
                count = 1;
                word = "";
            }
        }

        if(word.equals(""))
        {
            count = 0;
        }

        if (!reverseString.equals(""))
        {
            return reverseString + space.repeat(count) + reverse(word);
        }
        else
        {
            return word;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Please input a String:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        System.out.println("After reversed:");
        System.out.print(reverse(string));
    }
}
