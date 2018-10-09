package pl.devwannabe.dependency_injection.wepon;

public class Axe implements Wepon {

    String name;
    int damage;

    public Axe(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}