package TestPrograms;

public class PracticePgm {

	public static void commonMethod(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
	}
	
	public static void main(String[] args) {	
		String s="ThiS is a sample test";
		commonMethod(s);
	}

}
