import java.util.Scanner;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public CheckingAccount(String accountNumber) {
        super(accountNumber);
    }

    Scanner sc = new Scanner(System.in);
    int choose;

    public CheckingAccount() {

    }

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

    public void operation() {
        System.out.println("""
                Choose operation type:\s
                1 - Deposit
                2 - Withdraw
                3 - Exit
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
                System.out.println("Thank you for your visit!");
                break;
            default:
                break;

        }
    }

}

