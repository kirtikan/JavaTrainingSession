package Questions.Basic;

public class ReverseStringWithOutWords {

	public static void main(String[] args) {
		
		String str = "My name is Kirti";
		String a[] = str.split(" ");
		String ans="";
		
		for(int i = a.length-1; i>=0;i--) {
			ans = ans+" "+a[i];
		}
		
		System.out.println(ans);
		

	}

}
