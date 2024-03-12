package Questions.Basic;

public class StringManipulation {
	
	public static void main(String[] args) {
		
		String str = "The rains have started here";
		String str1 = "The rains Have started here";
		
		System.out.println(str.length());	
		System.out.println(str.charAt(5));
		
		System.out.println("***********************************************");
		
		System.out.println(str.indexOf('s'));  ///1st occurance of s
		System.out.println(str.indexOf('s', str.indexOf('s')+1));  //2nd occurance of s
		
		System.out.println("***********************************************");
		
		System.out.println(str.indexOf("have"));		
		System.out.println(str.indexOf("hello"));  //-1
		
		System.out.println("***********************************************");
		
		//string comparision
		System.out.println(str1.equals(str));
		System.out.println(str1.equalsIgnoreCase(str));
		System.out.println("***********************************************");
		
		//substring
		System.out.println(str.substring(0,9)+"AAA");
				
		System.out.println("***********************************************");
		
		//trim
		String s = "           Hello World         ";
		System.out.println(s.trim());		
		System.out.println(s.replace(" ", ""));
		
		System.out.println("***********************************************");
		
		String date = "01-01-2017";
		System.out.println(date.replace("-", "/"));
		System.out.println("***********************************************");
		
		//split:
		String test = "Hello_World_Test_Selenium";
		String testVal[] = test.split("_");
		for(int i=0; i<testVal.length; i++) {
			System.out.println(testVal[i]);
		}
		System.out.println("***********************************************");
		
		//concat
		String s2 = "cares";
		System.out.println(s2.concat("s"));
		
	}

}
