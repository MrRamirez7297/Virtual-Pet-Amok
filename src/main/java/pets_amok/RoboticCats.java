package pets_amok;

public class RoboticCats extends RoboticPet {
    public RoboticCats(String name) {
        super(name);
    }

    public RoboticCats(String name, int health, int happiness, int energy, int rust) {
        super(name, health, happiness, energy, rust);
    }

    public void walk() {
        if (happiness >= 0){
            happiness += 50;
        }

    }

}
