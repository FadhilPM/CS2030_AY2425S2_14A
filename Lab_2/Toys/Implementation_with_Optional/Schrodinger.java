import java.util.Random;
import java.util.Optional;

public class Schrodinger {
    private static final Random rng = new Random();
    private static final double EPSILON = 1E-15;
    private static final double THRESHOLD = 0.5;

    public static Optional<Animal> runExperiment(Animal animal) {
        return Optional.of(animal).filter(x -> (THRESHOLD - rng.nextDouble()) >= EPSILON); 
    }
}
