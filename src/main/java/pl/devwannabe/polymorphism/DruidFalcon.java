package pl.devwannabe.polymorphism;


class DruidFalcon extends Druid {

    private String formFalcon = "Druid-falcon";

    @Override
    void changeForm() {
        System.out.println(YELLOW + super.form +
                " changes into a falcon. \n" + COLOR_RESET);
    }

    void fly() {
        System.out.println(formFalcon +
                " flies and looks out for the enemies of the forest.");
    }

    void land() {
        System.out.println(formFalcon +
                " spotted one and lands. \n");
    }

}