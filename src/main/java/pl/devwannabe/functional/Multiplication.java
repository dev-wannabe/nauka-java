package pl.devwannabe.functional;

/**
 * Interfejs funkcyjny może zawierać tylko jedną metodę, chyba że będą to metody
 * nadpisane z klasy Object lub metody z ciałem typu default.
 */
@FunctionalInterface
public interface Multiplication {

    int calculate(int a, int b);

    boolean equals(Object object);

    int hashCode();

    default int calculate(int a) {
        return 2*2;
    }

}