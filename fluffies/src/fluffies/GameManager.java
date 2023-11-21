package fluffies;

import java.util.Scanner;

public class GameManager {
  private static Scanner sc = new Scanner(System.in);
  private static Pet pet = null;

  private static void printPet(String message) {
    System.out.println(pet.getFullName() + " " + message);
  }

  private static void createNewPet() {
    System.out.print("Which pet would you like? (" + PetFabric.AVALIABLE_PETS + ") ");
    String petType = sc.next();
    System.out.print("What's its name? ");
    String petName = sc.next();
    pet = PetFabric.create(petType, petName);
    if (pet != null) {
      printPet("was born!");
    } else {
      System.err.println("Wrong pet type");
    }
  }

  public static void play() {
    while (true) {
      if (pet != null) {
        System.out.println(pet);
        System.out.println("What would you like to do with " + pet.getName() + "?");
        pet.grow();
      } else {
        System.out.println("Create new pet with NEW command");
      }
      String command = sc.next();
      switch (command.toLowerCase()) {
      case "new":
        createNewPet();
        break;
      case "rest":
        if (pet != null) {
          printPet(pet.idle());
        }
        break;
      case "sleep":
        if (pet != null) {
          printPet(pet.sleep());
        }
        break;
      case "feed":
        if (pet != null) {
          System.out.print("Choose food type: (" + FoodFabric.AVALIABLE_FOOD + ")");
          Food food = FoodFabric.create(sc.next());
          if (food == null) {
            System.err.println("Wrong food type");
          } else {
            printPet(pet.eat(food));
          }
        }
        break;
      case "play":
        if (pet != null && pet instanceof Cat) {
          printPet(((Cat) pet).play());
        }
        break;
      case "exit":
        System.out.println("Bye!");
        sc.close();
        return;
      default:
        System.out.println("Unknown command");
        break;
      }
    }
  }
}
