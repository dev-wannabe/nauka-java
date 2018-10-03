package pl.devwannabe.polymorphism.using_inheritance;


class Druid {

    static final String YELLOW = "\u001B[33m";
    static final String COLOR_RESET = "\u001B[0m";
    String form = "druid";

    void changeForm() {
        System.out.println(YELLOW + form +
                " changes into a man and stay calm." + COLOR_RESET);
    }

}