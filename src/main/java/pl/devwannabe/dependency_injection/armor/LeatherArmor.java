package pl.devwannabe.dependency_injection.armor;

public class LeatherArmor implements Armor {

    String name;
    int armor;

    public LeatherArmor(String name, int armor) {
        this.name = name;
        this.armor = armor;
    }
}
