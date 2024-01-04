
//Write a Java Program to Display Transpose Matrix
class oneHundredThree {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter the number of rows: ");
            int rows = Integer.parseInt(input.readLine());

            System.out.print("Enter the number of columns: ");
            int columns = Integer.parseInt(input.readLine());

            int[][] matrix = new int[rows][columns];
            System.out.println("Enter the elements of the matrix:");

            for (int i = 0; i < rows; i++) {
                System.out.print("Enter elements for row " + (i+1) + " : ");
                String[] elements = input.readLine().split(" ");
                for (int j = 0; j < columns; j++) 
                    matrix[i][j] = Integer.parseInt(elements[j]);
            }

            int[][] transposeMatrix = transposeMatrix(matrix);

            System.out.println("Transpose Matrix:");
            for (int[] i : transposeMatrix) {
                for (int j : i) 
                    System.out.print(j + " ");
                System.out.println();
            }
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, columns = matrix[0].length;
        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < rows; i++) 
            for (int j = 0; j < columns; j++) 
                transpose[j][i] = matrix[i][j];

        return transpose;
    }
}