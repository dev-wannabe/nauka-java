package pl.devwannabe.strategy_pattern;

public class QuestContext {
    private String description;
   // private QuestStrategy questStrategy;

    public QuestContext(String description) {
        this.description = description;
    }

    public void setQuestStrategy(QuestStrategy questStrategy) {
      //  this.questStrategy = questStrategy;
        questStrategy.completeQuest();
    }

    @Override
    public String toString() {
        return description;
    }
}
