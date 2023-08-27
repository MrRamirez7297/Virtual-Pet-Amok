package pets_amok;

public class OrganicDogs extends OrganicPets implements Dogs {

    public OrganicDogs(String name) {
        super(name);
    }

    public OrganicDogs(String name, int health, int happiness, int hunger, int thirst) {
        super(name, health, happiness, hunger, thirst);
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
