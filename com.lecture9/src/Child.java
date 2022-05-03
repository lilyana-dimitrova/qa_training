public class Child extends Person{

    public Child(String name, String sex, Language spokenLanguage, String nationality, ResidenceCountry residenceCountry) {
        super(name, sex, Religion.UNDEFINED, spokenLanguage, nationality, "N/A", residenceCountry);
    }

    @Override
    public boolean isAdult() {
        return false;
    }

    @Override
    public boolean canTakeLoan() {
        return false;
    }

    @Override
    public void sayHello() {
        System.out.println("Gu gu ga ga");
    }


}
