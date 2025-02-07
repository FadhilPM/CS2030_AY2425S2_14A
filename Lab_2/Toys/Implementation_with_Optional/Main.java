import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Animal testSubject = new Cat("Chell");
        System.out.println(String.format("New test subject: %s", testSubject.toString()));
        System.out.println(String.format("Get in the box"));
        
        Optional<Animal> box = OptionalSchrodinger.runExperiment(testSubject);
        System.out.println("Open the box");
        
        String outcome = box.map(x -> String.format("Test subject vocalises: %s", x.vocalise()))
            .orElse("Subject does not exist");
        System.out.println(outcome);
    }

}
