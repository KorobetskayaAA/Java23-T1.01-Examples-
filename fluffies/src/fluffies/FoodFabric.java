package fluffies;

public class FoodFabric {
  public final static String AVALIABLE_FOOD = "MEAT, FISH, MILK, VEGGIE, FRUIT, GRASS";
  public static Food create(String foodType) {
    switch (foodType.toLowerCase()) {
    case "meat": return new Food(Food.FOOD_TYPE_MEAT, 5);
    case "fish": return new Food(Food.FOOD_TYPE_FISH, 1.5);
    case "milk": return new Food(Food.FOOD_TYPE_MILK, 2);
    case "veggie": return new Food(Food.FOOD_TYPE_VEGETABLES, 2);
    case "fruiy": return new Food(Food.FOOD_TYPE_FRUIT, 3);
    case "frass": return new Food(Food.FOOD_TYPE_GRASS, 1);
    }
    return null;
  }
}
