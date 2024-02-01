import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
public abstract class BankAccount implements Transactable {
    Scanner sc = new Scanner(System.in);
    String accountNumber;
    private double balance=0;
    double amount;
    String formattedDateTime;
    ArrayList<String> history=new ArrayList<>();

    public BankAccount(String accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public BankAccount(String accountNumber){
        this.accountNumber=accountNumber;
    }

    public BankAccount() {

    }

    public void deposit(){
        System.out.println("Enter Deposit amount: ");
        amount = sc.nextDouble();
        if (amount>0){
            balance += amount;
            history.add(formattedDateTime +" - You deposited $" +amount +".");
        }else{
        System.out.println("*Failed operation (Amount is negative)*");
    }
    }
    public void withdraw(){
        System.out.println("Enter Withdraw amount: ");
        amount = sc.nextDouble();
        if(amount<=balance){
        balance -= amount;
        history.add(formattedDateTime +" - You withdrew $" +amount +".");
        }else{
            System.out.println("*Failed operation - You don't have enough balance)*");
        }
    }
    public void recordHistory(){
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        formattedDateTime = currentDateTime.format(formatter);
    }
    public double getBalance(){
        System.out.println("your current balance is: "+balance);
        return balance;
    }
    public void displayTransactionHistory(String s){
        System.out.println("*Transaction History*\n\n\n");
        for (int i=0;i< history.size();i++){
            System.out.println(history.get(i));
        }
    }
}