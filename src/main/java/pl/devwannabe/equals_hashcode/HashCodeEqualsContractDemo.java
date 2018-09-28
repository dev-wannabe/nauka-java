package pl.devwannabe.equals_hashcode;

import java.util.HashMap;
import java.util.Map;

public class HashCodeEqualsContractDemo {

    public static void main(String[] args) {


        Cat cat1 = new Cat("cat1", "black", 3, true);
        Cat cat2 = new Cat("cat2", "black", 3, true);

        System.out.println(cat1.equals(cat2));

        /**
         * Kolekcje oparte o hashTables jak hashMapa działają w oparciu o system kubełkowy.
         * Przy dodawaniu obiektu do mapy wyliczany jest jego hashcode. Sprawdzane jest czy istnieje
         * kubełek oznaczony tym hashcodem, jeżeli nie to idzie do pierwszego pustego z brzegu, który zostanie
         * następni oznaczony tym hashcodem. Jeżeli tak, to trafia do kubełka o takim samym hashcode. Gdyby w sytuacji
         * najgorszej z możliwych wszystkie obiekty miały ten sam hashcode, to trafią do jednego kubełka, staną
         * się formą linked listy. Wtedy taki kubełek będzie za każdym razem po kolei przeszukiwany
         * od najnowszego, do najstarszego obiektu w poszukiwaniu tego porządanego.
         * Gdy w kubełku jest więcej niż jeden obiekt, to do sprawdzania w
         * trakcie wyszukiwania używana jest metoda equals(). W sytuacji gdzie są np.
         * 3 obiekty o różnym hashcode, to trafią one do trzech różnych kubełków ale mapka będzie zawierała
         * 4, ostatni będzie pusty i gotowy na przyjęcie następnego obiektu.
         *
         */
        Map<Cat, String> catStringMap = new HashMap<>();
        catStringMap.put(cat1, "value1");
        catStringMap.put(cat2, "value2");

        System.out.println(catStringMap.get(cat1));
        System.out.println(catStringMap.get(cat2));

    }

}