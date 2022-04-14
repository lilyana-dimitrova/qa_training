import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        int[][] matrix = new int[4][4];

        matrix[0][0] = 1;
        matrix[0][1] = 1;
        matrix[0][2] = 1;
        matrix[0][3] = 1;

        matrix[1][0] = 2;
        matrix[1][1] = 2;
        matrix[1][2] = 2;
        matrix[1][3] = 2;

        matrix[2][0] = 3;
        matrix[2][1] = 3;
        matrix[2][2] = 3;
        matrix[2][3] = 3;

        matrix[3][0] = 4;
        matrix[3][1] = 4;
        matrix[3][2] = 4;
        matrix[3][3] = 4;

        System.out.println("The array to be calculated: ");
        Task2.printMatrix(matrix);
        System.out.println("The sum of the principal diagonal is " + calculateDiagonal(matrix));


    }

    public static int calculateDiagonal(int[][] matrix) {
        int diagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i == j) {
                    diagonalSum += matrix[i][j];
                }
            }
        }
        return diagonalSum;
    }
}
