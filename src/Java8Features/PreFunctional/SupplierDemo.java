package Java8Features.PreFunctional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo //implements Supplier<String>
{

//	@Override
//	public String get() {
//		return "Hi Java Techie";
//	}
	
	public static void main(String[] args) {
//		Supplier<String> supplier =new SupplierDemo();
//		System.out.println(supplier.get());
		
		Supplier<String> suppplier =()->{return "Hi Java Coder";};
		//Supplier<String> suppplier =()-> "Hi Java Coder";
		System.out.println(suppplier.get());
				
		List<String> list1 = Arrays.asList("a","b");		
		System.out.println(list1.stream().findAny().orElseGet(suppplier));
		
		List<String> list2 = Arrays.asList();
		System.out.println(list2.stream().findAny().orElseGet(()->"Hi Java Coder. Enjoy"));
	}

}
