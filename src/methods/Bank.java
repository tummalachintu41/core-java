package methods;

public class Bank {
    public String bankName;
    public String branch;
    public String accountHolder;
    public String accountNumber;
    public double balance;
    public String ifscCode;

    public String BankDetails(){
        System.out.println("Bank bankName is:" +bankName);
        System.out.println("Bank branch is:" + branch);
        System.out.println("Bank accountHolder is:" + accountHolder);
        System.out.println("Bank accountNumber is:" + accountNumber);
        System.out.println("Bank balance is:" + balance);
        System.out.println("ifscCode is:" + ifscCode);
        return "BankDetails";
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.bankName ="SBI";
        bank.branch = "Nandyal";
        bank.accountHolder = "Rohith";
        bank.accountNumber = "910000000345";
        bank.balance = 3000000;
        bank.ifscCode = "SBIN01234";
        bank.BankDetails();
    }


}
