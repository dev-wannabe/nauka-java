package pl.devwannabe.strategy_pattern;

import pl.devwannabe.strategy_pattern.quest_strategy.BloodStrategy;
import pl.devwannabe.strategy_pattern.quest_strategy.PeaceStrategy;
import pl.devwannabe.strategy_pattern.quest_strategy.Strategy;

public class StrategyClientDemo {

    public static void main(String[] args) {
        final String BLUE = "\u001B[34m";
        final String RESET_COLOR = "\u001B[0m";

        StrategyClientDemo strategyClientDemo = new StrategyClientDemo();

        System.out.println(BLUE + "===================================================================" + RESET_COLOR);

        Knight gregorClegane = new Knight("Gregor Clegane", new Quest("Kill someone good or bad"));
        strategyClientDemo.knightInAction(gregorClegane, new BloodStrategy());

        System.out.println(BLUE + "===================================================================" + RESET_COLOR);

        Knight nedStark = new Knight("Ned Stark", new Quest("Go and talk with wife"));
        strategyClientDemo.knightInAction(nedStark, new PeaceStrategy());

        System.out.println(BLUE + "===================================================================" + RESET_COLOR);

        nedStark.setQuest(new Quest("Go and cut the head off"));
        strategyClientDemo.knightInAction(nedStark, () -> System.out.println("Quest completed with a 'bloody' lambda strategy"));

        System.out.println(BLUE + "===================================================================" + RESET_COLOR);
    }

    private void knightInAction(Knight knight, Strategy strategy) {
        System.out.println("Here is a Knight with quest to do:\n" + knight + "\n" +
                "He will need the proper strategy.");
        knight.setStrategy(strategy);
    }

}