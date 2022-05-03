public class Italian extends Person{

    public Italian(String name, String sex, String nationality, String job) {
        super(name, sex, Religion.CATHOLIC, Language.ITALIAN, nationality, job, ResidenceCountry.ITALY);
    }

    @Override
    public void sayHello() {
        System.out.println("Ciao!");
    }





}
