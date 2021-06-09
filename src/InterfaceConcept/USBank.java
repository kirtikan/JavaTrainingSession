package InterfaceConcept;

public interface USBank {
	
	int min_bal = 100;  //by default static and final in nature
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//always define only abstract methods
	// 100% abstraction 
	//only method declaration
	//no method body
	//In interface we can declare variables, vars are by default static in nature
	//vars value will not be changed, its final in nature
	//no static method in interface ---> coz interface is part of object & object cannot have static method
	//no main method in interface
	//we cannot create the object of interface
	//interface is abstract in nature

}
