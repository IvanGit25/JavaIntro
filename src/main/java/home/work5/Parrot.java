package home.work5;

public class Parrot extends Pet {

    // Parrot characteristics
    private String color;
    private boolean isFlying;
    private final boolean canTalk;

    public Parrot(String name, int age, double weight, boolean isMale, String color, boolean canTalk) {
        super(name,age,weight,isMale);
        setColor(color);
        this.canTalk = canTalk;
        this.isFlying = true;

    }

    public void printInfo() {
        System.out.printf("Parrot name is: %s. Age is: %d. It weights: %.2f. Gender is Male: %b. " +
                        "Color is: %s, and can talk: %b%n",
                getName(), getAge(), getWeight(), isMale(), getColor(), canTalk());
    }

    // Getters and Setters
    public String getColor() {
        return color;
    }

    public boolean canTalk() {
        return canTalk;
    }

    public boolean isFlying(){
        return isFlying;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            System.out.println("ERROR: Empty input for color!");
            return;
        }
        this.color = color;
    }

    public void fly() {
        isFlying = true;
        System.out.println(getName() + " is flying!");
    }

    public void stopFlying() {
        isFlying = false;
        System.out.println(getName() + " stopped flying!");
    }
}


