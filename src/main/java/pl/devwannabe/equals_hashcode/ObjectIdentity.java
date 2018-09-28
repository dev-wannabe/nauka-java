package pl.devwannabe.equals_hashcode;

/**
 * <b>ObjectIdentity</b> - wartość określająca wskazanie na obiekt, którą przechowują zmienne referencyjne, tę samą
 * może posiadać więcej zmiennych, wskazujących na ten sam objekt. <br>
 *
 * <b>ObjectEquality</b> - Nie koniecznie musi oznaczać "taką samość", jak przy porównanniu dwóch wraperów.
 *  Kryteria równości danych obiektów mogą być różne i czasem przyjmują je sami programiści, a nadpisując equals
 *  może być potrzeba zapytać o to kogoś bardziej doświadczonego.
 */
public class ObjectIdentity {

    public static void main(String[] args) {

        Cat cat1 = new Cat("cat1", "black", 3, true);
        Cat cat2 = cat1;

        System.out.println(cat1 == cat2);

    }

}
