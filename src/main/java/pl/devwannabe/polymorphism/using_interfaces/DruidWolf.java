package pl.devwannabe.polymorphism.using_interfaces;

class DruidWolf implements Wolf {

    private String form = "Druid-wolf";

    @Override
    public void changeForm() {
        System.out.println(YELLOW +
                "Druid changes into a " + form + ". \n" +
                RESET_COLOR);
    }

    @Override
    public void run() {
        System.out.println(form +
                " runs and hunts the enemy of the forest.");
    }

    @Override
    public void attack() {
        System.out.println(form +
                " attacks the enemy. \n");
    }
}