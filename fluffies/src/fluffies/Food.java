package fluffies;

public record Food(int type, double nutrition) {
  public final static int FOOD_TYPE_MEAT = 1;
  public final static int FOOD_TYPE_FISH = 2;
  public final static int FOOD_TYPE_MILK = 3;
  public final static int FOOD_TYPE_VEGETABLES = 4;
  public final static int FOOD_TYPE_FRUIT = 5;
  public final static int FOOD_TYPE_GRASS = 6;
  
}
