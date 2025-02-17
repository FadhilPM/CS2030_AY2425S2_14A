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
        this.name = name;
        this.gender = gender;
        this.age = 0;
    }

    Pet(String name, int age) {
        this.name = name;
        this.gender = "Unknown";
        this.age = age;
    }
    
    Pet(Pet p, int age) {
        this.name = p.name;
        this.gender = p.gender;
        this.age = age;
    }

    Pet(Pet p, String gender) {
        this.name = p.name;
        this.gender = gender;
        this.age = p.age;
    }
    
    @Override 
    public String toString() { 
        return String.format("Pet named %s, with gender %s and age %d", name, gender, age);
    }
}
