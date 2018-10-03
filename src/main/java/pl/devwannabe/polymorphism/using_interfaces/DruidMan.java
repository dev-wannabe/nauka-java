package pl.devwannabe.polymorphism.using_interfaces;

public class DruidMan implements Druid {

    private String form = "Druid-Man";

    @Override
    public void changeForm() {
        System.out.println(yellow() +
                "Druid changes into a man. \n" + resetColor());
    }

    void walk () {
        System.out.println(form +
        " walks around and stay calm.");
    }

}