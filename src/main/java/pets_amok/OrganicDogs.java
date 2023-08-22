package pets_amok;

public class OrganicDogs extends OrganicPet implements Dog {

    public OrganicDogs(String name) {
        super(name);
    }

    public OrganicDogs(String name, int health, int happiness, int hunger, int thirst) {
        super(name, health, happiness, hunger, thirst);
    }

    public void walk() {
        
        if (happiness >= 0){
            happiness += 50;
        }
    }
    public void clean(){}

}
