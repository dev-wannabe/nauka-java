package pl.devwannabe.strategy_pattern;

public class Rogue {

    private String name;
    private int age;
    private QuestContext questContext;

    public Rogue() {

    }

    public Rogue(String name, int age, QuestContext questContext) {
        this.name = name;
        this.age = age;
        this.questContext = questContext;
    }

    @Override
    public String toString() {
        return "Rogue{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", questContext=" + questContext +
                '}';
    }
}
