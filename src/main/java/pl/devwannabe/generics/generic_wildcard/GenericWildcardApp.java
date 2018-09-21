package pl.devwannabe.generics.generic_wildcard;

import java.util.ArrayList;

/**
 * Created by dev-wannabe 12-09-2018
 */
public class GenericWildcardApp {
    public static void main(String[] args) {

        ArrayList<Robot> arrayList = new ArrayList<>();

        arrayList.add(new SuperRobot());

        displayElement(0, arrayList);
    }

    /**
     * ? - Wildcard (argument wieloznaczny) -  można określić dla niego górną (extends)
     * lub dolną (super) granicę dla przyjmowanych typów z hierarchii dziedziczenia, ale nie obie.
     *
     * W przypadku użycia parametrów typu można określić tylko górną granicę
     *
     * @param index numer indeksu
     * @param arrayList będzie przyjmował jakiś typ danych dziedziczących po klasie  Machine ale
     *                  występujący nie niżej w hierarchii dziedziczenia niż klasa Robot
     */
    public static void displayElement(int index, ArrayList<? super Robot> arrayList) {

        Object element = arrayList.get(index);

        System.out.println("Element: " + element);
        System.out.println("Type: " + element.getClass().getName());
    }

//    public static <T extends Machine> void displayElement(int index, ArrayList<T> arrayList) {
//
//        T element = arrayList.get(index);
//
//        System.out.println("Element: " + element);
//        System.out.println("Type: " + element.getClass().getName());
//    }
}
