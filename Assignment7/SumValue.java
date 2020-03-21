public class SumValue
{
    private static volatile long Sum1;
    private static volatile long Sum2;
    private static volatile long Sum3;
    private static volatile long Sum4;

    // Description:
    //  To generate a random int array
    // Return:
    //  void
    //
    public static void generateRandomArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random() * 10);
        }
    }

    // Description:
    //  To calculate sum of array using multiple threads
    // Return:
    //  long sum
    //
    public static long sum(int[] arr) throws InterruptedException
    {
        Thread thread1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < arr.length / 4; i++)
                {
                    Sum1 += arr[i];
                    //System.out.println("Sum1 + (->" + i + ")" + arr[i] + " = " + Sum1);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int j = arr.length / 4; j < arr.length / 2; j++)
                {
                    Sum2 += arr[j];
                    //System.out.println("Sum2 + (->" + j + ")" + arr[j] + " = " + Sum2);
                }
            }
        });

        Thread thread3 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int a = arr.length / 2; a < 3 * arr.length / 4; a++)
                {
                    Sum3 += arr[a];
                    //System.out.println("Sum3 + (->" + a + ")"  + arr[a] + " = " + Sum3);
                }
            }
        });

        Thread thread4 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int b = 3 * arr.length / 4; b < arr.length; b++)
                {
                    Sum4 += arr[b];
                    //System.out.println("Sum4 + (->" + b + ")"  + arr[b] + " = " + Sum4);
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try
        {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return Sum1 + Sum2 + Sum3 + Sum4;
    }

    public static void main(String[] args) throws InterruptedException
    {
        int[] arr = new int[4000000];
        generateRandomArray(arr);
        long sum = sum(arr);
        System.out.println("Sum: " + sum);
    }
}
