package ch45.ex8;

public sealed class Transport permits Bus, Car, Bike {
    private final String brand;

    public Transport(String brand) {
        this.brand = brand;
    }
}
