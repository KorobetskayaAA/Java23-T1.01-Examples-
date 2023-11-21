import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CatsCatalog {
  List<Cat> cats = new ArrayList<Cat>();

  public Cat[] getAllCats() {
    return (Cat[]) cats.toArray();
  }

  public Cat getCat(UUID id) {
    for (var cat : cats) {
      if (cat.hasId(id)) {
        return cat;
      }
    }
    return null;
  }

  public void addCat(Cat cat) {
    if (!cats.contains(cat)) {
      cats.add(cat);
    }
  }

  public boolean removeCat(Cat cat) {
    return cats.remove(cat);
  }

  public boolean removeCat(UUID id) {
    var catToRemove = getCat(id);
    return removeCat(catToRemove);
  }

  public class Categories {
    public String[] getAllCategories() {
      var categories = new ArrayList<String>();
      for (var cat : cats) {
        for (var category : cat.getCategories()) {
          if (!categories.contains(category)) {
            categories.add(category);
          }
        }
      }
      return (String[]) categories.toArray();
    }

    public Cat[] getCatsInCategory(String category) {
      var catsInCategory = new ArrayList<Cat>();
      for (var cat : cats) {
        if (cat.isInCategory(category)) {
          catsInCategory.add(cat);
        }
      }
      return (Cat[]) catsInCategory.toArray();
    }
  }
}
