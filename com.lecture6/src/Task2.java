import java.text.DecimalFormat;

public class Task2 {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        System.out.println("The average of the numbers is " + df.format(findAverage(5,3, 5)));
    }

    public static double findAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
