package pl.devwannabe.dependency_injection;

import pl.devwannabe.dependency_injection.armor.Armor;
import pl.devwannabe.dependency_injection.wepon.Wepon;

public class Knight {

    private String name;
    private int age;
    private Quest quest;

    Armor armor;
    Wepon wepon;

    public Knight() {
        this.name = name;
        this.age = age;
    }

    public Knight(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Knight(String name, int age, Quest quest) {
        this.name = name;
        this.age = age;
        this.quest = quest;
    }

    public Knight(String name, int age, Quest quest, Wepon wepon) {
        this.name = name;
        this.age = age;
        this.quest = quest;
        this.wepon = wepon;
    }

    public Knight(String name, int age, Quest quest, Wepon wepon, Armor armor) {
        this.name = name;
        this.age = age;
        this.quest = quest;
        this.wepon = wepon;
        this.armor = armor;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWepon(Wepon wepon) {
        this.wepon = wepon;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", quest=" + quest +
                ", armor=" + armor +
                ", wepon=" + wepon +
                '}';
    }
}