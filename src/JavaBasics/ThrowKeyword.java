package JavaBasics;

public class ThrowKeyword {

	public static void main(String[] args) {
	
		// if user want throw an own error
		// to deleberately generate an exception
		
		System.out.println("ABC");
		
		try {
			throw new Exception("Kirti Exception");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("PQR");
		
		String Exec_Flag =" ";
		if(Exec_Flag.equals(" ")) {
			try {
				throw new Exception("Exec flag is Blank Exception");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Test");

	}

}
