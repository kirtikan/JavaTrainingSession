package JavaBasics;

public class NullConcept {

	static Object obj;
	static String str;
	static NullConcept nc;
	
	public static void main(String[] args) {
		
		//1. case sensitive:
		//Object obj = null;
		
		//2.default ref value is null
//		System.out.println(obj);
//		System.out.println(str);
//		System.out.println(nc);
		
		//3. 
		//Integer i = null;
		//int j =i;          ----> will throw NullPointerException,   not allowed to assign null value to a primitive dt
		
		//4. instanceof
		Integer i = null;
		Integer j = 10;
		
		System.out.println(j instanceof Integer);  //true
		System.out.println(i instanceof Integer);  //false
		
		//5. static vs non static
		NullConcept obj = null;
		//obj.div();  // will thow NullPointerException
		obj.sum();  // can be called as sum method is static
		
		
		//6. == or !=
		System.out.println(null == null);
		System.out.println(null != null);
		
		//7. 
		String str = null;
		Integer n = null;
		Double d = null;
		
		String s1 =(String)null;
		System.out.println(s1+"Kirti");
		//System.out.println(s1.length());    //NullPointerException
		//System.out.println(s1.charAt(0));   //NullPointerException
		
		Integer i2 = (Integer) null;
		Double d2 = (Double) null;
	}
	
	public static void sum() {
		System.out.println("sum..");
	}
	
	public void div() {
		System.out.println("div...");
	}

}
