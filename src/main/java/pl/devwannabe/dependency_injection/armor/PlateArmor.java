package pl.devwannabe.dependency_injection.armor;

public class PlateArmor implements Armor {

    String name;
    int armor;

    public PlateArmor(String name, int armor) {
        this.name = name;
        this.armor = armor;
    }
}
