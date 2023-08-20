package pets_amok;

public class OrganicCat extends OrganicPet implements Pets{
    public OrganicCat(String name, String type){
        super(name, type);
}
    public OrganicCat(String name, String type, int health, int happiness, int hunger, int thirst){
        super(name, type, health, happiness, hunger, thirst);
    }
	
	public void walk() {
        if (happiness >= 0){
            happiness += 50;
        }

    
    }

}