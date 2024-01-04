
//Program to find the frequency of odd & even numbers in the given matrix
import java.util.Scanner;
class freq{
    public static void main(String arg[])
    {
       Scanner s = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = s.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = s.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        int odd =0, even=0;
        for(int i=0;i < rows;i++)
        {
            for(int j=0;j < columns;j++)
            {
                if(matrix[i][j]%2==0)
                even++;
                else odd++;

            }
        }

        System.out.println("Given Matrix: ");
        for(int i=0;i < rows;i++)
        {
            for(int j=0;j < columns;j++)
            {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println("");
        }

        System.out.println("Frequency of even numbers: "+even);
        System.out.println("Frequency of odd numbers: "+odd);

    }
}
