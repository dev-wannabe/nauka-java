package pl.devwannabe.dependency_injection;

import pl.devwannabe.dependency_injection.armor.PlateArmor;
import pl.devwannabe.dependency_injection.wepon.Sword;

public class DependencyInjectionDemo {

    public static void main(String[] args) {

        Knight gregorClegane = new Knight("Gregor Clegane", 25, new Quest("Kill someone")
                , new Sword("Destiny sword", 20), new PlateArmor("Steel...", 30));

        Knight nedStark = new Knight("Ned Stark", 45);
        nedStark.setQuest(new Quest("Kill Gregor Clegane"));
        nedStark.setArmor(new PlateArmor("Steel wolf", 30));
        nedStark.setWepon(new Sword("Big one", 30));

        System.out.println(gregorClegane);
        System.out.println(nedStark);
    }

}