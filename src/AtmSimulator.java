import java.util.Scanner;

public class AtmSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double currentBalance = 5000.00;
        int choice;

        while (true) {
            System.out.println("\n===== Welcome to the Simple Console ATM! =====");
            System.out.println("===== Please select an option: =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance: $" + currentBalance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        currentBalance += deposit;
                        System.out.println("Deposited $" + deposit + " successfully!");
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdraw amount: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw <= 0) {
                        System.out.println("Invalid amount!");
                    }
                    else if (withdraw > 100) {
                        System.out.println("Maximum withdraw limit is 100 per transaction");
                    }
                    else if (withdraw > currentBalance) {
                        System.out.println("Insufficient funds!");
                    } else {
                        currentBalance -= withdraw;
                        System.out.println("Withdrawal successful. Remaining balance: $" + currentBalance);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM! Goodbye");
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
