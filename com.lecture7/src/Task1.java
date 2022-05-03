import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter X: ");


        try {
            firstNumber = scanner.nextInt();
        } catch (Exception e) {
            throw new IllegalArgumentException("Input must be integer");
        }

        System.out.println("Please enter Y: ");

        try {
            secondNumber = scanner.nextInt();
        } catch (Exception e) {
            throw new IllegalArgumentException("Input must be integer");
        }

        if (secondNumber == 0) {
            throw new IllegalArgumentException("Input should not be zero");
        } else {
            System.out.println("X divided by Y: " + firstNumber / secondNumber);
        }

    }


}
