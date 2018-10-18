package pl.devwannabe.strategy_pattern;

public class Quest {
    private String description;
    private QuestStrategy questStrategy;

    public Quest(String description, QuestStrategy questStrategy) {
        this.description = description;
        this.questStrategy = questStrategy;
    }

    @Override
    public String toString() {
        return description;
    }
}
