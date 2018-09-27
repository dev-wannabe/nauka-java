package pl.devwannabe.equals_hashcode;

/**
 * <b>public native int hashCode()</b> - metoda nie ma ciała i jest natywna -
 * funkcja używana przez JVM, do której nie ma bezpośrednio dostępu.
 * Metoda domyślnie dąży do tego aby dla każdego obiektu danego typu zwócić inny hash code,
 * nie do końca jest to możliwe, ograniczeniem jest zakres liczb Integer.<br>
 *
 * <b>equals()</b> zwraca booleana porównując operatorem "==" wartość podanej referencji (nie obiektu) określonego
 * typu z klasą, do której przynależy. <br>
 *
 * Metody equals() i hashCode() z klasy Object zwykle wymagają nadpisania.
 * Przykładowo kolekcje oparte o hash tables: hashMap, hashSet szczególnie tego wymagają.<br>
 * Jeżeli jest to możliwe, najlepiej metody te generować w swoim IDE. <br>
 *
 * <b>ObjectIdentity</b> - wartość określająca wskazanie na obiekt, którą przechowują zmienne referencyjne, tę samą
 * może posiadać więcej zmiennych, wskazujących na ten sam objekt. <br>
 * <b>ObjectEquality</b> - Nie koniecznie musi oznaczać "taką samość", jak przy porównanniu dwóch wraperów.
 *  Kryteria równości danych obiektów mogą być różne i przyjmują je sami programiści, a nadpisując equals
 *  może być potrzeba zapytać o to kogoś bardziej doświadczonego.
 */
public class Cat {

    private String name;
    private String color;
    private int age;
    private boolean hasTail;

    public Cat() {

    }

    public Cat(String name, String color, int age, boolean hasTail) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.hasTail = hasTail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;
        if (hasTail != cat.hasTail) return false;
        if (!name.equals(cat.name)) return false;
        return color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + age;
        result = 31 * result + (hasTail ? 1 : 0);
        return result;
    }

}