package pl.devwannabe.strategy_pattern.quest_strategy;

public class BloodStrategy implements Strategy {

    @Override
    public void completeQuest() {
        System.out.println("OK, the blood strategy has been loaded.\n" +
                "The quest was completed.");
    }

}