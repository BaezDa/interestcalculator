package mx.uacam.fdi.strategies;

public class NoInterestCalculation implements InterestCalculationStrategy {

    @Override
    public double calculateInterest(double accountBalance) {
        return 0;
    }
}
