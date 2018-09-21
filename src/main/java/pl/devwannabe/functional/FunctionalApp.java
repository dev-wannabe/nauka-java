package pl.devwannabe.functional;

import java.util.Arrays;
import java.util.List;

/**
 * Do Javy 1.8, gdy nadpisywano metody danego interfejsu, choćby miał on tylko jedną metodę,
 * używano klas anonimowych (new InterfaceName() {nadpisane metody}. Gdy jednak
 * Interfejs ma tylko jedną metodę, zapis można znacznie uprościć (wyrażenie lambda). Pozostanie on
 * jednoznaczny dla kompilatora, jednocześnie umożliwiając wprowadzenie elementów programowania
 * funkcyjnego do Java.
 */
public class FunctionalApp {

    public static void main(String[] args) {

        final String BLUE = "\u001B[34m";
        final String RESET_COLOR = "\u001B[0m";

        FunctionalApp app = new FunctionalApp();

        System.out.println(BLUE + "==============================================================" + RESET_COLOR);
        app.beforeJava8Example();
        System.out.println(BLUE + "==============================================================" + RESET_COLOR);
        app.lambdaExample();
        System.out.println(BLUE + "==============================================================" + RESET_COLOR);
        app.lambdaExampleWhenMethodHasOnlyOneParameter();
        System.out.println(BLUE + "==============================================================" + RESET_COLOR);
        app.lambdaExampleWithList();
        System.out.println(BLUE + "==============================================================" + RESET_COLOR);
        app.lambdaExampleWhenCodeHasManyLines();
        System.out.println(BLUE + "==============================================================" + RESET_COLOR);
        app.lambdaExampleWithoutParameters();
        System.out.println(BLUE + "==============================================================" + RESET_COLOR);
        app.lambdaExampleWithDoubleColon();
    }

    void beforeJava8Example() {
        Multiplication multiplication = new Multiplication() {
            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        };
        System.out.println(multiplication.calculate(2, 2));
    }

    /**
     * - Nie ma potrzeby tworzyć klasy wewnętrznej dla jednej metody.<br>
     * - Nie ma potrzeby informować kompilator @Overridem, że jest nadpisywana <br>
     * - Nie ma potrzeby pisać new Multiplication() po prawej, wystarczy zdefiniować typ po lewej,
     * gdy klasa wewnętrzna nie jest tworzona.<br>
     * - Nie ma potrzeby pisać nazwy metody, typów parametrów jakie przyjmuje, typu jaki
     * zwraca wraz ze słowem "return" - to wszystko jest jednoznaczne w przypadku tylko
     * jednej metody w Interfejsie.<br>
     * - Wystarczające są:<br>
     * Typ interfejsu = (parametry jakie przyjmuje interfejs) → (ciało metody);
     */

    void lambdaExample() {
        Multiplication multiplication = (a, b) -> (a * b);
        System.out.println(multiplication.calculate(3, 3));
    }

    /**
     * W przypadku jeżeli metoda z interfejsu funkcyjnego ma tylko jeden parametr można
     * pominąć nawiasy okągłe po lewej stronie wyrażenia
     */
    void lambdaExampleWhenMethodHasOnlyOneParameter() {
        OneParameter oneParameter = a -> a * a;
        System.out.println(oneParameter.factor(4));
    }

    void lambdaExampleWithList() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        nums.forEach(num -> System.out.print(num + " "));
        //nums.forEach(System.out::print);
        System.out.println();
    }

    void lambdaExampleWhenCodeHasManyLines() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        nums.forEach(num -> {
            int x = 5;
            num += x;
            System.out.print(num * 10 + " ");
        });
        System.out.println();
    }

    void lambdaExampleWithoutParameters() {
        NoParameters noParameters = () -> printSomething();
        noParameters.nothingSpecial();
        System.out.println("can be used but is not.");
    }

    /**
     * Jeżeli wyrażenie lambda służy jedynie jako pośrednik do wywołania jakiejś metody, to można
     * skorzystać ze skrótu "::", który będzie oznaczał użycie danego interfejsu. Umożliwia on korzystanie ze składni
     * typu: "referencjaDoMetody::metoda", gdzie referencja zwykle będzie nazwą klasy lub obiektu. Są
     * <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html">cztery rodzaje referencji
     * metod</a>.
     * Do działania konstrukcji ważne jest, aby parametry interfejsu funkcyjnego
     * oraz wywołanej metody za pomocą referencji były takie same - typ, ilość i kolejność.
     */
    void lambdaExampleWithDoubleColon() {
        NoParameters noParameters = FunctionalApp::printSomething;
        noParameters.nothingSpecial();
        System.out.println("can be used and it is.");

        NoParameters noParameters2 = FunctionalApp::new;
        noParameters2.nothingSpecial();
    }

    private static void printSomething() {
        System.out.print("Double colon (::) ");
    }

}