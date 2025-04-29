package MethodOverriding;

public class BankApp {
    public static void main(String[] args) {
        Banking saving = new SavingAccount();
        Banking fixed = new FixedAccount();

        double savingInterest = saving.CalculeteInterest(20000);
        double fixedInterest = fixed.CalculeteInterest(30000);

        System.out.println("Saving Account Interest:" + savingInterest);
        System.out.println("Fixed Account Interest:"+fixedInterest);
    }
}
