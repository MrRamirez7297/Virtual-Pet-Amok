package pets_amok;

public class RoboticCat extends RoboticPet implements Pets {
    public RoboticCat(String name, String type) {
        super(name, type);
    }

    public RoboticCat(String name, String type, int health, int happiness, int energy, int rust) {
        super(name, type, health, happiness, energy, rust);
    }

    public void walk() {
        if (happiness >= 0){
            happiness += 50;
        }

    }

}
