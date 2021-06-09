package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		  
		HDFCBank hb = new HDFCBank();
		hb.credit();
		hb.debit();
		hb.loan();  //Overridden method
		hb.funds();
				
		System.out.println("********************************");
		
		Bank b = new HDFCBank(); //dynamic polymorphism
		b.loan();
		b.credit();
		b.debit();
		//b.funds();
		
		System.out.println("********************************");
		
		System.out.println(HDFCBank.val);
		System.out.println(hb.rate);
		System.out.println(hb.amt);

	}

}
