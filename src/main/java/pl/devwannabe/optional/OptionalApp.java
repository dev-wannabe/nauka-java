package pl.devwannabe.optional;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalApp {
    Optional<Employee> optionalEmployee = EmployeeRepository.findOptionalEmployee("Jarek");

    public static void main(String[] args) {

        final String BLUE = "\u001B[34m";
        final String RESET_COLOR = "\u001B[0m";

        //rozwiązanie z optionalem ma tę zaletę że z racji samego jego  użycia informuję, że obiektu może nie być
        Employee employee = EmployeeRepository.findEmployee("Marek");
        Optional<Employee> optionalEmployee = EmployeeRepository.findOptionalEmployee("Jarek");

       

        System.out.println(BLUE + "===================================================================" + RESET_COLOR);
        //map modyfikuje (we wnętrzu obiektu Optionala) jeden typ w drugi
        //predicate - przyjmuje jeden typ i zwraca booleana. Jeżeli chciałbym od filtrować
        //pracowników po 30-stce to uwagi, że map zmodyfikował typ na String, filter musi być
        //przed wykonaniem map, gdzie jeszcze mam obiekt pracownika
        Optional<String> str = optionalEmployee
                .filter(emp -> emp.getAge() < 30)
                .map(Employee::getName)
                .map(String::toUpperCase);

        str.ifPresent(System.out::println);

        //w starej javie
//        if(employee != null) {
//            if (employee.getAge() > 30) {
//                String name = employee.getName();
//                System.out.println(name);
//            }
//        }

        System.out.println(BLUE + "================Jeżeli pracownik nie istnieje===================" + RESET_COLOR);


        //Opcja 1 - jeżeli jest to imię jeżeli nie to info:
        String imięPracownika = optionalEmployee
                .filter(emp -> emp.getAge() < 30)
                .map(Employee::getName)
                .map(String::toUpperCase)
                .orElse("Brak pracownika");
        System.out.println(imięPracownika);


        //   To co powyżej w starej javie
        if (employee != null) {
            if (employee.getAge() < 30) {
                String name = employee.getName();
                System.out.println(name);
            } else {
                System.out.println("Brak pracownika");
            }
        } else {
            System.out.println("Brak pracownika");
        }

        System.out.println(BLUE + "===================================================================" + RESET_COLOR);

        //Opcja 2 - jeżeli jest obiekt to imię, jeżeli nie to wyjątek

        imięPracownika = optionalEmployee
                .filter(emp -> emp.getAge() < 30)
                .map(Employee::getName)
                .map(String::toUpperCase)
                .orElseThrow(() -> new RuntimeException("Brak pracownika o podanym imieniu"));
        System.out.println(imięPracownika);

              /*
            Opcja 3 - nie ma obiektu to się nic nie stanie
        */

        if (optionalEmployee.isPresent()) {
            employee = optionalEmployee.get();
            System.out.println(employee.getName() + "\n" + employee.getAge());
        }
        System.out.println(BLUE + "===================================================================" + RESET_COLOR);
        optionalEmployee.ifPresent(emp -> System.out.println(emp.getName() + "\n" + emp.getAge()));

//        optionalEmployee.ifPresent(new Consumer<Employee>() {
//            @Override
//            public void accept(Employee employee) {
//                System.out.println(employee.getName()+"2");
//            }
//
//        });


        System.out.println(BLUE + "===============================java 9============================" + RESET_COLOR);
        /*
        zmiany Optional w Java 9: <br>
        1. możliwość utworzenia z Optionala streama
         */

        Long a = optionalEmployee
                .filter(emp -> emp.getAge() < 30)
                .map(Employee::getName)
                .map(String::toUpperCase)
                .stream().count();
        System.out.println(a);

        /*
        2. Nowa metoda - or(), przykładowo można użyć zamiast isPresent(), tj. jeżeli nie ma pracownika o
        imieniu, to stwórz pracownika o imieniu i przekaż dalej w łąńcuchu wywołąń.
         */

        optionalEmployee.or(() -> Optional.of(new Employee("Jurek", 45)))
                .filter(emp -> emp.getAge() < 30)
                .map(Employee::getName)
                .map(String::toUpperCase);

        str.ifPresent(System.out::println);

        /*
        3. Nowa metoda - ifPresentOrElse(param1- implementacja interfejsu consumer,
        param2 - implementacja interfejsu Runnable)
         */

        optionalEmployee.or(() -> Optional.of(new Employee("Jurek", 45)))
                .filter(emp -> emp.getAge() < 30)
                .map(Employee::getName)
                .map(String::toUpperCase)
        .ifPresentOrElse(
                System.out::println,
                //name -> System.out.println(name),
                () -> System.out.println("brak pracownika spełniającego kryteria")
        );

    }
    //////////////////////KONIEC MAIN////////////////////////

    void basicFormOfUse() {
        Optional<Employee> optionalEmployee = EmployeeRepository.findOptionalEmployee("Jarek");
        if (optionalEmployee.isPresent()) {
            Employee emp = optionalEmployee.get();
            System.out.println(emp.getName() + "\n" + emp.getAge());
        }

    }

}