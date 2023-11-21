import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cat {
  public Cat(UUID id, String name) {
    this.id = id;
    this.name = name;
  }

  public Cat(String id, String name) {
    this(UUID.fromString(id), name);
  }
  
  public Cat(String name) {
    this(UUID.randomUUID(), name);
  }
  
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Cat) {
       return this.id.equals(((Cat)obj).getId());
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return id.hashCode() + 1;
  }
  
  // Id
  private final UUID id;

  public UUID getId() {
    return id;
  }

  public boolean hasId(UUID id) {
    return id.equals(id);
  }
  
  // Name
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  // Categories
  private List<String> categories = new ArrayList<String>();
  
  public String[] getCategories() {
    return (String[]) categories.toArray();
  }
  
  public boolean isInCategory(String category) {
    return categories.contains(category);
  }
  
  public void addCategory(String category) {
    if (!categories.contains(category)) {
      categories.add(category);
    }
  }
  
  public boolean removeCategory(String category) {
    return categories.remove(category);
  }
  
  // Prices
  private long price;
  private final static long NULL_PRICE = -1;
  private long oldPrice = NULL_PRICE;

  public double getPrice() {
    return price / 100.0;
  }
  
  public Double getOldPrice() {
    if (oldPrice == NULL_PRICE) {
      return null;
    }
    return oldPrice / 100.0;
  }
  
  public void setPrice(long priceKopeks) {
    oldPrice = price;
    price = priceKopeks;
  }
  
  public void setPrice(double priceRubles) {
    setPrice(Math.round(priceRubles * 100));
  }

  public void setPrice(int priceRubles, int priceKopeks) {
    setPrice(priceRubles * 100 + priceKopeks);
  }

  // Cuteness
  private final static double MAX_CUTENESS = 5;
  private final static double MIN_CUTENESS = 0;
  private double cuteness;

  public double getCuteness() {
    return cuteness;
  }

  public void setCuteness(double cuteness) {
    this.cuteness = cuteness > MAX_CUTENESS ? MAX_CUTENESS 
        : cuteness < MIN_CUTENESS ? MIN_CUTENESS 
            : cuteness;
  }

  public double cute() {
    setCuteness(cuteness + 1);
    return getCuteness();
  }

  public void star() {
    cuteness = 5;
  }

  // Rating
  private final static double RATING_SCALE = 5.0;
  private int likesSum = 0;
  private int likesCount = 0;

  public double getRating() {
    if (likesCount == 0)
      return 0;
    return RATING_SCALE * likesSum / likesCount;
  }

  public void like() {
    likesSum += 1;
    likesCount++;
  }

  public void dislike() {
    likesSum -= 1;
    likesCount++;
  }

  private String description;
  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
