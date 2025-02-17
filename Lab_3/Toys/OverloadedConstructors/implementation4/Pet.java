public class Pet {
    private final String name;
    private final String gender;
    private final int age;

    Pet(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    
    Pet(String name, String gender) {
        this(name, gender, 0);
    }

    Pet(String name, int age) {
        this(name, "Unknown", age);
    }
    
    Pet(Pet p, int age) {
        this(p.name, p.gender, age);
    }

    Pet(Pet p, String gender) {
        this(p.name, gender, p.age);
    }
    
    @Override 
    public String toString() { 
        return String.format("Pet named %s, with gender %s and age %d", name, gender, age);
    }
}
