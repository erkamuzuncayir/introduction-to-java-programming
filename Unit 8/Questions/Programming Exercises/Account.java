/* Unit 8 - Exercise 7

|---------------------------------------------------	|
|	Account												|
|---------------------------------------------------	|
| -id: int												|
| -balance: double										|
| -annualInterestRate: double							|
| -dateCreated: Date									|
|---------------------------------------------------	|
| Account()												|
| Account( newId: int, initialBalance: double )			|
| GetId(): int											|
| SetId( newId: int )									|
| GetBalance(): double									|
| SetBalance( newBalance: double)						|
| GetAnnualInterestRate(): double						|
| SetAnnualInterestRate( newAnnualInterestRate: double)	|
| GetDateCreated(): Date								|
| GetMonthlyInterestRate( annualInterestRate: double)	|
| Withdraw( amount: double ): double					|
| Deposit( amount: double )								|
|---------------------------------------------------	|
*/

import java.util.Date;

public class Account
{
	public static void main(String[] args) 
	{
		Account test = new Account( 1122, 20000.0 );
		
		test.SetAnnualInterestRate( 4.5 );
		test.Withdraw( 2500 );
		test.Deposit( 3000 );
		
		System.out.printf( "Balance of account is %.2f\n" , 
							test.GetBalance() );
		System.out.printf( "Monthly interest rate of account is %.2f\n" ,
							test.GetMonthlyInterestRate() );
		System.out.printf( "Account create time is %s\n" , 
							test.GetDateCreated() );
	}
	
	int id;
	double balance;
	double annualInterestRate;
	Date dateCreated = new Date();

	Account( int newId, double initialBalance )
	{
		id = newId;
		balance = initialBalance;
	}
	
	int GetId()
	{
		return id;
	}
	
	void SetId( int newId )
	{
		id = newId;
	}
	
	double GetBalance()
	{
		return balance;
	}
	
	void SetBalance( double newBalance )
	{
		balance = newBalance;
	}
	
	double GetAnnualInterestRate()
	{
		return annualInterestRate;
	}

	void SetAnnualInterestRate( double newAnnualInterestRate )
	{
		annualInterestRate = newAnnualInterestRate;
	}
	
	double GetMonthlyInterestRate()
	{
		return annualInterestRate / 12;
	}
	
	String GetDateCreated()
	{
		return dateCreated.toString();
	}
	
	void Withdraw( double amount )
	{
		balance -= amount;
	}
	
	void Deposit( double amount )
	{
		balance += amount;
	}
}
