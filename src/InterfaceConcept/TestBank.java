package InterfaceConcept;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank hs = new HSBCBank();
		hs.credit();  //compile time polymorphism
		hs.debit();   //compile time polymorphism
		hs.transferMoney();  //compile time polymorphism
		hs.educationLoan();
		hs.carLoan();
		
		//Dynamic Polymorphism
		//child class object can be reffered by parent interface reference variable
		USBank b = new HSBCBank();
		b.credit();   //only overridden method can be called by parent interface reference variable
		b.debit();    //only overridden method can be called by parent interface reference variable
		b.transferMoney();  //only overridden method can be called by parent interface reference variable
		
		System.out.println(USBank.min_bal);  //can access through interface directly as it's by default static as defind in interface.
		//USBank.min_bal=200;   ----> we can't change value of interface variable
	

	}

}
