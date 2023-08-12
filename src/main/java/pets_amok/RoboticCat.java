package pets_amok;

public class RoboticCat extends RoboticPet implements Pets {
    public RoboticCat(String name) {
        super(name);
    }

    public RoboticCat(String name, int health, int happiness, int energy, int rust) {
        super(name, health, happiness, energy, rust);
    }

    public void walk() {

    }

}
