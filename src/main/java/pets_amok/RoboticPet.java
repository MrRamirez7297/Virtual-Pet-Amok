package pets_amok;

public abstract class RoboticPet extends VirtualPets {
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
        
        if (energy >= 50) {
            energy -= 50;
        }
        rust+= 5;
        happiness -= 5;

    }

    protected void oil() {
        if (rust >= 50) {
            rust -= 50;
        }
        happiness -= 5;

    }
}
