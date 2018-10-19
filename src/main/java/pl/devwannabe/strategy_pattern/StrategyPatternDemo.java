package pl.devwannabe.strategy_pattern;

public class StrategyPatternDemo {


    public static void main(String[] args) {

        QuestContext killNedStark = new QuestContext("Kill Ned Stark");
        killNedStark.setQuestStrategy(new BloodStrategy());
        Knight gregorClegane = new Knight("Gregor Clegane", 30, killNedStark);
        System.out.println(gregorClegane + "\n");

        QuestContext findSecretDocuments = new QuestContext("Find secret documents");
        findSecretDocuments.setQuestStrategy(new FraudStrategy());
        Rogue rogueOne  = new Rogue("Rogue One", 25, findSecretDocuments);
        System.out.println(rogueOne + "\n");

        QuestContext doSomethingGood = new QuestContext("Do something good");
        doSomethingGood.setQuestStrategy(new PeaceStrategy());
        Priest goodMan  = new Priest("Good Man", 25, findSecretDocuments);
        System.out.println(goodMan + "\n");

    }

}