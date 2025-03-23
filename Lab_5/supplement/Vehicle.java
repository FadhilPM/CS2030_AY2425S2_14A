public class Vehicle {
    private final String brand;
    private final int year;
    
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
    
    @Override
    public String toString() {
        return String.format("%s [%d]", this.brand, this.year);
    }
}
