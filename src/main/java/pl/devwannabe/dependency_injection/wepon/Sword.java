package pl.devwannabe.dependency_injection.wepon;

public class Sword implements Wepon {

    String name;
    int damage;

    public Sword(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}
