import java.util.Scanner;
public class TransactionManager {
    Scanner sc = new Scanner(System.in);
    double amount;
    double balance;
    public void deposit (){
        System.out.println("Enter Deposit amount: ");
        amount = sc.nextDouble();
        if (amount>0){
            balance = amount;
        }else{
            System.out.println("*Failed operation (Amount is negative)*");
        }
    }
    public void withdraw(){
        System.out.println("Enter Withdraw amount: ");
        amount = sc.nextDouble();
        if(amount<=balance){
            balance -= amount;
        }else{
            System.out.println("*Failed operation - You don't have enough balance)*");
        }
    }
}