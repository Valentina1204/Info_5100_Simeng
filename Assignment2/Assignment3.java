package assignment2;
import java.util.Scanner;

public class Assignment3
{
    // Description:
    //  Add each digit until the sum of digits is a single digit
    // Return:
    //  void
    //
    public static void addDigits (int input)
    {
        int sum = 0;
        int digitNumber = 1;
        int num = input;

        if (input >= 0 && input <= 9)
        {
            System.out.print("result = " + input);
        }
        else
        {
            // Calculate how many digit number in input number
            //
            while (num >= 10)
            {
                num = num / 10;
                digitNumber++;
            }

            // Create an array of numbers and its length is equal to digitNumber
            //
            int []a = new int[digitNumber];

            while (input >= 10)
            {
                int i = 0;

                // Calculate every digit
                //
                while (input >= 10)
                {
                    a[i] = input % 10;
                    input = input / 10;
                    sum = sum + a[i];
                    i++;
                }

                sum = sum + input;
                System.out.print("sum = " + input);
                for (int n = i-1; n >= 0; n--)
                {
                    System.out.print(" + "+ a[n]);
                }

                System.out.println(" = " + sum);
                if (sum < 10)
                {
                    System.out.print("result = " + sum);
                    break;
                }
                else
                {
                    input = sum;
                    sum = 0;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Please input number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        addDigits(input);
    }
}
