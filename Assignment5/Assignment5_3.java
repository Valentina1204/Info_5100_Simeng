public class Assignment5_3
{
    // Description:
    //  Move all zero to the end of an integer array
    // Return:
    //  void
    //
    public static void moveAllZeroToEnd(int[] nums)
    {
        int index = 0;
        for (int j = 1; j < nums.length; j++)
        {
           if (nums[index] == 0 && nums[j] !=0)
           {
               int temp = nums[index];
               nums[index] = nums[j];
               nums[j] = temp;
               index++;
           }
        }
    }

    public static void display(int[] nums)
    {
        System.out.print("[ ");
        for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.print("]");
    }

    public static void main(String[] main)
    {
       int[] nums = {0,1,0,3,0,6,0,12,0,0,0};
       System.out.print("Before move: ");
       display(nums);
       System.out.println();
       System.out.print("After move: ");
       moveAllZeroToEnd(nums);
       display(nums);
    }
}
