class Main {

    public static void main(String[] args) {
        Animal testSubject = new Cat("Chell");
        
        System.out.println(String.format("New test subject: %s", testSubject.toString()));
        System.out.println(String.format("Get in the box"));
        
        testSubject = Schrodinger.runExperiment(testSubject);
        
        System.out.println("Open the box");
        
        if (testSubject != null) {
            System.out.println(String.format("Test subject vocalises: %s", testSubject.vocalise()));
        } else {
            System.out.println("Subject not found");
        }
    }
}
