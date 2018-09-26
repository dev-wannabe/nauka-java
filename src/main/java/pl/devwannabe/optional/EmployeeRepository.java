package pl.devwannabe.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class EmployeeRepository {

    private static Map<String, Employee> employees = new HashMap<>(2);

    static {
        employees.put("Marek40", new Employee("Marek",40));
        employees.put("Jarek25", new Employee("Jarek",25));
    }

    private EmployeeRepository() {

    }

    /**
     * Tradycyjne podejście, metoda może zwrócić null jeżeli imię się nie znajdzie
     * w mapce.
     */
    public static  Employee findEmployee(String name) {
        return employees.get(name);
    }

    /**
     * Podejście z użyciem klasy Optional, metoda zwróci obiekt Employee zawinięty w
     * Optional lub Optional. <br>
     * Występują trzy  opcje użycia: <br>
     * 1. Optional.of(employees.get(name)); <br>
     * 2. Optional.ofNullable(employees.get(name)); <br>
     * 3. Optional.empty(); <br>
     * W pierwszym przypadku jeśli będzie null, to metoda zapakuje go w Optionala i zwróci. <br>
     * W drugim zwróci pustego Optionala - bezpieczniejsza opcja.
     * W trzecim zawsze pustego Optionala
     */
    public static Optional <Employee> findOptionalEmployee(String name) {
        return Optional.ofNullable(employees.get(name));
    }
}
