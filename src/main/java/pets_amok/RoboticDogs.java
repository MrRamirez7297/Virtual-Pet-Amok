package pets_amok;

public class RoboticDogs extends RoboticPet implements Dog {

    public RoboticDogs(String name) {
        super(name);
    }

    public RoboticDogs(String name, int health, int happiness, int energy, int rust) {
        super(name, health, happiness, energy, rust);
    }

    public void walk() {

        if (happiness >= 0) {
            happiness += 50;
        }
    }

    public void clean() {
    }

}
