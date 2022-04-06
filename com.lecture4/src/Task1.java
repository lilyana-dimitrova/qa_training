import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userInput;

        while(true) {

            System.out.println("Please enter a number between 1 and 7: ");
            userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("The " + userInput + "-st day of the week is Monday");
                    break;
                case 2:
                    System.out.println("The " + userInput + "-nd day of the week is Tuesday");
                    break;
                case 3:
                    System.out.println("The " + userInput + "-rd day of the week is Wednesday");
                    break;
                case 4:
                    System.out.println("The " + userInput + "-th day of the week is Thursday");
                    break;
                case 5:
                    System.out.println("The " + userInput + "-th day of the week is Friday");
                    break;
                case 6:
                    System.out.println("The " + userInput + "-th day of the week is Saturday");
                    break;
                case 7:
                    System.out.println("The " + userInput + "-th day of the week is Sunday");
                    break;
                case 0:
                    System.out.println("Bye bye");
                    System.exit(0);
                default:
                    System.out.println("This is not a valid input. Please try again.");
            }
        }
    }
}
