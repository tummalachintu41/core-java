package MethodOverriding;

public class FixedAccount extends Banking{
    @Override
    public double CalculeteInterest(double amount) {
        return super.CalculeteInterest(amount);
    }
}
