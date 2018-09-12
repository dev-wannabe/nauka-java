package pl.devwannabe.generics.generics_interface;

public class App {
    public static void main(String[] args) {

        Order<Integer, Double> order = new Order<>(10, 99.99);

        System.out.println("id: " + order.getId());
        System.out.println("value: " + order.getValue());
    }
}

