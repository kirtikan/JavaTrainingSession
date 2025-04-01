package AbstractionConcept;

public class TestBike {

	public static void main(String[] args) {

		Bike b = new Honda(); //parent class (Bank) constructor automatically called
		System.out.println("**************");
		b.run(); //RunTime Polymorphism
		b.changeGear();
	}

}
