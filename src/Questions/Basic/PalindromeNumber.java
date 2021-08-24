package Questions.Basic;

public class PalindromeNumber {
	//151 454 34543 161 78987
	
	public static void isPalindromeNumber(int num) {
		int r =0;
		int sum =0;
		int t;
		
		t=num;
		
		while(num>0) {
			r = num%10;  // to get remainder
			sum = (sum*10)+r;
			num=num/10;
		}
		
		if(t==sum) {
			System.out.println("number "+t+" is a Palindrome Number");
		}
		else {
			System.out.println("number "+t+" is not a Palindrome Number");
		}
	}
	
	
	public static void main(String[] args) {
		isPalindromeNumber(151);
		isPalindromeNumber(152);
		isPalindromeNumber(34543);
	}

}
