package pets_amok;

public class OrganicCat extends OrganicPet implements Pets{
    public OrganicCat(String name){
        super(name);
}
    public OrganicCat(String name, int health, int happiness, int hunger, int thirst){
        super(name, health, happiness, hunger, thirst);
    }
	
	public void walk() {

    
    }

}