public class Assignment5_5
{
    // Description:
    //  Rotate a n*n 2D matrix by 90 degrees(clockwise)
    // Return:
    //  void
    //
    public static void rotate(int[][] matrix)
    {
        int i = 0;
        while (i < matrix.length / 2)
        {
            rotateRecursion(matrix, i, i);
            i++;
        }
    }

    // Description:
    //  Rotate every shell of a n*n 2D matrix by 90 degrees(clockwise)
    // Return:
    //  void
    //
    public static void rotateRecursion(int[][] matrix, int i, int j)
    {
        for (int index1 = i; index1 < matrix.length - i - 1; index1++)
        {
            int count = 0, index2 = j, temp = matrix[index1][index2];
            while (count < 4)
            {
                int temp1 = matrix[index2][matrix.length - index1 - 1];
                matrix[index2][matrix.length - index1 - 1] = temp;
                temp = temp1;
                count++;
                int indexTemp = index1;
                index1 = index2;
                index2 = matrix.length - indexTemp - 1;
            }
        }
    }

    public static void display(int[][] matrix)
    {
        System.out.println("[");
        for (int i = 0; i < matrix.length; i++)
        {
            System.out.print(" [ ");
            for (int j = 0; j < matrix.length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println("]");
    }

    public static void main(String[] args)
    {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Before rotating: ");
        display(matrix);
        System.out.println("After rotating: ");
        rotate(matrix);
        display(matrix);
    }
}
