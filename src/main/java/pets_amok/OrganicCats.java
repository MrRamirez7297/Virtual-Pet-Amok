package pets_amok;

public class OrganicCats extends OrganicPet {
    public OrganicCats(String name){
        super(name);
}
    public OrganicCats(String name, int health, int happiness, int hunger, int thirst){
        super(name, health, happiness, hunger, thirst);
    }
	
	public void walk() {
        if (happiness >= 0){
            happiness += 50;
        }

    
    }

}