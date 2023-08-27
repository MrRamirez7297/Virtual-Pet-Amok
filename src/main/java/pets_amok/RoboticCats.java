package pets_amok;

public class RoboticCats extends RoboticPets implements Cats {
    public RoboticCats(String name) {
        super(name);
    }

    public RoboticCats(String name, int health, int happiness, int energy, int rust) {
        super(name, health, happiness, energy, rust);
    }

    public void change() {
        happiness -= 30;
        health -= 20;
    }

}
