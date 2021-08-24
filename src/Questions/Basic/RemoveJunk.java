package Questions.Basic;

public class RemoveJunk {

	public static void main(String[] args) {
		String s = "@@@##$$$ JAVA ^&$$### is %$@#$ best JAVA";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		
		String st = "ghg677hjjg787";
		st=st.replaceAll("[^0-9]", "");
		System.out.println(st);
	}

}
