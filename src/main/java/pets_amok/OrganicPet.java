package pets_amok;

public abstract class OrganicPet extends VirtualPet {
    protected int hunger;

    protected int thirst;

    protected OrganicPet(String name) {
        super(name);
        this.hunger = 50;
        this.thirst = 50;
    }

    protected OrganicPet(String name, int health, int happiness, int hunger, int thirst) {
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

    }

    protected void water() {

    }

    public void getType() {
    }

}
