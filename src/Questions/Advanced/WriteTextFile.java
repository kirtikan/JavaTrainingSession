package Questions.Advanced;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
	
	public static void writeUsingFileWriter(String str,String fPath) throws IOException {
		
		FileWriter fWrite = new FileWriter(fPath, true);
		fWrite.write(str);
		fWrite.close();		
	}
	
	public static void writeUsingBufferedWriter(String str,String fPath) throws IOException {
		
		BufferedWriter fWrite = new BufferedWriter(new FileWriter(fPath,true));
		fWrite.write(str);
		fWrite.close();
	}
	
	
	public static void main(String[] args) throws IOException {
		String txt ="This is Java Programming";
		String filePath ="C:\\Users\\Kirti Kanojiya\\Documents\\testFile.txt";
		
		System.out.println("*******Writing through FileWriter********");
		writeUsingFileWriter(txt, filePath);
		
//		System.out.println("*******Writing through BufferedWriter********");
//		writeUsingBufferedWriter(txt, filePath);
	}

}
