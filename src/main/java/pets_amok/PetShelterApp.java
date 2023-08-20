package pets_amok;

import java.util.Scanner;

public class PetShelterApp {
    public static void main(String[] args) {
        PetShelter shelter = new PetShelter();

        OrganicPet organicPet1 = new OrganicDog("Bob", "Dog");
        OrganicPet organicPet2 = new OrganicCat("Rick", "Cat");
        RoboticPet roboticPet1 = new RoboticDog("Sparky", "Dog");
        RoboticPet roboticPet2 = new RoboticCat("Milo", "Cat");

        shelter.addPet((OrganicDog) organicPet1);
        shelter.addPet((OrganicCat) organicPet2);
        shelter.addPet((RoboticDog) roboticPet1);
        shelter.addPet((RoboticCat) roboticPet2);

        shelter.shelterTime();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println();
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
            System.out.println("Press 8: Clean a pets cage? ");
            System.out.println("Press 9: Walk a pet? ");
            System.out.println("Press 0: Exit shelter");

            String input = scan.nextLine();

            String name;

            switch (input) {

                // case "1":
                // System.out.println("What is the name of this pet?");
                // name = scan.nextLine();
                // System.out.println("Is this a Robotic or Organic pet?");
                // String type = scan.nextLine();
                // System.out.printf(" %s has been added to the shelter! \n", name);
                // shelter.addPet(new VirtualPet(name, type));
                // break;

                case "2":
                    System.out.println("Which pet do you want to adopt?");
                    name = scan.nextLine();
                    System.out.printf("Ok, you adopted %s \n", name);
                    shelter.removePet(name);
                    break;

                case "3":
                    System.out.println("Ok, you fed the Organic pets!");
                    shelter.feedAll();
                    break;

                case "4":
                    System.out.println("Ok, you charged the Robotic pets!");
                    shelter.chargeAll();
                    break;

                case "5":
                    System.out.println("Ok, you gave the Organic pets water!");
                    shelter.waterAll();
                    break;

                case "6":
                    System.out.println("Ok, you oiled the Robotic pets water!");
                    shelter.oilAll();
                    break;

                case "7":
                    System.out.println("Ok, which pet would you like to play with?");
                    displayPets(shelter);
                    name = scan.nextLine();
                    System.out.printf("Ok, you played with %s \n", name);
                    shelter.playSingle(name);
                    break;

                case "8":
                    System.out.println("Ok, which pet's cage do you want to clean?");
                    displayPets(shelter);
                    name = scan.nextLine();
                    System.out.printf("Ok, you cleaned %s cage \n", name);
                    break;

                case "9":
                    System.out.println("Ok, which pet do you want to walk?");
                    displayPets(shelter);
                    name = scan.nextLine();
                    System.out.printf("Ok, you walked %s !\n", name);
                    break;

                case "0":
                    System.out.println("You are exiting.");
                    System.exit(0);
                default:
                    break;

            }
        }

    }

    private static void displayPets(PetShelter shelter) {
        System.out.println();
        System.out.println("                     Organic Pets ");
        System.out.println();
        System.out.println(" Name   |  Type  | Health | Happiness | Hunger | Thirst | ");
        System.out.println("--------|--------|--------|-----------|--------|--------|");
        for (OrganicDog pet : shelter.getOrganicDog()) {
            System.out.printf("%-8s|%-7s |%-8s|%-10s |%-8s|%-8s|\n", pet.getName(), pet.getType(), pet.getHealth(),
                    pet.getHappiness(),
                    pet.getHunger(), pet.getThirst());
        }
        for (OrganicCat pet : shelter.getOrganicCat()) {
            System.out.printf("%-8s|%-7s |%-8s|%-10s |%-8s|%-8s|\n", pet.getName(), pet.getType(), pet.getHealth(),
                    pet.getHappiness(),
                    pet.getHunger(), pet.getThirst());
        }
        System.out.println();
        System.out.println("                     Robotic Pets ");
        System.out.println();
        System.out.println(" Name   |  Type  | Health | Happiness | Energy |  Rust  | ");
        System.out.println("--------|--------|--------|-----------|--------|--------|");
        for (RoboticDog pet : shelter.getRoboticDog()) {
            System.out.printf("%-8s|%-7s |%-8s|%-10s |%-8s|%-8s|\n", pet.getName(), pet.getType(), pet.getHealth(),
                    pet.getHappiness(),
                    pet.getEnergy(), pet.getRust());
        }
        for (RoboticCat pet : shelter.getRoboticCat()) {
            System.out.printf("%-8s|%-7s |%-8s|%-10s |%-8s|%-8s|\n", pet.getName(), pet.getType(), pet.getHealth(),
                    pet.getHappiness(),
                    pet.getEnergy(), pet.getRust());
        }
        System.out.println();
    }

}