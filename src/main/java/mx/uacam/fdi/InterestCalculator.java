package mx.uacam.fdi;

import mx.uacam.fdi.InterestCalculationStrategyFactory.AccountTypes;
import mx.uacam.fdi.strategies.InterestCalculationStrategy;

/**
 * 
 *
 */
public class InterestCalculator {

    private final InterestCalculationStrategyFactory interestCalculationStrategyFactory = new InterestCalculationStrategyFactory();

    public double calculateInterest(AccountTypes accountType, double accountBalance) {
        InterestCalculationStrategy interestCalculationStrategy = interestCalculationStrategyFactory.getInterestCalculationStrategy(accountType);

        return interestCalculationStrategy.calculateInterest(accountBalance);
    }
}
