package pl.devwannabe.strategy_pattern;

import pl.devwannabe.strategy_pattern.quest_strategy.Strategy;

public class Knight {

    private String name;
    private Quest quest;

    public Knight(String name, Quest quest) {
        this.name = name;
        this.quest = quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public void setStrategy(Strategy strategy) {
        strategy.completeQuest();
    }

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + name + '\'' +
                ", quest=" + quest +
                '}';
    }
}

