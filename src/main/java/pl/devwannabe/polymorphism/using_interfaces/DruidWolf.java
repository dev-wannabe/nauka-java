package pl.devwannabe.polymorphism.using_interfaces;

class DruidWolf implements Druid {

    private String formWolf = "Druid-wolf";

    @Override
    public void changeForm() {
        System.out.println(yellow() +
                "Druid changes into a wolf. \n" +
                resetColor());
    }

    void run() {
        System.out.println(formWolf +
                " runs and hunts the enemy of the forest.");
    }

    void attack() {
        System.out.println(formWolf +
                " attacks the enemy. \n");
    }
}