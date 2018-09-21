package pl.devwannabe.enums;

public class EnumApp {

    public static void main(String[] args) {

        final String BLUE = "\u001B[34m";
        final String RESET_COLOR = "\u001B[0m";

        EnumSample enumSample = new EnumSample();
        HeroCard heroCard = HeroCard.GREGOR_CLEGANE;

        System.out.println(BLUE + "===================================================================" + RESET_COLOR);
        enumSample.showCardsWithOrdinals();
        System.out.println(BLUE + "===================================================================" + RESET_COLOR);
        enumSample.showCardsWithStats();
        System.out.println(BLUE + "===================================================================" + RESET_COLOR);
        enumSample.showCardsWithStatsAndDescription();
        System.out.println(BLUE + "===================================================================" + RESET_COLOR);

        switch (heroCard) {
            case GREGOR_CLEGANE:
                enumSample.showSingleCardWithStatsAndDescription(heroCard);
                break;
            case CONNAN_THE_BARBARIAN:
                enumSample.showSingleCardWithStatsAndDescription(heroCard);
                break;
            case GERALT_OF_RIVIA:
                enumSample.showSingleCardWithStatsAndDescription(heroCard);
                break;
            default:
                break;
        }
    }
}