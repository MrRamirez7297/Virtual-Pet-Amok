package pets_amok;

public abstract class VirtualPets {
    protected String name;

    protected int health;

    protected int happiness;

    protected VirtualPets(String name) {
        this.name = name;
        this.health = 50;
        this.happiness = 50;
    }

    protected VirtualPets(String name, int health, int happiness) {
        this.name = name;
        this.health = health;
        this.happiness = happiness;
    }

    protected String getName() {
        return name;
    }

    protected int getHealth() {
        return health;
    }

    protected int getHappiness() {
        return happiness;
    }

    protected void setHealth(int health) {
        this.health = health;
    }

    protected void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    protected void time() {
        health += 1;
        happiness += 1;
    }

    protected void play() {
        happiness -= 20;
        health -= 10;
    }
}
