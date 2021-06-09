package Questions;

public class CheckIsNumeric {

	public static boolean isEmpty(CharSequence cs) {
		return cs == null || cs=="";
	}
	
	public static boolean isNumeric(CharSequence cs) {
		if(isEmpty(cs)) 
		{
			return false;
		}
		
		for(int i=0;i<cs.length(); i++) {
			if(!Character.isDigit(cs.charAt(i))) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {					
		
        System.out.println(isNumeric(null));
        System.out.println(isNumeric(""));
        System.out.println(isNumeric(" "));
        System.out.println(isNumeric("a"));
        System.out.println(isNumeric("1"));
        System.out.println(isNumeric("123456"));
        System.out.println(isNumeric("testing"));
        System.out.println(isNumeric("testing123"));
        System.out.println(isNumeric("2.3"));
        System.out.println(isNumeric("+123"));
	}

}
