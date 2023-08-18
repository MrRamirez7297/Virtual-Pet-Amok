package pets_amok;

public class OrganicDog extends OrganicPet implements Pets {

    public OrganicDog(String name, String type) {
        super(name, type);
    }

    public OrganicDog(String name, String type, int health, int happiness, int hunger, int thirst) {
        super(name, type, health, happiness, hunger, thirst);
    }

    public void walk() {
        
    }

}
