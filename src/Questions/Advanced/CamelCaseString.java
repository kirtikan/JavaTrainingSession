package Questions.Advanced;

public class CamelCaseString {
	
	public static void camelCase(String str) {
		str =str.toLowerCase();
		
		//making String Array
		String[] sArr =str.split(" ");
		String camelCaseString ="";
		
		for(String word : sArr) {			
			String firstLetter = word.substring(0,1).toUpperCase();
			camelCaseString = camelCaseString+firstLetter+word.substring(1)+" ";
		}
		
		System.out.println(camelCaseString);
	}
	
	
	public static void main(String[] args) {
		String str="my naMe IS kiRTI";
		camelCase(str);
	}
}
