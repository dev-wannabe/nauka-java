package pl.devwannabe.polymorphism.using_interfaces;


class DruidFalcon implements Falcon {

    private String form = "Druid-falcon";

    @Override
    public void changeForm() {
        System.out.println(YELLOW +
                "Druid changes into a "+ form + ". \n" +
                RESET_COLOR);
    }

    @Override
    public void fly() {
        System.out.println(form +
                " flies and looks out for the enemies of the forest.");
    }

    @Override
    public void land() {
        System.out.println(form +
                " spotted one and lands. \n");
    }

}