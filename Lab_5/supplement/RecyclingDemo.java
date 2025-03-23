import java.util.List;
import java.util.stream.Stream;
import java.util.function.Function;

public class RecyclingDemo {
    public static void main(String[] args) {
        // Create a list of cars
        List<Car> cars = List.of(
            new Car("Toyota", 2010),
            new Car("Honda", 2015),
            new Car("Ford", 2005)
        );
        
        // Different mapper functions
        Function<Car, Scrap> carToScrap = 
            car -> new Scrap(car.getBrand(), car.getYear());
        
        Function<Car, RefinedScrap> carToRefinedScrap = 
            car -> new RefinedScrap(car.getBrand(), car.getYear());
        
        Function<Vehicle, Scrap> vehicleToScrap = 
            vehicle -> new Scrap(vehicle.getBrand(), vehicle.getYear());
        
        Function<Vehicle, RefinedScrap> vehicleToRefinedScrap = 
            vehicle -> new RefinedScrap(vehicle.getBrand(), vehicle.getYear());
        
        System.out.println("=== Using PECS-compliant method ===");
        
        // All these work with our PECS-compliant method
        List<Scrap> result1 = mapVehicles(cars, carToScrap);
        System.out.println("Car → Scrap: " + result1);
        
        List<Scrap> result2 = mapVehicles(cars, carToRefinedScrap);
        System.out.println("Car → RefinedScrap: " + result2);
        
        List<Scrap> result3 = mapVehicles(cars, vehicleToScrap);
        System.out.println("Vehicle → Scrap: " + result3);
        
        List<Scrap> result4 = mapVehicles(cars, vehicleToRefinedScrap);
        System.out.println("Vehicle → RefinedScrap: " + result4);
        
        System.out.println("\n=== Using restrictive method ===");
        
        // Only the first one works with the restrictive method
        List<Scrap> restrictedResult = mapVehiclesRestrictive(cars, carToScrap);
        System.out.println("Car → Scrap: " + restrictedResult);
        
        // These would cause compilation errors:
        // mapVehiclesRestrictive(cars, carToRefinedScrap);     // Error!
        // mapVehiclesRestrictive(cars, vehicleToScrap);        // Error!
        // mapVehiclesRestrictive(cars, vehicleToRefinedScrap); // Error!
        
        System.out.println("The other three combinations would cause compilation errors!");
    }
    
    // PECS-compliant method - flexible but restricted to Vehicle types!
    public static <T extends Vehicle> List<Scrap> mapVehicles(
            List<T> vehicles,
            Function<? super T, ? extends Scrap> mapper) {
        
        List<Scrap> result = vehicles
            .stream()
            .map(mapper)
            .toList();
        return result;
    }
    
    // Restrictive method - not flexible!
    public static List<Scrap> mapVehiclesRestrictive(
            List<Car> cars,
            Function<Car, Scrap> mapper) {
        
        List<Scrap> result = cars
            .stream()
            .map(mapper)
            .toList();
        return result;
    }
}
