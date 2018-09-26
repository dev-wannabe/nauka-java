package pl.devwannabe.optional;

public class OptionalApp {

    public static void main(String[] args) {

        final String BLUE = "\u001B[34m";
        final String RESET_COLOR = "\u001B[0m";

        OptionalJava8 optionalJava8 = new OptionalJava8();
        OptionalJava9 optionalJava9 = new OptionalJava9();

        System.out.println(BLUE + "                   OPTIONAL IN JAVA 8:" + RESET_COLOR);
        System.out.println(BLUE + "===================checkWithIsPresent==============================" + RESET_COLOR);
        optionalJava8.checkWithIsPresent();
        System.out.println(BLUE + "===================isPresentWithLambda=============================" + RESET_COLOR);
        optionalJava8.isPresentWithLambda();
        System.out.println(BLUE + "===================isPresentWithFilterAndMap=======================" + RESET_COLOR);
        optionalJava8.isPresentWithFilterAndMap();
        System.out.println(BLUE + "===================ifThereIsNoEmployeeOrElse=======================" + RESET_COLOR);
        optionalJava8.ifThereIsNoEmployeeOrElse();
        System.out.println(BLUE + "===================ifThereIsNoEmployeeOrElseGet====================" + RESET_COLOR);
        optionalJava8.ifThereIsNoEmployeeOrElseGet();
        System.out.println(BLUE + "===================ifThereIsNoEmployeeOrElseThrow==================" + RESET_COLOR);
        optionalJava8.ifThereIsNoEmployeeOrElseThrow();

        System.out.println(BLUE + "\n                   OPTIONAL IN JAVA 9:" + RESET_COLOR);
        System.out.println(BLUE + "===================streamExample===================================" + RESET_COLOR);
        optionalJava9.streamExample();
        System.out.println(BLUE + "===================orExample=======================================" + RESET_COLOR);
        optionalJava9.orExample();
        System.out.println(BLUE + "===================ifPresentOrElseExample==========================" + RESET_COLOR);
        optionalJava9.ifPresentOrElseExample();



    }
}
