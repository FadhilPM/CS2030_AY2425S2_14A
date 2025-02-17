import java.util.Random;

public class Schrodinger {
    private static final Random RNG = new Random();
    private static final double EPSILON = 1E-15;
    private static final double THRESHOLD = 0.5;

    public static Animal runExperiment(Animal animal) {
        double livechance = RNG.nextDouble();
        if ((THRESHOLD - livechance) >= EPSILON) {
            return null;
        }
        return animal;
    }
}
