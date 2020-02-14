import java.util.Scanner;

public class Assignment5_4
{
    // Description:
    //  Find the longest palindrome subString of a String
    // Return:
    //  String Palindrome
    //
    public static String longestPalindrome(String s)
    {
        // By default, the first character is the longest palindrome subString
        String Palindrome = s.substring(0,1);
        int max = 1;
        for (int index = 1; index < s.length(); index++)
        {
            int center = index;

            // Case1: center maybe the space between two characters
            int left = center - 1, right = center;
            while (left >= 0 && right < s.length())
            {
                if (s.charAt(left) != s.charAt(right))
                {
                    break;
                }
                else
                {
                    if (s.substring(left, right + 1).length() > max)
                    {
                        Palindrome = s.substring(left, right + 1);
                        max = Palindrome.length();
                    }
                    left--;
                    right++;
                }
            }

            // Case2: center maybe the character itself
            int start = center - 1, end = center + 1;
            while (start >= 0 && end < s.length())
            {
                if (s.charAt(start) != s.charAt(end))
                {
                    break;
                }
                else
                {
                    if (s.substring(start, end + 1).length() > max)
                    {
                        Palindrome = s.substring(start, end + 1);
                        max = Palindrome.length();
                    }
                    start--;
                    end++;
                }
            }
        }
        return Palindrome;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a String: ");
        String string = scanner.nextLine();
        System.out.print("The longest palindromic substring is :" + longestPalindrome(string));
    }
}
