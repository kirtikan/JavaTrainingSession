package Questions;

public class MissingNumber {

	public static void main(String[] args) {
		//[1,2,4,5] = 12
		//1,2,3,4,5] = 15
		//missing number = 15-12 =3
		
		int a[] = {1,2,3,4,6};
		int sum=0;
		for(int i =0; i<a.length; i++) {
			sum = sum+ a[i];
		}
		
		int sum1 =0;
		for(int j=1;j<=6;j++) {
			sum1 = sum1 + j;
		}
		
		System.out.println("Missing Number is "+(sum1-sum));
		
	}

}
