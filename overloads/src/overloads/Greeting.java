package overloads;

public class Greeting {
  public String hello(String greeting, String name) {
    return greeting + ", " + name + "!";
  }
  
  public String hello() {
    return hello("Здравствуйте", "гость");
  }
  
  public String hello(String name) {
    return hello("Здравствуйте", name);
  }

  public String hello(String name, int age) {
    if (age < 25) {
      return hello("Привет", name);
    }
    return hello("Здравствуйте", name);
  }
}
