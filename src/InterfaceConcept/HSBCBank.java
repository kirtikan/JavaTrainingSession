package InterfaceConcept;

public  class  HSBCBank implements USBank,BrazilBank {  //we are acheiving multiple inheritance
	//is-a-relationship
	//if a class is implementing any interface,then its mandatory to define/override all the methods of interface 
	
	//overriding from USBank
	public void credit()
	{
		System.out.println("hsbc------credit");
	}
	
	public void debit()
	{
		System.out.println("hsbc-----debit");
	}
	
	public void transferMoney()
	{
		System.out.println("hsbc------transferMoney");
	}

	//separate method from HSBCBank
	public void educationLoan()
	{
		System.out.println("hsbc-----------educatonLoan");
	}
	
	public void carLoan()
	{
		System.out.println("hsbc------------carLoan");
	}
	
	//implementing BrazilBank Method
	public void mutualFund()
	{
		System.out.println("hsbc--------mutualFund");
	}
}
