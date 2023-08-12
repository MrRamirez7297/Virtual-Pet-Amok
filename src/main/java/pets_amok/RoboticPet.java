package pets_amok;

public abstract class RoboticPet extends VirtualPet {
    protected int energy;

    protected int rust;

    protected RoboticPet(String name) {
        super(name);
        this.energy = 50;
        this.rust = 50;
    }

    protected RoboticPet(String name, int health, int happiness, int energy, int rust) {
        super(name, health, happiness);
        this.energy = energy;
        this.rust = rust;
    }

    protected int getEnergy() {
        return energy;
    }

    protected int getRust() {
        return rust;
    }

    protected void setEnergy(int energy) {
        this.energy = energy;
    }

    protected void setRust(int rust) {
        this.rust = rust;
    }

    protected void charge() {

    }

    protected void oil() {

    }
}
