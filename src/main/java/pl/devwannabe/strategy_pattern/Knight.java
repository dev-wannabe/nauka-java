package pl.devwannabe.strategy_pattern;

public class Knight {

    private String name;
    private int age;
    private Quest quest;

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

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", quest=" + quest +
                '}';
    }
}
