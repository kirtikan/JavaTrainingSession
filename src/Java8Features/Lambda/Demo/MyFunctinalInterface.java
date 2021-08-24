package Java8Features.Lambda.Demo;

//functional interface is in which we can have only 1 abstract method & we can have default & static methods
//Lambda Exp: we can write lambda exp only for a abstract method present in functinal interface

@FunctionalInterface  //not mandatory
public interface MyFunctinalInterface {

	void m1();
	  default void m2() {
		  System.out.println("Default method-1");
	  }
	  
	  default void m3() {
		  System.out.println("Default method-2");
	  }
	  
	  static void m4() {
		  System.out.println("static method");
	  }
}
