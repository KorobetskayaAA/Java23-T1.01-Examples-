package fluffies;

public class Cat extends Pet{

  public Cat(String name) {
    super(name);
  }

  @Override
  public String getType() {
    return "Cat";
  }

  @Override
  public String eat(Food food) {
    switch (food.type()) {
      case Food.FOOD_TYPE_MEAT: 
        increaseHunger(-food.nutrition());
        increaseHappiness(+1);
        return "eats happily";
      case Food.FOOD_TYPE_FISH:
      case Food.FOOD_TYPE_MILK : 
        increaseHunger(-food.nutrition() / 2);
        return "eats with tension";
      default: 
        increaseHappiness(-2);
        return "refuses to eat";
    }
  }

  @Override
  public String sleep() {
    if (getHunger() > 8) {
      return "is too hungry to sleep";
    }
    increaseTiredness(-5);
    return "sleeps soundly";
  }

  public String play() {
    if (getTiredness() > 8) {
      return "is too tired to play";
    }
    increaseTiredness(3);
    increaseHappiness(5);
    return "plays with its own tail";
  }
}
