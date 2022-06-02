public class PrimitiveAndObject {
  public static void main(String[] args) {
    int i = 100;
    Integer y = Integer.valueOf(i);

    int z = y.intValue();

    System.out.println(z);
  }
}
