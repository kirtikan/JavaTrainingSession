package AbstractionConcept;

public abstract class Bike {
	Bike(){
		System.out.println("Bike is created.");
	}
	
	public abstract void run();
	
	public void changeGear() {
		System.out.println("Gear changed.");
	}
	

}
