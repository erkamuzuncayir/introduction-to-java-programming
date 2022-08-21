// Unit 2 - Exercise 15

public class CompoundValue
{
	public static void main( String[] args ) 
	{
		// Setting values
		var investmentAmount = 100;
		var monthlyInterestRate = 5.0 / 1200;
		double compoundValue = 0;

		// Computing compound value
		compoundValue = ( investmentAmount + compoundValue ) * ( 1.0 + monthlyInterestRate );
		compoundValue = ( investmentAmount + compoundValue ) * ( 1.0 + monthlyInterestRate );
		compoundValue = ( investmentAmount + compoundValue ) * ( 1.0 + monthlyInterestRate );
		compoundValue = ( investmentAmount + compoundValue ) * ( 1.0 + monthlyInterestRate );
		compoundValue = ( investmentAmount + compoundValue ) * ( 1.0 + monthlyInterestRate );
		compoundValue = ( investmentAmount + compoundValue ) * ( 1.0 + monthlyInterestRate );

		// Display result
		System.out.println( "Compound value is: " + compoundValue );
	}
}