package fluffies;

public class Rabbit extends Pet {

  public Rabbit(String name) {
    super(name);
  }

  @Override
  public String getType() {
    return "Rabbit";
  }

  @Override
  public String eat(Food food) {
    increaseTiredness(0.5);
    switch (food.type()) {
    case Food.FOOD_TYPE_GRASS: 
      increaseHunger(-food.nutrition());
      return "chewing grass";
    case Food.FOOD_TYPE_FRUIT: 
    case Food.FOOD_TYPE_VEGETABLES: 
      increaseHunger(-food.nutrition());
      increaseHappiness(+1);
      return "eats";
    }
    return "refuses to eat this";
  }

  @Override
  public String sleep() {
    increaseTiredness(-2);
    increaseHappiness(1);
    return null;
  }

}
