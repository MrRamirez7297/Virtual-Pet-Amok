package pets_amok;

import java.util.Scanner;

public class PetShelterApp {
    public static void main(String[] args) {
        PetShelter shelter = new PetShelter();

        OrganicDog organicPet1 = new OrganicPet("Bob", "Dog");
        OrganicPet organicPet2 = new OrganicPet("Rick", "Cat");
        RoboticPet roboticPet1 = new RoboticPet("Sparky", "Dog");
        RoboticPet roboticPet2 = new RoboticPet("Milo", "Cat");

        shelter.addPet(organicPet1);
        shelter.addPet(organicPet2);
        shelter.addPet(roboticPet1);
        shelter.addPet(roboticPet2);

        Scanner scan = new Scanner(System.in);

        while (true) {

            shelter.shelterTime();
            System.out.println("Here are all the Pets at our shelter!");
            displayPets(shelter);
            System.out.println("What would you like to do?");
            System.out.println("Press 1: Add a new pet? ");
            System.out.println("Press 2: Adopt a pet? ");
            System.out.println("Press 3: Feed the organic pets? ");
            System.out.println("Press 4: Charge the robotic pets? ");
            System.out.println("Press 5: Give the organic pets water? ");
            System.out.println("Press 6: Oil the robotic pets? ");
            System.out.println("Press 7: Play with a pet? ");
            System.out.println("Press 8: Clean all the pets cages? ");
            System.out.println("Press 9: Walk all the pets? ");
            System.out.println("Press 0: Exit shelter");

            String input = scan.nextLine();

            String name;

            switch (input) {
                
                case "1":
                    System.out.println("What is the name of this pet?");
                    name = scan.nextLine();
                    System.out.println("What type of animal is this pet?");
                    String type = scan.nextLine();
                    System.out.printf(" %s has been added to the shelter! \n", name);
                    shelter.addPet(new VirtualPet(name, type));
                    break;

            }
        }

    }

    private static void displayPets(PetShelter shelter) {
        System.out.println(" Organic Pets ");
        System.out.println(" Name   |  Type  | Health | Happiness | Hunger | Thirst | ");
        System.out.println("--------|--------|--------|-----------|--------|--------|");
       // for ()
    }
}
