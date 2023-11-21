package fluffies;

public class PetFabric {
  public final static String AVALIABLE_PETS = "Cat, Rabbit";
  public static Pet create(String petType, String petName) {
    switch (petType.toLowerCase()) {
    case "cat": return new Cat(petName);
    case "rabbit": return new Rabbit(petName);
    }
    return null;
  }
}
