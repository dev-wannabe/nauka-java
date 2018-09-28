package pl.devwannabe.equals_hashcode;

/**
 * <b>public native int hashCode()</b> - metoda nie ma ciała i jest natywna -
 * funkcja używana przez JVM, do której nie ma bezpośrednio dostępu.
 * Metoda domyślnie dąży do tego aby dla każdego obiektu danego typu zwócić inny hash code,
 * nie do końca jest to możliwe, ograniczeniem jest zakres liczb Integer.<br>
 *
 * <b>equals()</b> zwraca booleana porównując operatorem "==" wartość podanej referencji (nie obiektu) określonego
 * typu, z referencją (this) do aktualnego obiektu na którym metoda została wywołana. Innymi słowy czy zmienna
 * wskazuje na obiekt na którym equals została wywołana. <br>
 *
 * <b>Po co nadpisywać equals() ?</b> <br>
 *     Gdy dwie zmienne wskazujące na ten sam obiekt, są równe, to wartość na którą wskazują musi być taka sama.
 *     Może być jednak tak, że referencje są od siebie różne, gdyż wskazują na różne obiekty ale
 *     zawartość obiektów jest taka sama. Domyślna equals(); nie odpowie mi na pytanie czy dwa różne obiekty
 *     mają taką samą zawartość. Należy więc nadpisać equals podobnie jak to jest w przypadku klasy String,
 *     żeby poprawnie porównywać łańcuchy a nie referencje do nich. <br>
 *         <b>Zasada: </b><br>
 *             Gdy jest nadpisana metoda equals() w danej klasie, musi być też nadpisana hashCode().
 *             Jeżeli jest to możliwe, najlepiej metody te generować w swoim IDE.
 *
 * Metody equals() i hashCode() z klasy Object zwykle wymagają nadpisania w przypadku
 * kolekcji opartych o hash tables: hashMap.<br>
 *  <br>

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

    /**
     * Do operacji generowania hashcode używa się liczb pierwszych i bezpiecznych metod hashCode() nadpisanych
     * w danych klasach jak String. W trakcie prowadzonych badań nad algorytmami wyszło, że do
     * tworzenia metod hashCode aby generowały one unikalne, niekolizujne numerki, najlepiej nadają się
     * liczby pierwsze - dzielone tylko przez 1 i siebie. Do mnożenia używa się liczby 31 gdyż zapewnia statystycznie
     * mniejsze  powielanie się nr hash. W jej przypadku JVM lub sprzęt hardwerowy
     * może zastosować przesunięcie bitowe i odejmowanie, zamiast mnożenia, co zwiększa minimalnie wydajność.
     *
     */
    @Override
    public int hashCode() {
        //int result = 7;
        int result = name.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + age;
        result = 31 * result + (hasTail ? 1 : 0);
        return result;
    }

}