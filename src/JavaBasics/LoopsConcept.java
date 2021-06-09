package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//while loop
		//disadvantage of while loop: it will generate infinite loop if we don't give incremental/decremental statement
		//print 1 to 10
		
		int i =1;  //initialization
		while(i<=10) // conditional
		{
			System.out.println(i);
			i=i+1; //incremental
		}
		
		System.out.println("**********************");
		//for loop
		//print 1 to 10
		for(int j=1;j<=10;j++)  //Initialization,Conditional,Incremental
		{
			System.out.println(j);
		}
		
		System.out.println("**********************");
		
		//print 10 to 1
		for(int k=10;k>=1;k--)  //Initialization,Conditional,Decremental
		{
			System.out.println(k);
		}

	}

}
