package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x = "100";
		System.out.println(x+20);     /// 10020   --- string concatenation
		
		//data conversion String to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer, Double, Character, Boolean
		
		//String to double conversion
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to boolean conversion
		String k = "true";
		Boolean b = Boolean.parseBoolean(k);
		System.out.println(k);
		
		//int to String
		int j = 200;
		System.out.println(j+20);
		
		String s = String.valueOf(j);
		System.out.println(s+20);
		
		
		String u = "100A";  // NumberFormatException
		Integer.parseInt(u);  // will produce an exception as java.lang.NumberFormatException: For input string: "100A"
		

	}

}
