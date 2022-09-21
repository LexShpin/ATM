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

    }

}
