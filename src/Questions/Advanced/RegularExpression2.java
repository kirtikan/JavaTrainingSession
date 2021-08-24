package Questions.Advanced;

import java.util.regex.Pattern;

public class RegularExpression2 {

	public static boolean isValidPassword(String password)
    {
  
        // Regex to check valid password.
 /*       String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";*/
		
			String regex = "^(?=.*[0-9])"+
							"(?=.*[a-z])(?=.*[A-Z])"
							+"(?=.*[@$&]).{8,20}$";
  
      return Pattern.matches(regex, "Geeks@portal20");
    }
	
	public static void main(String[] args) {
		
		//how to validate 11 digit account number
/*		System.out.println(Pattern.matches("[1-9][0-9]{10}", "01234567809")); //false
		System.out.println(Pattern.matches("[1-9][0-9]{10}", "12345678090")); // true
		System.out.println(Pattern.matches("[1-9][0-9]{10}", "123456780906")); //false
		System.out.println(Pattern.matches("[^0]{1}[0-9]{10}", "71234567890")); //true
		System.out.println(Pattern.matches("[^0][0-9]{10}", "71234567890")); //true
*/
		//how to validate a password which should have atleast 1 uppercase letter, 1 lowercase letter
		// 1 digit, 1 special character(!@#$%&*()-+=^), doesn't contain whitespace & min length 8 & max is 20 chars
		System.out.println("***********************************************************");
		System.out.println(isValidPassword("Geeks@portal20"));
		
		
	}

}
