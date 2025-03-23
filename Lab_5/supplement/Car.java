public class Car extends Vehicle {
    public Car(String brand, int year) {
        super(brand, year);
    }
    
    @Override
    public String toString() {
        return String.format("Car: %s", super.toString());
    }
}
