import java.util.Arrays;

public class Task6 {


    public static void main(String[] args) {

        int[] numArray = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        System.out.println("The initial array is: " + Arrays.toString(numArray));

        for (int i : numArray) {
            if (i % 5 == 0 && i <= 150) {
                System.out.println(i + " is divisible by 5");
            }
        }
    }
}
