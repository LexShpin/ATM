import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Set up your account: ");
        System.out.println("Your name: ");
        String name = String.valueOf(scanner.nextLine());

        System.out.println("Your balance: ");
        double balance = Double.valueOf(scanner.nextLine());

        ATM account = new ATM(name, balance);
        System.out.println(account);

        loop: while (true) {
            atmMenu();

            int userChoice = Integer.valueOf(scanner.nextLine());

            switch (userChoice) {
                case 1:
                    System.out.println("How much would you like to deposit?");
                    double depositValue = Double.valueOf(scanner.nextLine());
                    account.deposit(depositValue);
                    System.out.println(account);
                    break;
                case 2:
                    System.out.println("How much would you like to withdraw?");
                    double withdrawValue = Double.valueOf(scanner.nextLine());
                    account.withdraw(withdrawValue);
                    System.out.println(account);
                    break;
                case 3:
                    System.out.println(account);
                    break;
                case 4:
                    System.out.println("What's your current balance?");
                    double currentBalance = Double.valueOf(scanner.nextLine());
                    account.updateBalance(currentBalance);
                    System.out.println(account);
                    break;
                case 5:
                    break loop;

            }

        }

    }

    public static void atmMenu() {
        System.out.println("What would you like to do?");
        System.out.println("1. Deposit money");
        System.out.println("2. Withdraw money");
        System.out.println("3. Check my balance");
        System.out.println("4. Update my balance");
        System.out.println("5. Exit the ATM");
    }

}
