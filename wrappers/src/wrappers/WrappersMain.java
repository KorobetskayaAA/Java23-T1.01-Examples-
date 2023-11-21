package wrappers;

public class WrappersMain {
  public static void main(String[] args) {
    Integer a = new Integer(100);
    Integer b = new Integer(100);
    Integer c = a + b;

    System.out.println(a + " + " + b + " = " + c); // 100 + 100 = 200
    
    Integer a1 = new Integer(100);
    Integer b1 = new Integer(100);
    System.out.println("Create objects");
    System.out.println(a1 == b1);
    System.out.println(a1.equals(b1));

    Integer a2 = 100;
    Integer b2 = 100;
    System.out.println("Autoboxing");
    System.out.println(a2 == b2);
    System.out.println(a2.equals(b2));
  }
}
