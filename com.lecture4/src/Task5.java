import java.util.Scanner;

public class Task5 {

    public static final String BEACH = "Beach";
    public static final String MOUNTAIN = "Mountain";
    public static final String BG_MSG = "Bulgaria is the place for you";
    public static final String NOT_BG_MSG = "Outside Bulgaria would be better for you";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a vacation type (Beach / Mountain): ");

        String answer = scanner.next();
        System.out.println("Please enter budget per day per person: ");

        double dailyBudget = scanner.nextDouble();

        if(answer.equals(BEACH) && dailyBudget <= 50) {
            System.out.println(BG_MSG);
        } else if(answer.equals(BEACH)&& dailyBudget > 50) {
            System.out.println(NOT_BG_MSG);
        } else if(answer.equals(MOUNTAIN) && dailyBudget <= 30) {
            System.out.println(BG_MSG);
        } else if(answer.equals(MOUNTAIN) && dailyBudget > 30) {
            System.out.println(NOT_BG_MSG);
        } else {
            System.out.println("Something's not right");
        }
    }
}
