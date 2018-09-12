package pl.devwannabe.generics.generics_interface;

class Order<I, V> implements Information<I, V> {

    private I id;
    private V value;

    public Order(I id, V value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public I getId() {
        return id;
    }

    @Override
    public V getValue() {
        return value;
    }
}
