package Java8Features.PreFunctional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo //implements Consumer<Integer>
{

//	@Override
//	public void accept(Integer t) {
//		System.out.println("Printing :"+t);
//	}
//	
	public static void main(String[] args) {
		//new ConsumerDemo().accept(12);
		
//		Consumer consumer =(t) -> {System.out.println("Printing :"+t);};
//		consumer.accept(12);
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		//list1.stream().forEach(consumer);
		
		list1.stream().forEach((t)-> System.out.println("Print :"+t));
	}
}
