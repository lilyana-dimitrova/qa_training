import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double unitPrice;
        int quantity;
        double revenue;
        double discountPercentage;
        double discountTotal;
        Scanner scanner;

        scanner = new Scanner(System.in);

        System.out.println("Enter unit price: ");
        unitPrice = scanner.nextDouble();

        System.out.println("Enter quantity: ");
        quantity = scanner.nextInt();

        if(quantity >= 100 && quantity <= 120) {
            discountPercentage = 0.15;

        } else if(quantity > 120) {
            discountPercentage = 0.20;
        } else {
            discountPercentage = 0.00;
        }

        discountTotal = discountPercentage * (unitPrice * quantity);
        revenue = (unitPrice * quantity) - discountTotal;

        System.out.println("The revenue from sale: " + revenue + "$");
        System.out.println("Discount: " + discountTotal + "$(" + (discountPercentage * 100) + "%)");



    }


}
