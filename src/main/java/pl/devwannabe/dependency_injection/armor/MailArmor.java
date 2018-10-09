package pl.devwannabe.dependency_injection.armor;

public class MailArmor implements Armor{

    String name;
    int armor;

    public MailArmor(String name, int armor) {
        this.name = name;
        this.armor = armor;
    }
}
