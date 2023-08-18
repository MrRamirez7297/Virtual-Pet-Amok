package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PetShelter {
  Map<String, OrganicDog> organicDog = new HashMap<>();
  Map<String, OrganicCat> organicCat = new HashMap<>();
  Map<String, RoboticDog> roboticDog = new HashMap<>();
  Map<String, RoboticCat> roboticCat = new HashMap<>();
  Map<String, OrganicPet> organicPet = new HashMap<>();

  public Collection<OrganicDog> getOrganicDog() {
    return organicDog.values();
  }

  public Collection<OrganicCat> getOrganicCat() {
    return organicCat.values();
  }

  public Collection<RoboticDog> getRoboticDog() {
    return roboticDog.values();
  }

  public Collection<RoboticCat> getRoboticCats() {
    return roboticCat.values();
  }

  public Collection<OrganicPet> getOrganicPets() {
    return organicPet.values();
  }

  // public boolean addPet(VirtualPet pet) {
  //   if (organicDog.addPet(name)){
  //     organicDog.put(pet).addPet();
  //   }
  public void addPet(OrganicDog pet) {
    organicDog.put(pet.getName(), pet);
  }

  public void addPet(OrganicCat pet) {
    organicCat.put(pet.getName(), pet);
  }

  public void addPet(RoboticDog pet) {
    roboticDog.put(pet.getName(), pet);
  }

  public void addPet(RoboticCat pet) {
    roboticCat.put(pet.getName(), pet);
  }

  public boolean removePet(String name) {
    if (organicDog.containsKey(name)) {
      organicDog.get(name).remove();
    } else if (organicCat.containsKey(name)) {
      organicCat.get(name).remove();
    } else if (roboticDog.containsKey(name)) {
      roboticDog.get(name).remove();
    } else if (roboticCat.containsKey(name)) {
      roboticCat.get(name).remove();
    } else {
      return false;
    }
    return true;
  }

  public void feedAll() {
    for (var pet : organicDog.values()) {
      pet.feed();
    }
    for (var pet : organicCat.values()) {
      pet.feed();
    }
  }

  public void chargeAll() {
    for (var pet : roboticDog.values()) {
      pet.charge();
    }
    for (var pet : roboticCat.values()) {
      pet.charge();
    }
  }

  public void waterAll() {
    for (var pet : organicDog.values()) {
      pet.water();
    }
    for (var pet : organicCat.values()) {
      pet.water();
    }
  }

  public void oilAll() {
    for (var pet : roboticDog.values()) {
      pet.oil();
    }
    for (var pet : roboticCat.values()) {
      pet.oil();
    }

  }

  public boolean playSingle(String name) {
    if (organicDog.containsKey(name)) {
      organicDog.get(name).play();
    } else if (organicCat.containsKey(name)) {
      organicCat.get(name).play();
    } else if (roboticDog.containsKey(name)) {
      roboticDog.get(name).play();
    } else if (roboticCat.containsKey(name)) {
      roboticCat.get(name).play();
    } else {
      return false;
    }
    return true;
  }

  public boolean cleanCage(String name) {
    if (organicDog.containsKey(name)) {
      organicDog.get(name).clean();
    } else if (organicCat.containsKey(name)) {
      organicCat.get(name).clean();
    } else if (roboticDog.containsKey(name)) {
      roboticDog.get(name).clean();
    } else if (roboticCat.containsKey(name)) {
      roboticCat.get(name).clean();
    } else {
      return false;
    }
    return true;
  }

  public boolean walk(String name) {
    if (organicDog.containsKey(name)) {
      organicDog.get(name).walk();
    } else if (organicCat.containsKey(name)) {
      organicCat.get(name).walk();
    } else if (roboticDog.containsKey(name)) {
      roboticDog.get(name).walk();
    } else if (roboticCat.containsKey(name)) {
      roboticCat.get(name).walk();
    } else {
      return false;
    }
    return true;
  }

  public void shelterTime() {
    for (var pet : organicDog.values()) {
      pet.time();
    }
  }

}
