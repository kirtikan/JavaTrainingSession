package JavaBasics;

public class B extends A{

	//super keyword is used to call parent class constructor
	//super keyword should be written in child constructor
	//super statement should be 1st statement
	//if don't mention super, then default parent class constructor will be called
	public B() {
		super();
	}
	
	public B(int i) {
		super(i);
	}
	
	public B(int i, int j) {
		super(i,j);
	}
	public static void main(String[] args) {

      B obj = new B();
      B obj1 = new B(10);
      B obj2 = new B(20,30);
      
	}

}
