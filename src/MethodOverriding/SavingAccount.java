package MethodOverloding;

public class SavingAccount extends Banking{

    @Override
    public double CalculeteInterest(double amount) {
        return amount*0.06;
    }
}
