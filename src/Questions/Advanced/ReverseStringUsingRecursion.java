package Questions.Advanced;

public class ReverseStringUsingRecursion {

	public static StringBuffer st = new StringBuffer("");

	public static void reverseString(String str) {

		if ((str == null) || (str.length() <= 1)) {
			// System.out.println(str);
			st = st.append(str);
			System.out.println(st);
		} else {
			// System.out.print(str.charAt(str.length()-1));
			st = st.append(str.charAt(str.length() - 1));
			reverseString(str.substring(0, str.length() - 1));
		}

	}

	public static void main(String[] args) {
		String str1 = "abc";
		reverseString(str1);
	}
}
