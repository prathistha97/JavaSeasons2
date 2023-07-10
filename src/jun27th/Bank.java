package jun27th;

public class Bank {
	
	private double balance=10000;
	
	//getters
	public double getBalance(int pin)
	{
		//validation
		if(pin == 6543)
		{
			return balance;
		}
		else
		{
			System.out.println("you have entered wrong pin..");
			return 0.0;
		}
		
		
	}
	
	//setter
	
	public void setBalance(int depositAmt)
	{
		balance=balance+depositAmt;
	}

}
