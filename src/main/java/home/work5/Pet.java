package home.work5;

public class Pet {

    // instance variables
    private String name;
    private int age;
    private double weight;
    private final boolean isMale;

    // Constructor with params
    public Pet(String name, int age, double weight, boolean isMale) {
        setName(name);
        setAge(age);
        setWeight(weight);
        this.isMale = isMale;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("ERROR: Empty string for name input!");
            return;
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("ERROR: Invalid input for age - " + age);
            return;
        }
        this.age = age;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            System.out.println("ERROR: Weight must be positive numbers!");
            return;
        }
        this.weight = weight;
    }

    // Method - action for all pets
    public void beg() {
        System.out.println(name + " is begging for a cracker");
    }
    public void eat() {
        System.out.println(name + " is eating now.");
    }
}
