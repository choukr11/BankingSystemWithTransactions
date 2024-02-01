import java.util.Scanner;

public class SavingsAccount extends BankAccount {
    Scanner sc = new Scanner(System.in);
    int choose;
    double balance = getBalance();

    public SavingsAccount() {
        super();
    }

    @Override
    public void deposit() {
        super.deposit();

    }
    @Override
    public void withdraw(){
        System.out.println("Enter Withdraw amount: ");
        amount = sc.nextDouble();
        if(amount<=balance){
            balance -= amount*1.02;
            history.add(formattedDateTime +" - You withdrew $" +amount +".");
        }else{
            System.out.println("*Failed operation - You don't have enough balance)*");
        }
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