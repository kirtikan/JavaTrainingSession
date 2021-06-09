package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();  /// I can create the object of BMW class as it's publicly defind.
		
		// static polymorphism or compile time polymorphism---->WHY ::: beacuse at the time of compilation java compiler will
		//decide which method it need to compile.
		//POLYMORPHISM :: method overriding
		
		b.start();  // if a method is common in both child and parent class then preference will be given to child class method		
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();  ////////////////accessing Vehicle class method as BMW inherit Car class & Car class inherit Vehicle class
		
		System.out.println("**************************");
		
        Car c = new Car();
        c.start();
        c.stop();
        c.refuel();
        //c.theftSafety(); ---> parent class can not inherit from it's child class
        
        System.out.println("***************************");
        
        //TOP Casting
        Car c1 = new BMW(); //child class object can be reffered by parent class reference variablle :::: Dynamic Polymorphism 
        //or RUN Time Polymorphism
        c1.start();
        c1.stop();
        c1.refuel();
  
        ////So only common method or overidden method and parent class method  can be accessed in RUN Time polymorphism
        
        //Down Casting : parent class object refferel to child class reference variable ----> NOT ALLOWED
        //BMW b1 =new Car(); 
        
        //Down Casting
        BMW b1 = (BMW)new Car();  //ClassCastException ---> Car cannot be cast to BMW
        
		

	}

}
