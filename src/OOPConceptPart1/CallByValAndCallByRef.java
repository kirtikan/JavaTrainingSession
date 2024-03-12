package OOPConceptPart1;

public class CallByValAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		
		int x =10;
		int y =20;
		System.out.println("sum"+obj.testSum(x, y));  // call by value or pass by value OR COPIES OF VALUES  (i.e x and y)
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q );
			
	}
	
	public int testSum(int a, int b)
	{
		int c = a+b;
		return c;
	}
	
	public void swap(CallByValAndCallByRef t)
	{
		int temp;
		temp = t.p;  // temp = 50
		t.p = t.q;   // t.p = 60
		t.q= temp;   // t.q = 50
	}

}
