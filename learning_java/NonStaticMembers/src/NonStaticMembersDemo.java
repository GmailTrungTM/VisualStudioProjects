public class NonStaticMembersDemo {
  
  int num;

  // Constructor
  NonStaticMembersDemo(){
    System.out.println("Inside the constructor");
  }

  // Non Static Block
  {
    System.out.println("Inside the non static block");
  }

  // Main Method
  public static void main(String[] args) {
    System.out.println("inside the main method");
    NonStaticMembersDemo obj = new NonStaticMembersDemo();
    
    obj.doSomething();
  }

  // Static Block
  static{
    System.out.println("Inside the static block");
  }

  // Method
  void doSomething(){
    System.out.println("Inside doSomething");
  }
}
