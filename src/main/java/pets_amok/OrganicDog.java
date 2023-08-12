package pets_amok;

public class OrganicDog extends OrganicPet implements Pets {

    public OrganicDog(String name) {
        super(name);
    }

    public OrganicDog(String name, int health, int happiness, int hunger, int thirst) {
        super(name, health, happiness, hunger, thirst);
    }

    public void walk() {
    }

}
