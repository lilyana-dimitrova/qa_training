public class Car {

     String name;
     String color;
     int releaseYear;
     int horsePower;
     boolean secondHand;

    // 1. Create a car by provided name / color / release year / horse power / second hand
    public Car(String name, String color, int releaseYear, int horsePower, boolean secondHand) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;
    }

   // 2. Create a car by provided name / color / second hand
    public Car(String name, String color, boolean secondHand) {
        this.name = name;
        this.color = "N/A";
        this.releaseYear = -1;
        this.horsePower = -1;
        this.secondHand = secondHand;
    }

    // 3. Create a car by provided name / color / release year / horsepower
    public Car(String name, String color, int releaseYear, int horsePower) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = false;
    }

    // 4. Create a car by provided name / release year / horsepower / second hand
    public Car(String name, int releaseYear, int horsePower, boolean secondHand) {
        this.name = name;
        this.color = "N/A";
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;
    }

    // 5. Create a car by provided nothing
    public Car() {
        this.name = "N/A";
        this.color = "N/A";
        this.releaseYear = -1;
        this.horsePower = -1;
        this.secondHand = false;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Audi TT", "silver", 2008, 200, true);
        Car car2 = new Car("Toyota Corolla", "blue", true);
        Car car3 = new Car("Jaguar F-Type", "red", 2021, 450);
        Car car4 = new Car("Fiat Panda", 2007, 90, false);
        Car car5 = new Car();
    }

}
