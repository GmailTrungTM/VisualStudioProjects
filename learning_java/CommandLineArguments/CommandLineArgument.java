public class CommandLineArgument {
  public static void main(String[] args) {
    
    int length = args.length;
    if(length == 0){
      System.out.println("No inputs provided");
    } else {
      System.out.println("List of Arguments");
      for(int i=0; i<length; i++){
        System.out.println(args[i]);
      }
    }
  }
}
