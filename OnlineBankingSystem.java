import java.util.List;

public class OnlineBankingSystem {
    public static void main(String[]args) {
        BankAccount account = new BankAccount(123456, "Neha Kumari", 1000.0);

        account.deposit(5000.0);
        boolean withdrawalSuccess = account.withdraw(2000.0);
        System.out.println("AccountHolder" + account.getAccountHolder());
        System.out.println("AccountNumber" + account.getAccountNumber());
        System.out.println("CurrentBalance:$" + account.getBalance());
        if (withdrawalSuccess) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
        List<Transaction> transactions = account.getTransactionHistory();
        System.out.print("TransactionHistory:");
        for (Transaction transaction : transactions) {
            System.out.print("Type:" + transaction.getType() + ",Amount:$" + transaction.getAmount());
        }


    }
}
