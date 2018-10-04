package pl.devwannabe.polymorphism.using_interfaces;

public class DruidMan implements Man {

    private String form = "Druid-Man";

    @Override
    public void changeForm() {
        System.out.println(YELLOW +
                "Druid changes into a " + form + ". \n" +
                RESET_COLOR);
    }

    @Override
    public void walk() {
        System.out.println(form +
                " walks around and stay calm.");
    }

}