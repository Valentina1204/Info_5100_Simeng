package assignment2;
import java.util.*;

public class Assignment2
{
    public static void main(String[] args)
    {
        // Define an ArrayList
        //
        ArrayList<Integer> a = new ArrayList<Integer>();
        System.out.println("Please input an int array:(example:[x,x,x,x,xx,xx])");

        // Input a String then migrate each number to int type and add to ArrayList
        //
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // To make sure the last number can be migrated and added to ArrayList whatever the input format is
        //
        input = input.concat(";");
        String snum = "";
        int  b = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int p = 0; p < input.length(); p++)
        {
            char c = input.charAt(p);
            if (c >= '0' && c <= '9')
            {
                snum = snum + c;
            }
            else
            {
                if (!snum.equals("")) {
                    b = Integer.parseInt(snum);
                    a.add(b);
                    snum = "";
                    if (b > max) {
                        max = b;
                    }

                    if (b < min) {
                        min = b;
                    }
                }
            }
        }

        System.out.print("The array is: ");
        System.out.println(a);
        System.out.println("Max is "+ max +" and Min is "+ min);
    }
}
