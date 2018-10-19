package pl.devwannabe.strategy_pattern;

public class Priest {

    private String name;
    private int age;
    private QuestContext questContext;

    public Priest() {

    }

    public Priest(String name, int age, QuestContext questContext) {
        this.name = name;
        this.age = age;
        this.questContext = questContext;
    }

    @Override
    public String toString() {
        return "Priest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", questContext=" + questContext +
                '}';
    }
}
