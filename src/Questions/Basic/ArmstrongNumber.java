package Questions.Basic;

public class ArmstrongNumber {

	//153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
	//0,1, 370, 371, 407
	
	public static void isArmstrongNumber(int num) {
		
		int r;
		int cube =0;
		int t;
		
		t=num;
		
		while(num>0) {
			r=num%10;
			num = num/10;
			cube = cube + r*r*r;
		}
		
		if(t==cube) {
			System.out.println("Number "+t+" is an Armstrong Number");
		}else {
			System.out.println("Number "+t+" is not an Armstrong Number");
		}
	}
	
	public static void main(String[] args) {
			isArmstrongNumber(370);

	}

}
