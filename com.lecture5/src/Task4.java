import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int[] numArray = {4, 5, 1, 200, 3, 20 , 100, 12};
        System.out.println("The array: " + Arrays.toString(numArray));
        System.out.println("Biggest number in the array is: " + findBiggestNum(numArray));

    }

    public static int findBiggestNum(int[] numArray) {
        Arrays.sort(numArray);
        return numArray[numArray.length - 1];
    }
}
