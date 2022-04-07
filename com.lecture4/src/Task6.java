import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task6 {


    public static void main(String[] args) {

        int[] numArray = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        System.out.println("The initial array is: " + Arrays.toString(numArray));

        for (int i : numArray) {
            if(i > 150) {
                break;
            } else if (i % 5 == 0) {
                System.out.println(i + " is divisible by 5");
            }
        }
    }
}
