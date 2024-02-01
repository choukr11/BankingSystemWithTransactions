public class CheckingAccount extends BankAccount{
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public CheckingAccount(String accountNumber) {
        super(accountNumber);
    }
}
