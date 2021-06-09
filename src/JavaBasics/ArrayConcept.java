package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//Static Array: Array: to store multiple values of similar data type in a single variable
		//One dim array
		//lowest bound/index = 0
		//upper bound/index = n-1 (where n is size of arrays)
		
		//dis-advantages of array
		//1. size is fixed - static array -- to overcome this problem -- we use collection: ArrayList, HashTable ---Dynamic Array
		//2. stores only similar data types -- to overcome this problem ---we use object array

		
		
		//1. int array  : in which we can store only int values				
		int i[] = new int[4];   ////// i[] or []i both representation are same
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[3]);
		//System.out.println(i[4]);  //ArrayIndexOutOfBoundException
		
		System.out.println(i.length);  // size/length of array
		
		//print all the values of array: use for loop
	
		for(int j=0; j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		
		//2. double array
		double d[] = new double[3];
		
		d[0] = 10.33;
		d[1] = 12.33;
		d[2] = 45.12;
		
		System.out.println(d[2]);
		
		//3. char array
		char c[] = new char[3];
		c[0] = 'q';
		c[1] = '1';
		c[2] = '$';
		
		//4. boolean array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		//5. string array
		String s[] = new String[3];
		s[0] = "user";
		s[1] = "Hello";
		s[2] = "World";
		
		System.out.println(s[2]);
		System.out.println(s.length);
		
		//6. Object array : (Object is a class(infact superclass)) - is used to store different data types values
		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "1/1/1990";
		ob[4] = 'M';
		ob[5] = "London";
		
		System.out.println(ob[3]);
		System.out.println(ob.length);
	}

}
