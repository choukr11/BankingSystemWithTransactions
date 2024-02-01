import java.util.Scanner;

public class SavingsAccount extends BankAccount {
    Scanner sc = new Scanner(System.in);
    int choose;

    @Override
    public void deposit() {
        super.deposit();

    }

    @Override
    public void withdraw() {
        super.withdraw();
    }

    @Override
    public void displayTransactionHistory(String s) {
        super.displayTransactionHistory(s);
    }

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }
    public void operation() {
        System.out.println("""
                        Choose operation type:\s
                        1 - Deposit
                        2 - Withdraw
                        3 - Check History
                        4 - Exit
                        """);
        choose = sc.nextInt();
        switch (choose) {
            case 1:
                deposit();
                recordHistory();
                break;
            case 2:
                withdraw();
                recordHistory();
                break;
            case 3:
                displayTransactionHistory();
                break;
            case 4:
                System.out.println("Thank you for your visit!");
                break;
            default:
                break;

    }
}