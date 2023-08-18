package pets_amok;

public class RoboticDog extends RoboticPet implements Pets {

    public RoboticDog(String name, String type) {
        super(name, type);
    }

    public RoboticDog(String name, String type, int health, int happiness, int energy, int rust) {
        super(name, type, health, happiness, energy, rust);
    }

    public void walk() {

    }

}
