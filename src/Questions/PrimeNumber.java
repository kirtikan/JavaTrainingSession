package Questions;

public class PrimeNumber {
	
	//prime number starts from 2 i.e. 2,3,5,7,11,13... ]

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void generatePrime(int numb) {
		for (int i = 2; i <= numb; i++) 
		{
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {

		generatePrime(25);

	}

}
