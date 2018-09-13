package pl.devwannabe.generics.generic_class;

public class GenericClass<T, V> {

    private T genericField;
    private V secondGenericField;

    public GenericClass() {

    }

    public GenericClass(T genericField, V secondGenericField) {
        this.genericField = genericField;
        this.secondGenericField = secondGenericField;
    }

    public void nameOfGenericType() {
        System.out.println("Type <T>: " + genericField.getClass().getName());
        System.out.println("Type <V>: " + secondGenericField.getClass().getName());
    }

    public T getGenericField() {
        return genericField;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "genericField=" + genericField +
                ", secondGenericField=" + secondGenericField +
                '}';
    }
}
