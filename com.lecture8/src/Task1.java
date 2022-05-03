import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Task1 {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("##.##", new DecimalFormatSymbols(Locale.ENGLISH));


        Circle s1 = new Circle();
        System.out.println("S1 circle created: ");
        System.out.println("S1 area: "  + df.format(s1.getArea(3)));
        System.out.println(s1);

        Shape s2 = new Circle(); // Upcast Circle to Shape
        System.out.println("S2 area: "  + df.format(s2.getArea(3.0)));
        System.out.println(s2);

        Circle s3 = (Circle) s2; // Downcast back to Circle
        System.out.println(s3);
        System.out.println("S3 area: "  + df.format(s2.getPerimeter(3.0)));



        Square s5 = new Square();
        System.out.println("S5 area: " + df.format(s5.getArea(6.0)));
        System.out.println("S5 perimeter: " + df.format(s5.getPerimeter(6.0)));

    }

}
