package pets_amok;

public class RoboticDogs extends RoboticPets implements Dogs {
    public RoboticDogs(String name) {
        super(name);
    }

    public RoboticDogs(String name, int health, int happiness, int energy, int rust) {
        super(name, health, happiness, energy, rust);
    }

    public void walk() {
        happiness -= 40;
        health -= 20;
    }

    public void clean() {
        happiness -= 30;
        health -= 20;
    }

}
