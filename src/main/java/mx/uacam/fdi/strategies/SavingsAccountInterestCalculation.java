package mx.uacam.fdi.strategies;

public class SavingsAccountInterestCalculation implements InterestCalculationStrategy {

    @Override
    public double calculateInterest(double accountBalance) {
        return accountBalance * (0.04 / 12);
    }
}
