import java.util.Scanner;

public class TransactionManager {
    Scanner sc = new Scanner(System.in);
    SavingsAccount savingsAccount = new SavingsAccount();
    CheckingAccount checkingAccount = new CheckingAccount();
    int choose;

    public void transaction() {
        do {
            System.out.println("""
                    Choose Account type:\s
                    1 - Checking Account
                    2 - Savings Account
                    3 - Exit
                    """);
            choose = sc.nextInt();
            switch (choose) {
                case 1:

                    System.out.println("""
                            Choose operation type:\s
                            1 - Deposit
                            2 - Withdraw
                            3 - Exit
                            """);
                    choose = sc.nextInt();
                    switch (choose) {
                        case 1:

                            checkingAccount.deposit();
                            break;
                        case 2:
                            checkingAccount.withdraw();
                            break;
                        case 3:
                            System.out.println("Thank you for your visit!");
                            break;
                        default:
                            break;

                    }
                    break;
                case 2:
                    System.out.println("""
                            Choose operation type:\s
                            1 - Deposit
                            2 - Withdraw
                            3 - Exit
                            """);
                    choose = sc.nextInt();
                    switch (choose) {
                        case 1:
                            savingsAccount.deposit();
                            break;
                        case 2:
                            savingsAccount.withdraw();
                            break;
                        case 3:
                            System.out.println("Thank you for your visit!");
                            break;
                        default:
                            break;

                    }
                    break;
                case 3:
                    System.out.println("Thank you for your visit!");
                    break;
                default:
                    break;
            }
        } while(choose !=3); {
            System.out.println("Thank you for your visit!");
        }
    }
}

