import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int inputAge = scanner.nextInt();

            if (inputAge >= 16) {
                System.out.println("You are eligible for work.");
            } else {
                System.out.println("You are not eligible for work.");
            }
    }
}
