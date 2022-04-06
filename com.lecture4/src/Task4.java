import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int[] integers = {4, 5, 6, 4, 8, 2, 10, 54, 101};
        int biggestNumber = integers[0];

        for (int i = 1; i < integers.length; i++) {
            if(integers[i] > biggestNumber) {
                biggestNumber = integers[i];
            }
        }

        System.out.println("The biggest number in array " + Arrays.toString(integers) + " is " + biggestNumber);

    }
}
