import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape {



    public Circle() {
    }


    @Override
    public double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}



    /*@Override
    public BigDecimal getArea() {
        return radius.pow(2)
                .multiply(BigDecimal.valueOf(Math.PI))
                .setScale(2, RoundingMode.CEILING);
    }

    @Override
    public BigDecimal getParameter() {
        return radius.multiply(BigDecimal.valueOf(2))
                .multiply(BigDecimal.valueOf(Math.PI))
                .setScale(2, RoundingMode.CEILING);
    }*/

