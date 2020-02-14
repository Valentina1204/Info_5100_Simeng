import java.util.Scanner;

public class Assignment5_2
{
    // Description:
    //  Print every digit of input
    // Return:
    //  int sum
    //
    public static int PrintSum (int input, int iter)
    {
        if (input == 0)
        {
            return 0;
        }
        else
        {
            int remaining  = input % 10;
            int restSum = PrintSum(input / 10, iter + 1);

            System.out.print(remaining);
            if (iter > 0)
            {
                System.out.print(" + ");
            }

            return remaining + restSum;
        }
    }

    // Description:
    //  Add all digit of input until sum is a single digit
    // Return:
    //  void
    //
    public static void addDigits (int input)
    {
        if (input >= 0 && input <= 9)
        {
            System.out.println("result = " + input );
            return;
        }
        else
        {
            System.out.print("sum = ");
            int res = PrintSum(input, 0);
            System.out.println(" = " + res);
            addDigits(res);
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
