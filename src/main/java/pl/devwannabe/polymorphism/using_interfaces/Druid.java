package pl.devwannabe.polymorphism.using_interfaces;


interface Druid {

    void changeForm();

    default String yellow() {
        return "\u001B[33m";
    }

    default String resetColor() {
        return "\u001B[0m";
    }

}