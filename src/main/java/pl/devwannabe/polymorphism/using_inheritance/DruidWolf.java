package pl.devwannabe.polymorphism.using_inheritance;

class DruidWolf extends Druid {

    private String formWolf = "Druid-wolf";

    @Override
    void changeForm() {
        System.out.println(YELLOW +
                super.form +
                " changes into a wolf. \n" +
                COLOR_RESET);
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