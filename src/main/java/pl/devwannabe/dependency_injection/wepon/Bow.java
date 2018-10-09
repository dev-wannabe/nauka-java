package pl.devwannabe.dependency_injection.wepon;

public class Bow implements Wepon {

    String name;
    int damage;

    public Bow(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}
