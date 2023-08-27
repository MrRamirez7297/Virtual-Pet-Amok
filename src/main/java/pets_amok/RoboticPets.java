package pets_amok;

public abstract class RoboticPets extends VirtualPets {
    protected int energy;

    protected int rust;

    protected RoboticPets(String name) {
        super(name);
        this.energy = 50;
        this.rust = 50;
    }

    protected RoboticPets(String name, int health, int happiness, int energy, int rust) {
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

        if (energy >= 50) {
            energy -= 50;
        }
        rust += 10;
        happiness -= 10;

    }

    protected void oil() {
        if (rust >= 50) {
            rust -= 50;
        }
        happiness -= 10;
    }
}
