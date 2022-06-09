public class IfElseLadder {
  public static void main(String[] args) {
    int maths = 45;
    int physics = 34;
    int chemistry = 80;

    double average = (maths + physics + chemistry)/3;

    if(maths < 35 || physics < 35 || chemistry < 35 ){
      System.out.println("failed");
    } else if(average <= 59){
      System.out.println("you have an average of: " + average + ", you get a grade C");
    } else if(average <= 69){
      System.out.println("you have an average of: " + average + ", you get a grade B");
    } else {
      System.out.println("you have an average of: " + average + ", you get a grade A");
    }
  }
}
