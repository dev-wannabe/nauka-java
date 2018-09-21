package pl.devwannabe.generics.generic_interface;

public class GenericInterfaceApp {
    public static void main(String[] args) {

        Order<Integer, Double> order = new Order<>(10, 99.99);

        System.out.println("id: " + order.getId());
        System.out.println("value: " + order.getValue());
    }
}

