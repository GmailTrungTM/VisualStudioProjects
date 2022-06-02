public class AllInOne {
  public static void main(String[] args) {
    
    int x = 100;
    String y = Integer.toString(x);
    System.out.println(y);

    Integer b = new Integer(y);
    int z = b.intValue();
    System.out.println(z);

    Integer c = new Integer(z);
    String d = c.toString();
    System.out.println(d);

    int e = Integer.parseInt(d);
    System.out.println(e);
  }
}
