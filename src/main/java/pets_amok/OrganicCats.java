package pets_amok;

public class OrganicCats extends OrganicPets implements Cats{
    public OrganicCats(String name) {
        super(name);
    }

    public OrganicCats(String name, int health, int happiness, int hunger, int thirst) {
        super(name, health, happiness, hunger, thirst);
    }

    public void change() {
        happiness -= 30;
        health -= 20;
    }

}
