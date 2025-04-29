package encalpsulation;

public class BankingSystem {

    public static void main(String[] args){
        SavingAccount savingAccount = new SavingAccount("123456789","Rohith",1000,2.5);
        savingAccount.withdraw(200.0);
        savingAccount.deposit(1000.0);
        savingAccount.withdraw(1500.0);
        savingAccount.applyInterest();
        savingAccount.setAccountNumber("1234569876");

        System.out.println(savingAccount.getAccountNumber());

        CurrentAccount currentAccount = new CurrentAccount("987654321","Rohith",5000.0,3.5);
        currentAccount.withdraw(2500.0);
        currentAccount.deposit(1000.0);
    }
}
