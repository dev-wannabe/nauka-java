package pl.devwannabe.enums.singleton;

/**
 * Wzorzec singleton: <br>
 *     sposób na zapewnienie, że na poziomie jednej wirtualnej maszyny
 * będzie się znajdować tylko jedna instancja danej klasy -
 * <a href="https://www.baeldung.com/java-singleton">przykład</a>.<br>
 *<br>
 * Zastosowanie: <br>
 *      Może to być klasa utilsowa, bez stanowa, z samymi metodami, które będą wykonywać
 * operacje na obiekcie domenowym. Nie ma potrzeby tworzyć więcej niż jedna instancja
 * takiej klasy, myślę choćby dlatego aby z powodu wielu obiektów  błędnie nie multiplikować
 * zmian na obiekcie domenowym, np. nabijać nadmiarowy level  <br>
 *<br>
 * Dlaczego Enum?:<br>
 *      Wzorzec singleton choć prosty w założeniu może być trudniejszy w wdrożeniu. W przypadku
 * tradycyjnej klasy zagrożeniem dla utrzymania tylko jednej instancji może być np.
 * wielowątkowość, serializacja i deserializacja. W przypadku zastosowania do singletona
 * typu Enum same mechanizmy Javy chronią ten wzorzec. Java zapewni, że dana wartość Enuma
 * będzie tylko jedna.
 *
 */
public enum PlayerUtilsSingleton {

    INSTANCE;

    void levelUp(Player player) {
        player.level++;
    }
}