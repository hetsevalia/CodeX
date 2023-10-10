public class Q3BankAccount {
    private String accountNumber;
    private double balance;

    public Q3BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Q3BankAccount(String accountNumber) {
        this(accountNumber, 0.0);
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        Q3BankAccount account1 = new Q3BankAccount("12345", 1000.0);
        Q3BankAccount account2 = new Q3BankAccount("67890");

        account1.displayAccountDetails();
        account2.displayAccountDetails();
    }
}
