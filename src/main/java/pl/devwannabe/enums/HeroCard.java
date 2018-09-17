package pl.devwannabe.enums;

/**
 * Każda wartość w Enum ma przypisaną niejawnie liczbę porządkową (od zera) zgodnie z
 * kolejnością występowania w "klasie". Enum przechowuje stałe wartości.
 * Konstruktor w Enum jest zawsze prywatny i inicjuje wartości enum, nie obiekty jak w przypadku klas.
 * Nie ma możliwości tworzenia obiektów typu Enum z użyciem słowa new. Do porównań wartości Enum używa się
 * operatora '=='.
 */
public enum HeroCard implements Description {

    GREGOR_CLEGANE(10, 1, 4){
        @Override
        public void comment() {
            System.out.println("Gregor Clegane had an accident and now he doesn't speak much, but fights well.");
        }
    },
    CONNAN_THE_BARBARIAN(10, 4, 6){
        @Override
        public void comment() {
            System.out.println("Connan once had a secret mission, but he didn't tell anyone about \n"
                    + "it, and he forgot... Now he is only fighting. ");
        }
    },
    GERALT_OF_RIVIA(7, 10, 10) {
        @Override
        public void comment() {
            System.out.println("Geralt got lost from another dimension ..."
                    + " From a place called Rivia or something like that.\n"
                    + "He is fast, he has a Joke - women loves him ");
        }
    };

    private int strength;
    private int intelligence;
    private int speed;

    HeroCard(int strength, int intelligence, int speed) {
        this.strength = strength;
        this.intelligence = intelligence;
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void comment() {
        System.out.println("There is no description yet for that card");
    }

}