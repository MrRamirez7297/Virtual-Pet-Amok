package pets_amok;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PetShelter {
  private Map<String, VirtualPets> virtualPets = new HashMap<>();

  public Collection<OrganicDogs> getOrganicDogs() {
    Collection<OrganicDogs> cats = new ArrayList<>();
    for (var pet : virtualPets.values())
      if (pet instanceof OrganicDogs)
        cats.add((OrganicDogs) pet);
    return cats;
  }

  public Collection<RoboticDogs> getRoboticDogs() {
    Collection<RoboticDogs> cats = new ArrayList<>();
    for (var pet : virtualPets.values())
      if (pet instanceof RoboticDogs)
        cats.add((RoboticDogs) pet);
    return cats;
  }

  public Collection<OrganicCats> getOrganicCats() {
    Collection<OrganicCats> cats = new ArrayList<>();
    for (var pet : virtualPets.values())
      if (pet instanceof OrganicCats)
        cats.add((OrganicCats) pet);
    return cats;
  }

  public Collection<RoboticCats> getRoboticCats() {
    Collection<RoboticCats> cats = new ArrayList<>();
    for (var pet : virtualPets.values())
      if (pet instanceof RoboticCats)
        cats.add((RoboticCats) pet);
    return cats;
  }

  public Collection<VirtualPets> getVirtualPets() {
    return virtualPets.values();
  }

  public void addPet(VirtualPets pet) {
    virtualPets.put(pet.getName(), pet);
  }

  public boolean removePet(String name) {
    return virtualPets.remove(name) != null;
  }

  public void feed() {
    for (var pet : virtualPets.values())
      if (pet instanceof OrganicPet)
        ((OrganicPet) pet).feed();
  }

  public void charge() {
    for (var pet : virtualPets.values())
      if (pet instanceof RoboticPet)
        ((RoboticPet) pet).charge();
  }

  public void water() {
    for (var pet : virtualPets.values())
      if (pet instanceof OrganicPet)
        ((OrganicPet) pet).water();
  }

  public void oil() {
    for (var pet : virtualPets.values())
      if (pet instanceof RoboticPet)
        ((RoboticPet) pet).oil();
  }

  public boolean playSingle(String name) {
    return virtualPets.get(name) != null;
  }

  public void walkDogs() {
    for (var pet : virtualPets.values())
      if (pet instanceof Dog)
        ((Dog) pet).walk();
  }

  public void cleanCage() {
    for (var pet : virtualPets.values())
      if (pet instanceof Dog)
        ((Dog) pet).clean();
  }

  public void shelterTime() {
    for (var pet : virtualPets.values()) {
      pet.time();
    }
  }

}
