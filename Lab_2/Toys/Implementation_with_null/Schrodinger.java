import java.util.Random;

public class Schrodinger {
    private static final Random rng = new Random();
    private static final double EPSILON = 1E-15;
    private static final double THRESHOLD = 0.5;

    public static Animal runExperiment(Animal animal) {
        double livechance = rng.nextDouble();
        if ((THRESHOLD - livechance) >= EPSILON) {
            return null;
        }
        return animal;
    }
}
