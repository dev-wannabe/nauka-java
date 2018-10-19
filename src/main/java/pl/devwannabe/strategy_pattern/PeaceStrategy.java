package pl.devwannabe.strategy_pattern;

public class PeaceStrategy implements QuestStrategy{

    @Override
    public void completeQuest() {
        System.out.println("Quest completed with a peaceful strategy:");
    }
}
