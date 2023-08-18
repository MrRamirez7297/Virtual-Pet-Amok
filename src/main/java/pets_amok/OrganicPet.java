package pets_amok;

public abstract class OrganicPet extends VirtualPet {
    protected int hunger;

    protected int thirst;

    protected OrganicPet(String name, String type) {
        super(name, type);
        this.hunger = 50;
        this.thirst = 50;
    }

    protected OrganicPet(String name, String type, int health, int happiness, int hunger, int thirst) {
        super(name, type, health, happiness);
        this.hunger = hunger;
        this.thirst = thirst;
    }

    protected int getHunger() {
        return hunger;
    }

    protected int getThirst() {
        return thirst;
    }

    protected void setHunger(int hunger) {
        this.hunger = hunger;
    }

    protected void setThirst(int thirst) {
        this.thirst = thirst;
    }

    protected void feed() {
        if (hunger >= 50) {
            hunger -= 50;
        }
        thirst += 5;
        happiness -= 5;
    }

    protected void water() {

    }

}
