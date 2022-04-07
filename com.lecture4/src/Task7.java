import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Original order of list1: " + list1);

        for (int i = 0, j = list1.size() - 1; i < j; i++) {
            list1.add(i, list1.remove(j));
        }
        System.out.println("Reversed order of list1: " + list1);
    }

}



