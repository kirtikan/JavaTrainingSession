package Java8Features.Lambda.Example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
			/*
 				( o1, o2) -> o1.getName().compareTo(o2.getName());
			  
			*/
	public List<Book> getBooksinSort(){		
		List<Book> books = new BookDAO().getBooks();
		//1st Way
		//Collections.sort(books, new MyComparator());
		
		//2nd Way
//		Collections.sort(books, new Comparator<Book>() {
//			@Override
//			public int compare(Book o1, Book o2) {
//				return o1.getName().compareTo(o2.getName());
//			}			
//		});
		
		//3rd way through Lambda
		Collections.sort(books, (o1,o2)->o1.getName().compareTo(o2.getName()));
		return books;
	}
	
	public static void main(String[] args) {
		System.out.println(new BookService().getBooksinSort());
	}
}

//class MyComparator implements Comparator<Book>{
//	@Override
//	public int compare(Book o1,Book o2) {
//		return o1.getName().compareTo(o2.getName());// for asscending order
//		//o2.getName().compareTo(o1.getName());-----> for descending order
//	}
//}
