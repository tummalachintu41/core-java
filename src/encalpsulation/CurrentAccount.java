package encalpsulation;

public class CurrentAccount extends BankAccount{
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolderName, double balance,double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount<=getBalance()+overdraftLimit){
            double newBalance = getBalance() - amount;
            System.out.println(amount+"withdrawn. New balance:"+ newBalance);
        }else {
            System.out.println("withdrawal amount must be positive and less than or equal to the balance plus overdraft limit. ");
        }
        super.withdraw(amount);
    }
}
