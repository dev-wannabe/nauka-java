package pl.devwannabe.polymorphism.using_interfaces;


class DruidFalcon implements Druid {

    private String form = "Druid-falcon";

    @Override
    public void changeForm() {
        System.out.println(yellow() +
                "Druid changes into a falcon. \n" + resetColor());
    }

    void fly() {
        System.out.println(form +
                " flies and looks out for the enemies of the forest.");
    }

    void land() {
        System.out.println(form +
                " spotted one and lands. \n");
    }

}