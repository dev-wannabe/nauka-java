package pl.devwannabe.optional;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalJava8 {

    /**
     * Rozwiązanie z optionalem ma tę zaletę, że z racji samego jego  użycia informuję, że obiektu może nie być
     */
    Optional<Employee> optionalEmployee = EmployeeRepository.findOptionalEmployee("Marek40");

    /**
     * isPresent zwraca booleana, jest to proste sprawdzenie, czy w tym przypadku obiekt Optionala
     * zawiera obiekt pracownika. Jeżeli tak, get() w ciele metody zwraca oryginalny obiekt Employee.
     * Gdyby nie było ifPresent(), get() na pustym Optionalu rzuciło by nullPointerEsception
     */
    void checkWithIsPresent() {
        if (optionalEmployee.isPresent()) {
            Employee emp = optionalEmployee.get();
            System.out.println(emp.getName() + "\n" + emp.getAge());
        }
    }

    void isPresentWithLambda() {
        optionalEmployee.ifPresent(emp -> System.out.println(emp.getName() + "\n" + emp.getAge()));

        optionalEmployee.ifPresent(new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                System.out.println(employee.getName());
            }
        });
    }

    /**
     * filter przyjmuje jako argument interfejs predicate, który przyjmuje jeden typ i zwraca booleana.
     * map modyfikuje (we wnętrzu obiektu Optionala) jeden typ w drugi.
     * Chcąc filtrować pracowników ze względu na wiek, to z uwagi,
     * że map zmodyfikował typ na String, filter musi być
     * przed wykonaniem map, gdzie jeszcze jest obiekt pracownika.
     */
    void isPresentWithFilterAndMap() {
        Optional<String> name = optionalEmployee
                .filter(emp -> emp.getAge() > 30)
                .map(Employee::getName)
                .map(String::toUpperCase);
        name.ifPresent(System.out::println);
    }

    /**
     * orElse kończy działąnie optionala, więc nie mogę zastosować ifPresent po nim.
     */
    void ifThereIsNoEmployeeOrElse() {
        String employee = optionalEmployee
                .filter(emp -> emp.getAge() > 30)
                .map(Employee::getName)
                .map(String::toUpperCase)
                .orElse(notification());
        System.out.println(employee);
    }

    /**
     * Różnica pomiędzy 'orElse()' a 'orElseGet()' jest taka, że
     * w przypadku użycia 'orElse()' metoda notification() wykona się nawet
     * jeżeli obiekt Employee zostanie odszukany, a w przypadku 'orElseGet()' nie -
     * <a href="https://www.baeldung.com/java-optional-or-else-vs-or-else-get">przykład</a>
     */
    void ifThereIsNoEmployeeOrElseGet() {
        String employee = optionalEmployee
                .filter(emp -> emp.getAge() > 30)
                .map(Employee::getName)
                .map(String::toUpperCase)
                .orElseGet(() -> notification());
        System.out.println(employee);
    }

    void ifThereIsNoEmployeeOrElseThrow() {
        String employee = optionalEmployee
                .filter(emp -> emp.getAge() > 30)
                .map(Employee::getName)
                .map(String::toUpperCase)
                .orElseThrow(() -> new RuntimeException(notification()));
        System.out.println(employee);
    }

    private String notification() {
        System.out.println("Method notification() in action");
        return "There is no such employee";
    }

}
