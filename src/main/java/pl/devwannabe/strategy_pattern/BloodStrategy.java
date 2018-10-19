package pl.devwannabe.strategy_pattern;

public class BloodStrategy implements QuestStrategy {

    @Override
    public void completeQuest() {
        System.out.println("Quest completed with a blood strategy:");
    }
}