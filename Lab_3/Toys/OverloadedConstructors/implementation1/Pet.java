public class Pet {
    private final String name;
    private final String gender;
    private final int age;

    Pet(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override 
    public String toString() { 
        return String.format("Pet named %s, with gender %s and age %d", name, gender, age);
    }
}
