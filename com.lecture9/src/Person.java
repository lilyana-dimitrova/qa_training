import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {

    final String name;
    final String sex;
    final Religion religion;
    final Language spokenLanguage;
    String job;
    final String nationality;
    final String EGN;
    final String DOB;
    final int age;
    ResidenceCountry residenceCountry;

    public Person(String name, String sex, Religion religion, Language spokenLanguage, String nationality, String job, ResidenceCountry residenceCountry) {
        this.name = name;
        this.sex = sex;
        this.religion = religion;
        this.spokenLanguage = spokenLanguage;
        this.nationality = nationality;
        this.job = job;
        this.residenceCountry = residenceCountry;
        EGN = createEGN();
        age = calculateAge();
        DOB = calculateDOB();
    }

    public String createEGN(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 digit EGN: ");
        String input = scanner.nextLine();

        if(input.chars().count() != 10){
            throw new InputMismatchException("EGN must be exactly 10 digits! You have entered " + input.chars().count() + " digits");
        }
        return input;
    }

    public int calculateAge() {

        int age = Integer.parseInt(EGN.substring(0, 2));
        String year;
        if(age >= 0 && age <= 22) {
            year = "20" + EGN.substring(0, 2);
        } else {
            year = "19" + EGN.substring(0, 2);
        }
        return 2022 - Integer.parseInt(year);
    }

    public String calculateDOB(){
        String yearOfBirth = EGN.substring(0,2);
        String monthOfBirth = EGN.substring(2,4);
        String dayOfBirth = EGN.substring(4,6);

        return dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth;

    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void celebrateEaster() {
        if(religion == Religion.ISLAM) {
            System.out.println("Does not celebrate Easter");
        } else {
            System.out.println("Happy Easter!");
        }

    }

    public boolean isAdult() {

        if(age >= 18 && residenceCountry != ResidenceCountry.USA) {
                return true;
        } else if( age < 21 && residenceCountry == ResidenceCountry.USA) {
            return false;
        }
        return true;
    }

    public boolean canTakeLoan() {
        return job != null;
    }



}
