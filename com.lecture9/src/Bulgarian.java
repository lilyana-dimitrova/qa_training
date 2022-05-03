public class Bulgarian extends Person{

    public Bulgarian(String name, String sex, String nationality, String job) {
        super(name, sex, Religion.ORTHODOX, Language.BULGARIAN, nationality, job, ResidenceCountry.BULGARIA);
    }

    @Override
    public void sayHello() {
        System.out.println("Здравейте");
    }

}
