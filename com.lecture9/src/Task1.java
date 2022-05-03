public class Task1 {

    public static void main(String[] args) {

        Person person = new Person("Elizabeth",
                "Female",
                Religion.CATHOLIC,
                Language.ENGLISH,
                "British",
                "Accountant",
                ResidenceCountry.USA
                );

        person.sayHello();

        System.out.println(person.EGN);
        System.out.println(person.age);
        System.out.println(person.DOB);
        System.out.println(person.isAdult());

        Bulgarian person2 = new Bulgarian("Georgi",
                "male",
                "Bulgarian",
                "Guard");

        person2.sayHello();

        Italian person3 = new Italian("Geronimo",
                "Male",
                "Italian",
                "Pizza maker");

        Child baby = new Child("Koko",
                "male",
                Language.BULGARIAN,
                "Bulgarian",
                ResidenceCountry.ITALY);

        baby.sayHello();

    }



}
