public class MyIndexOutOfBoundException extends IndexOutOfBoundsException
{
    protected int lowerBound;
    protected int upperBound;
    protected int index;

    // Default Constructor
    //
    MyIndexOutOfBoundException()
    {
    }

    // Constructor with parameters
    //
    MyIndexOutOfBoundException(int lowerBound, int upperBound, int index)
    {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.index = index;
    }

    @Override
    public String toString()
    {
        return ("Error Message: Index: " + index + ", but Lower bound: " + lowerBound + ", Upper bound: " + upperBound);
    }

    public static void main(String[] args) throws IndexOutOfBoundsException
    {
        int[] arr = {1,2,3,4,5,6};
        for (int i = 0; i < 10; i++)
        {
            try
            {
                System.out.print(arr[i] + " ");
            }
            catch (IndexOutOfBoundsException e)
            {
                throw new MyIndexOutOfBoundException(0, arr.length - 1, i);
            }
        }
    }
}
