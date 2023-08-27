package pets_amok;

public abstract class OrganicPets extends VirtualPets {
    protected int hunger;

    protected int thirst;

    protected OrganicPets(String name) {
        super(name);
        this.hunger = 50;
        this.thirst = 50;
    }

    protected OrganicPets(String name, int health, int happiness, int hunger, int thirst) {
        super(name, health, happiness);
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
        thirst += 10;
        happiness -= 10;
    }

    protected void water() {
        if (thirst >= 50) {
            thirst -= 50;
        }
        happiness -= 15;
    }

}
