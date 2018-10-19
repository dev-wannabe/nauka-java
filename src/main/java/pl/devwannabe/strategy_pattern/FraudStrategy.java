package pl.devwannabe.strategy_pattern;

public class FraudStrategy implements QuestStrategy {

    @Override
    public void completeQuest() {
        System.out.println("quest completed with a fraud strategy:");
    }
}
