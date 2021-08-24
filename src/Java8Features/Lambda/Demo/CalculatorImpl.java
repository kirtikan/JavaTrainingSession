package Java8Features.Lambda.Demo;

interface Calculator{
	
	//void switchOn();
	
	//void sum(int input);
	
	int sustract(int i1, int i2);
}

public class CalculatorImpl {

	public static void main(String[] args) {
	// ()    ->   {body};
		
		/*	
		Calculator calc = ()->{System.out.println("switch On");};  
		// if there is only 1 statement in body then can give it without braces	
		calc.switchOn(); */
				
		/*
		Calculator calc = (input) -> System.out.println("sum ="+input);
		calc.sum(123);
		*/
		
		Calculator calc =(i1,i2) -> {
			if(i2<i1) {
				throw new RuntimeException("message");
			}else {
				return i2-i1;
			}			
		};
		// Calculator calc =(i1,i2) -> i2-i1;
		System.out.println(calc.sustract(5, 10));
	}
}
