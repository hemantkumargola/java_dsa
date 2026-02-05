import java.util.Scanner;

class ATM {

  private double balance = 0;
  private final int pin = 8520;
  Scanner sc = new Scanner(System.in);

  // PIN check (3 attempts)
  public void check() {

    int attempts = 3;

    while (attempts > 0) {
      System.out.print("Enter your PIN: ");
      int enterPin = sc.nextInt();

      if (enterPin == pin) {
        menu();
        return;
      } else {
        attempts--;
        System.out.println("Invalid PIN ❌ Attempts left: " + attempts);
      }
    }

    System.out.println("Card Blocked 🚫");
  }

  // Menu
  public void menu() {

    while (true) {

      System.out.println("\n===== ATM MENU =====");
      System.out.println("1. Check Balance");
      System.out.println("2. Withdraw");
      System.out.println("3. Deposit");
      System.out.println("4. Exit");

      int opt = sc.nextInt();

      switch (opt) {
        case 1 -> checkBalance();
        case 2 -> withdraw();
        case 3 -> deposit();
        case 4 -> {
          System.out.println("Thank you 🙏");
          return;
        }
        default -> System.out.println("Invalid choice ❌");
      }
    }
  }

  // Check balance
  public void checkBalance() {
    System.out.println("Current Balance: ₹" + balance);
  }

  // Withdraw
  public void withdraw() {

    System.out.print("Enter amount: ");
    double amount = sc.nextDouble();

    if (amount <= 0) {
      System.out.println("Invalid amount ❌");
    } else if (amount > balance) {
      System.out.println("Insufficient balance ❌");
    } else {
      balance -= amount;
      System.out.println("Withdraw successful ✅");
    }
  }

  // Deposit
  public void deposit() {

    System.out.print("Enter amount: ");
    double amount = sc.nextDouble();

    if (amount <= 0) {
      System.out.println("Invalid amount ❌");
      return;
    }

    balance += amount;
    System.out.println("Deposit successful ✅");
  }
}

public class oops4 {
  public static void main(String[] args) {
    ATM atm = new ATM();
    atm.check();
  }
}
