import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int[] numArray = {4, 5, 6 ,4, 8, 2, 3, 6};
        int sum = 0;

        for (int j : numArray) {
            sum += j;
        }

        System.out.println("The sum of the array elements is " + sum);

    }
}
