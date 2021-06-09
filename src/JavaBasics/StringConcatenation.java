package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		
		// + is concatenation operator
		// println : It is used to print on console with a new line
		// print : just used to print on console

		int a = 100;
		int b = 200;
		String x = "Hello";
		String y = "World";
		double c = 12.33;
		double d = 10.33;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println(a+b+x+y+a+b);
		
		System.out.println(c+d);
		System.out.println(x+y+c+d);
		System.out.println("helloworld");
		System.out.println(a);
		System.out.println("the value of a is "+a);
		System.out.println("the addition a & b is :"+(a+b));
		
		System.out.println("hello");
		System.out.println("world");
		
		System.out.print("New");
		System.out.println("User");
		
	}

}
