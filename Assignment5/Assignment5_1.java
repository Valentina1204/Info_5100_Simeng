import java.util.Scanner;

public class Assignment5_1
{
    // Description:
    //  Find the index of first unique character in a String
    // Return:
    //  int index
    //
    public static int firstUniqChar(String s)
    {
        int index;
        for (index = 0; index < s.length(); index++)
        {
            int num = 0;
            char c = s.charAt(index);
            for (int in = 0; in < s.length(); in++)
            {
                if (index != in && c == s.charAt(in))
                {
                    num++;
                    break;
                }
            }
            if (num == 0)
            {
                return index;
            }
        }

        System.out.println("No unique character in this String");
        return -1;
    }

    public static void main(String[] args)
    {
        System.out.println("Please input a String: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int p = firstUniqChar(s);
        if (p >= 0)
        {
            System.out.println("The first unique character in this String is " + s.charAt(p));
        }

        System.out.print("The index is " + p);
    }
}
