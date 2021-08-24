package Questions.Basic;

public class ReverseString {

	public static void main(String[] args) {
		
		//Reverse a string
		//Diff btw String & StringBuffer
		//Do we have reverse function in string?
		
		//1. using for loop
		String s = "Selenium";
		String rev = "";
		int len = s.length();
				
		for(int i =len-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		
		System.out.println(rev);
		
		
		//2. using StringBuffer
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());

	}

}
