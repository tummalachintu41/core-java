package encalpsulation;

import javax.swing.*;

public class SavingAccount extends BankAccount{
    private double interestRate;

    public SavingAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest(){
        double interest = getBalance()* interestRate/100;
        deposit(interest);
        System.out.println("Interest applied:"+ interest + ".New balance:"+getBalance());
    }
}
