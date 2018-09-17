package pl.devwannabe.enums;

import java.util.*;

public class EnumSample {

    Set<HeroCard> heroCardsEnumSet = EnumSet.allOf(HeroCard.class);

    /**
     * EnumMapy mają klucze zawsze typu Enum, a wartości
     * dowolnego typu. W konstruktorze EnumMap musi się znajdować
     * typ Enuma z rozszerzeniem class
     */
    EnumMap<HeroCard, String> heroCardsEnumMap = new EnumMap<>(HeroCard.class);

    void showCardsWithOrdinals() {
        heroCardsEnumSet.forEach(hero -> System.out.println(hero.ordinal() + " " + hero));
        System.out.println();
    }

    void showCardsWithStats() {
        loadMap();
        heroCardsEnumMap.forEach((k, v) -> System.out.println(k + "\n" + v));
        System.out.println();
        heroCardsEnumMap.clear();
    }

    void showCardsWithStatsAndDescription() {
        loadMap();
        for (Map.Entry<HeroCard, String> hero : heroCardsEnumMap.entrySet()) {
            System.out.println(hero.getKey() + "\n" + hero.getValue());
            hero.getKey().comment();
            System.out.println();
        }
        heroCardsEnumMap.clear();
    }

    void showSingleCardWithStatsAndDescription(HeroCard heroCard) {
        loadMap();
        System.out.println(heroCard.name() + "\n" + heroCardsEnumMap.get(heroCard));
        heroCardsEnumMap.clear();
    }

    private void loadMap() {
        heroCardsEnumSet.forEach(heroCard -> heroCardsEnumMap.put(heroCard,
                "Strength: " + heroCard.getStrength()
                        + ", Intelligence: " + " " + heroCard.getIntelligence()
                        + ", Speed: " + " " + heroCard.getSpeed()));
    }
}