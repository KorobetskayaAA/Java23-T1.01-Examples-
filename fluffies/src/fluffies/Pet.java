package fluffies;

public abstract class Pet {
   private String name;
   private int age;
   private final static double MAX_ATTRIBUTE = 10.0;
   private final static double DEFAULT_ATTRIBUTE = 5.0;
   private final static double MIN_ATTRIBUTE = 0.0;
   private double hunger = DEFAULT_ATTRIBUTE;
   private double happiness = DEFAULT_ATTRIBUTE;
   private double tiredness = DEFAULT_ATTRIBUTE;
   
   public Pet(String name) {
     this.name = name;
   }
   
   // Public attributes
   abstract public String getType();
   
   public String getName() {
     return name;
   }
   
   public String getFullName() {
     return name + " the " + getType();
   }
   
   public int getAge() {
     return age;
   }
   
   public double getHunger() {
     return hunger;
   }

   public double getHappiness() {
     return happiness;
   }
   
   public double getTiredness() {
     return tiredness;
   }
   
   public String toString() {
     return String.format("%s: AGE %d HUNGER %.2f HAPPINESS %.2f TIREDNESS %.2f", name, age, hunger, happiness, tiredness);
   }
   
   // Public actions
   public final void grow() {
     increaseHunger(1);
     increaseTiredness(1);
     increaseHappiness(-1);
     age++;
   }
   
   public String idle() {
     return "does nothing";
   }
   public abstract String eat(Food food);
   public abstract String sleep();
   
   // Protected zone
   private double getLimitedAttribute(double attributeValue) {
     if (attributeValue >= MAX_ATTRIBUTE)
       return MAX_ATTRIBUTE;
     if (attributeValue <= MIN_ATTRIBUTE)
       return MIN_ATTRIBUTE;
     return attributeValue;
   }
   
   protected void increaseHunger(double changeBy) {
     hunger = getLimitedAttribute(hunger + changeBy);
   }
   protected void increaseHappiness(double changeBy) {
     happiness = getLimitedAttribute(happiness + changeBy);
   }
   protected void increaseTiredness(double changeBy) {
     tiredness = getLimitedAttribute(tiredness + changeBy);
   }
   
}
