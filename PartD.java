import java.util.Scanner;

public class PartD
{
    // Description:
    //  To find the index of element in an array closest to target
    // Return:
    //  int index
    //
    public static int indexCloseToTarget(int[] nums, int target) throws Exception
    {
        int diff = Integer.MAX_VALUE, index = -1;

        if (nums.length == 0)
        {
            throw new Exception();
        }
        else
        {
            for (int i = 0; i < nums.length; i++)
            {
                if (diff > Math.abs(nums[i] - target))
                {
                    diff = Math.abs(nums[i] - target);
                    index = i;
                }
            }
        }

        return index;
    }

    public static void main(String[] args)
    {
        int[] nums = {1,3,5,6};
        System.out.println("Please input int target value: ");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();

        try
        {
            System.out.println("The index of element in array closed to the target is :" + indexCloseToTarget(nums, target));
        }
        catch (Exception e)
        {
            System.out.println("The array is empty, please retry.");
        }
    }
}
