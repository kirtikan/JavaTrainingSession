package Questions.Advanced;

import java.util.regex.Pattern;

public class RegularExpressionPgm {

	public static void main(String[] args) {
		
	  System.out.println(Pattern.matches(".s", "as")); //true
	  System.out.println(Pattern.matches(".s", "mk")); //false
	  System.out.println(Pattern.matches(".s", "mst")); //false
	  System.out.println(Pattern.matches(".s", "amms")); //false
	  System.out.println(Pattern.matches("..s", "ams")); //true
	  
	  System.out.println("**********RegEx Charecter Classes************");
	  
	  System.out.println(Pattern.matches("[amn]", "abcd")); //false
	  System.out.println(Pattern.matches("[amn]", "m")); //true
	  System.out.println(Pattern.matches("[amn]", "ammmna")); //false --m & a comes more than once
	  System.out.println(Pattern.matches("[amn]", "a"));
	  
	  System.out.println("**********RegEx Quantifiers******************");
	  System.out.println("");
	  System.out.println("? quantifiers");
	  System.out.println(Pattern.matches("[amn]?", "a")); //true
	  System.out.println(Pattern.matches("[amn]?", "aaa")); //false
	  System.out.println(Pattern.matches("[amn]?", "aammmnn")); //false
	  System.out.println(Pattern.matches("[amn]?", "am")); //false
	  System.out.println(Pattern.matches("[amn]?", "")); 
	  
	  System.out.println("");
	  System.out.println("+ quantifier ....");  
	  System.out.println(Pattern.matches("[amn]+", "a")); //true
	  System.out.println(Pattern.matches("[amn]+", "aaa")); //true
	  System.out.println(Pattern.matches("[amn]+", "ammnn")); //true
	  System.out.println(Pattern.matches("[amn]+", "aazzta")); //false
	  
	  System.out.println("");
	  System.out.println("* quantifier ....");  
	  System.out.println(Pattern.matches("[amn]*", "ammmna")); //true
	  System.out.println(Pattern.matches("[amn]*", "")); //true
	}

}
