package pl.devwannabe.generics.generic_class;

public class GenericClassApp {

    public static void main(String[] args) {
        GenericClass<Double, String> genericClass1 = new GenericClass<>(10.0, "Ten");
        GenericClass genericClass2 = new GenericClass<>(10, "Ten");

        Double value1 = genericClass1.getGenericField();
        //Double value2 = genericClass2.getGenericField();
        genericClass1.nameOfGenericType();
        genericClass2.nameOfGenericType();
        System.out.println(genericClass1);
        System.out.println(genericClass2);


    }
}
