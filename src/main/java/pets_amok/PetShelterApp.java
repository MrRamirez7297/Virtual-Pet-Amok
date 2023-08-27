package pets_amok;

import java.util.Scanner;

public class PetShelterApp {
    public static void main(String[] args) {
        PetShelter shelter = new PetShelter();

        shelter.addPet(new OrganicDogs("Dio"));
        shelter.addPet(new OrganicCats("Ricky"));
        shelter.addPet(new RoboticDogs("Sparky"));
        shelter.addPet(new RoboticCats("Milo"));

        Scanner scan = new Scanner(System.in);

        while (true) {
            shelter.shelterTime();
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
            System.out.println("Press 8: Clean the dogs cages? ");
            System.out.println("Press 9: Clean the cats litter box? ");
            System.out.println("Press 10: Walk the dogs?? ");
            System.out.println("Press 0: Exit shelter");

            String input = scan.nextLine();

            String name;

            switch (input) {

                case "1":
                    admitPet(shelter, scan);
                    break;

                case "2":
                    System.out.println("Which pet do you want to adopt?");
                    displayPets(shelter);
                    name = scan.nextLine();
                    System.out.printf("Ok, you adopted %s \n", name);
                    shelter.removePet(name);
                    break;

                case "3":
                    System.out.println("Ok, you fed the Organic pets!");
                    shelter.feed();
                    break;

                case "4":
                    System.out.println("Ok, you charged the Robotic pets!");
                    shelter.charge();
                    break;

                case "5":
                    System.out.println("Ok, you gave the Organic pets water!");
                    shelter.water();
                    break;

                case "6":
                    System.out.println("Ok, you oiled the Robotic pets!");
                    shelter.oil();
                    break;

                case "7":
                    System.out.println("Ok, which pet would you like to play with?");
                    displayPets(shelter);
                    name = scan.nextLine();
                    System.out.printf("Ok, you played with %s \n", name);
                    shelter.playSingle(name);
                    break;

                case "8":
                    System.out.println("Ok, you cleaned all the dogs cages!");
                    shelter.cleanCage();
                    break;

                case "9":
                    System.out.println("Ok, you cleaned the cats litterbox!");
                    shelter.change();
                    break;

                case "10":
                    System.out.println("Ok, you walked all the dogs!");
                    shelter.walkDogs();
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
        System.out.println(" Name   | Health | Happiness | Hunger | Thirst | ");
        System.out.println("--------|--------|-----------|--------|--------|");
        for (OrganicDogs pet : shelter.getOrganicDogs()) {
            System.out.printf("%-8s|%-7s |%-11s|%-8s|%-8s|\n", pet.getName(), pet.getHealth(),
                    pet.getHappiness(),
                    pet.getHunger(), pet.getThirst());
        }
        for (OrganicCats pet : shelter.getOrganicCats()) {
            System.out.printf("%-8s|%-7s |%-11s|%-8s|%-8s|\n", pet.getName(), pet.getHealth(),
                    pet.getHappiness(),
                    pet.getHunger(), pet.getThirst());
        }
        System.out.println();
        System.out.println("                     Robotic Pets ");
        System.out.println();
        System.out.println(" Name   | Health | Happiness | Energy |  Rust  | ");
        System.out.println("--------|--------|-----------|--------|--------|");
        for (RoboticDogs pet : shelter.getRoboticDogs()) {
            System.out.printf("%-8s|%-7s |%-11s|%-8s|%-8s|\n", pet.getName(), pet.getHealth(),
                    pet.getHappiness(),
                    pet.getEnergy(), pet.getRust());
        }
        for (RoboticCats pet : shelter.getRoboticCats()) {
            System.out.printf("%-8s|%-7s |%-11s|%-8s|%-8s|\n", pet.getName(), pet.getHealth(),
                    pet.getHappiness(),
                    pet.getEnergy(), pet.getRust());
        }
        System.out.println();
    }

    public static void admitPet(PetShelter shelter, Scanner scan) {
        System.out.println("What is the name of this pet?");
        String name = scan.nextLine();
        System.out.println("1 -- Robotic Dog");
        System.out.println("2 -- Robotic Cat");
        System.out.println("3 -- Organic Dog");
        System.out.println("4 -- Organic Cat");

        String input = scan.nextLine();

        switch (input) {
            case "1":
                shelter.addPet(new RoboticDogs(name));
                break;

            case "2":
                shelter.addPet(new RoboticCats(name));
                break;

            case "3":
                shelter.addPet(new OrganicDogs(name));
                break;

            case "4":
                shelter.addPet(new OrganicCats(name));
                break;
            default:
                break;

        }
        System.out.printf(" %s has been added to the shelter! \n", name);
    }

}