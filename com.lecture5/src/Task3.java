import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        int totalElements;

        System.out.println("Please enter number of rows: ");
        rows = scanner.nextInt();

        System.out.println("Please enter number of columns: ");
        columns = scanner.nextInt();
        totalElements = rows * columns;

        System.out.println("Please enter " + totalElements + " numbers separated by Enter: ");

        int[][] numArray = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numArray[i][j] = scanner.nextInt();
            }
        }

        System.out.println("2D array created: ");
        Task2.printMatrix(numArray);

    }

}
