import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private List<Transaction> transactionHistory;

    public BankAccount(int accountNumber,String accountHolder,double initialBalance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=initialBalance;
        this.transactionHistory=new ArrayList<>();
    }
    public int getAccountNumber(){

        return accountNumber;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
     public double getBalance(){
        return balance;
     }
     public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            transactionHistory.add(new Transaction("Deposit",amount));
        }
     }
     public boolean withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
            transactionHistory.add(new Transaction("Withderawal", -amount));
                return true;
        }
        return false;
     }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }
}

class Transaction {
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}
