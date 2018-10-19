package pl.devwannabe.strategy_pattern;

public class Knight {

    private String name;
    private int age;
    private QuestContext questContext;

    public Knight() {
        this.name = name;
        this.age = age;
    }

    public Knight(String name, int age, QuestContext questContext) {
        this.name = name;
        this.age = age;
        this.questContext = questContext;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", questContext=" + questContext +
                '}';
    }
}
