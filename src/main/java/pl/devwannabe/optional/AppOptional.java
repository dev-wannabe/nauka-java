package pl.devwannabe.optional;

import java.util.Optional;
import java.util.function.Consumer;

public class AppOptional {

    public static void main(String[] args) {

        final String BLUE = "\u001B[34m";
        final String RESET_COLOR = "\u001B[0m";

        Employee employee = EmployeeRepository.findEmployee("Marek");
        Optional<Employee> optionalEmployee = EmployeeRepository.findOptionalEmployee("Marek");

        if(employee != null) {
            System.out.println(employee.getName());
        }

        System.out.println(BLUE + "===================================================================" + RESET_COLOR);
        if(optionalEmployee.isPresent()) {
            employee = optionalEmployee.get();
            System.out.println(employee.getName() + "\n" + employee.getAge());
        }
        System.out.println(BLUE + "===================================================================" + RESET_COLOR);
        optionalEmployee.ifPresent(emp -> System.out.println(emp.getName()));

        optionalEmployee.ifPresent(new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                System.out.println(employee.getName());
            }

        });
        System.out.println(BLUE + "===================================================================" + RESET_COLOR);

    }
}
