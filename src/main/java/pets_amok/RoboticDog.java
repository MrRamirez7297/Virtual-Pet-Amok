package pets_amok;

public class RoboticDog extends RoboticPet implements Pets {

    public RoboticDog(String name) {
        super(name);
    }

    public RoboticDog(String name, int health, int happiness, int energy, int rust) {
        super(name, health, happiness, energy, rust);
    }

    public void walk() {

    }

}
