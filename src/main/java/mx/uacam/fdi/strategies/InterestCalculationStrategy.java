package mx.uacam.fdi.strategies;

public interface InterestCalculationStrategy {

    double calculateInterest(double accountBalance);  //Note the absence of an access modifier - interface methods are implicitly public.

}