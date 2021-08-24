package Java8Features.PreFunctional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo //implements Predicate<Integer>
{
//	@Override
//	public boolean test(Integer t) {
//		if(t%2==0) {
//			return true;
//		}
//		else {return false;}		
//	}

	public static void main(String[] args) {
		
	//	Predicate<Integer> predicate = new PredicateDemo();
	//	System.out.println(predicate.test(7));
	
//		Predicate<Integer> predicate =(t)->{
//			if(t%2==0) {
//				return true;
//			}
//			else {return false;}
//		};
		
		Predicate<Integer> predicate = t-> t%2 == 0;	
		System.out.println(predicate.test(9));
		
		System.out.println("*****************************");
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);		
		
		System.out.println("*****************************");
		list1.stream().forEach(t->System.out.println("Print :"+t));
		
		System.out.println("*****************************");
		list1.stream().filter(predicate).forEach(t->System.out.println("Print Even :"+t));
		
		System.out.println("*****************************");
		list1.stream().filter(t-> t%2 == 0).forEach(t->System.out.println("Print Even :"+t));
	}
	
}
