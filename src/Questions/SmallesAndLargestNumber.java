package Questions;

public class SmallesAndLargestNumber {

	public static void main(String[] args) {
	
		int numbers[] = {-10, 24, 50, -88, 98765 };
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i]>largest) {
				largest = numbers[i];
			}
			else if(numbers[i]<smallest) {
				smallest = numbers[i];
			}
		}
		
		System.out.println("Given array is :"+numbers.toString());
		System.out.println("Largest Number is :"+ largest);
		System.out.println("Smallest Number is :"+ smallest);

	}

}
