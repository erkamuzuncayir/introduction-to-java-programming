/* Unit 8 - Exercise 2

|---------------------------------------------------|
|	Stock											|
|---------------------------------------------------|
| symbol: String									|
| name: String										|
| previousClosingPrice: double						|
| currentPrice: double								|
|---------------------------------------------------|
| Stock( newSymbol: String, newName: String )		|
| GetChangePercent(): double						|
|---------------------------------------------------|
*/

public class Stock
{
	public static void main(String[] args) 
	{
		Stock firstStock = new Stock( "JAVA", "Sun Microsystems Inc" );
		
		firstStock.previousClosingPrice = 4.5;
		firstStock.currentPrice = 4.35;
		
		System.out.printf( "Price change of %s | %s is %.2f%%." , 
		firstStock.symbol, firstStock.name, firstStock.GetChangePercent() );
	}
	
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice; 
	
	// Constructor with two argument
	Stock( String newSymbol, String newName )
	{
		symbol = newSymbol;
		name = newName;
	}
	
	double GetChangePercent()
	{
		return ( currentPrice - previousClosingPrice ) / previousClosingPrice;
	}	
}
