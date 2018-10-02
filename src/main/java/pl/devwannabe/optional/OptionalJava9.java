package pl.devwannabe.optional;

import java.util.Optional;
import java.util.Scanner;

public class OptionalJava9 {

    Optional<Employee> optionalEmployee = EmployeeRepository.findOptionalEmployee("");


    /**
     * Metoda stream() <br>
     */
    void streamExample() {
        Long counter = optionalEmployee
                .filter(emp -> emp.getAge() > 30)
                .map(Employee::getName)
                .map(String::toUpperCase)
                .stream().count();
        System.out.println("Number of employees... : " + counter);
    }

    /**
     * Metoda or() <br>
     * Jeżeli nie ma pracownika o imieniu, to stwórz pracownika
     * i przekaż dalej w łąńcuchu wywołąń.
     */
    void orExample() {
        Optional<String> name = optionalEmployee.or(() -> Optional.of(new Employee("Aleksandra", 35)))
                .filter(emp -> emp.getAge() > 30)
                .map(Employee::getName)
                .map(String::toUpperCase);
        name.ifPresent(System.out::println);
    }

    /**
     * Metoda ifPresentOrElse() <br>
     * Przyjmuje dwa argumenty, interfejsy Cunsumer i Runnable.
     * Jeżeli pracownik obecny - ifPresent(), to coś z nim zrób. Jeśli nie, to nie ma co
     * przesłać do drugiej metody, jednak metoda run() interfejsu Runnable nic nie
     * przymuje i nic nie zwraca - pasuje do tego przypadku aby po prostu wyświetlić
     * komunikat lub wywołąć inną metodę
     */
    void ifPresentOrElseExample() {
        optionalEmployee.or(() -> Optional.of(new Employee("Aleksandra", 35)))
                .filter(emp -> emp.getAge() > 30)
                .map(Employee::getName)
                .map(String::toUpperCase)
                .ifPresentOrElse(
                        (name) -> {
                            System.out.println(name
                                    .substring(0, name
                                            .length() - name.length() / 2) + " [cut!] You wanna see rest of the name or elephant? : \n" +
                                    "[Press 1] - Are you crazy, I' m working here, give me the name of that employee. \n" +
                                    "[Press 2] - Yes, I wanna Elephant."
                            );
                            while (true) {
                                String answer = userInput();
                                if (validate(answer)) {
                                    view(name, answer);
                                    break;
                                }
                            }
                        },
                        () -> System.out.println("There is no such employee"));

    }

    String userInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    boolean validate(String answer) {
        if (answer.equals("1") || answer.equals("2")) {
            return true;
        } else {
            System.out.println("You chose incorrectly.");
        }
        return false;
    }

    void view(String name, String answer) {
        if (answer.equals("1")) {
            System.out.println("The rest of the name is...: " +
                    name.substring(name.length() / 2, name.length()));

        } else if (answer.equals("2")) {
            System.out.println(
                    " _ __ _        \n" +
                            "/ |..| \\       \n" +
                            "\\/ || \\/       \n" +
                            " |_''_| "
            );
        }
    }
}