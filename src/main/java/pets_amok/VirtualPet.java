package pets_amok;

public abstract class VirtualPet {
    protected String name;

    protected String type;

    protected int health;

    protected int happiness;

    protected VirtualPet(String name,String type) {
        this.name = name;
        this.type = type;
        this.health = 50;
        this.happiness = 50;
    }

    protected VirtualPet(String name,String type, int health, int happiness) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.happiness = happiness;
    }

    protected String getName() {
        return name;
    }

    protected String getType() {
        return type;
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
        if (health >= 50){
            health -= 10;
        }
        happiness -= 5;

    }

    protected void clean() {
        happiness += 5;
        health += 10;
    }

    protected void remove() {

    }

    protected void play() {
        happiness += 10;
        health += 5;
    }
}
