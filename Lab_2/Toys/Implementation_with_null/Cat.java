class Cat implements Animal {
    private final String name;
    
    Cat(String name) { 
        this.name = name;
    }

    public String vocalise() { 
        return "Meow";
    }

    @Override
    public String toString() {
        return String.format("Cat named %s", this.name);
    }
}

