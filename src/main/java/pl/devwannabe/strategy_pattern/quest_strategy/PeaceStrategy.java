package pl.devwannabe.strategy_pattern.quest_strategy;

public class PeaceStrategy implements Strategy {

    @Override
    public void completeQuest() {
        System.out.println("OK, the peace strategy has been loaded. \nThe quest was completed.");
    }

}