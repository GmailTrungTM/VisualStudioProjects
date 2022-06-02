public class BankAccount {
  
  static String bankName = "Bank Of America";
  String accountHoldersName = "John";
  int accountNumber = "13245";
  double balance = 1000909.20234;
  String type = "Savings";
  boolean active = false;

  public static void main(String[] args) {
    double loanInterestRate = 7.5;
    System.out.println(loanInterestRate);

    System.out.println(BankAccount.bankName);
    BankAccount bankAccount = new BankAccount();
    // bankAccount.accountHoldersName = "John";
    // bankAccount.accountNumber = "123232323";
    // bankAccount.balance = 20000f;
    System.out.println(bankAccount.balance);
  }
}
