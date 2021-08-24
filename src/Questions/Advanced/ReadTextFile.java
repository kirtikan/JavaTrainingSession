package Questions.Advanced;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFile {
	
	public static void readFileUsingBufferedReader(String fPath) throws FileNotFoundException, IOException {
		// BufferedReader br = null ;
		File file = new File(fPath);
		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while ((st = br.readLine()) != null) {
			System.out.println(st);
		}
	}

	public static void readFileUsingScanner(String fPath) throws FileNotFoundException {

		File file = new File(fPath);
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}
	
//	public static void readFileUsingFileReader(String fPath) throws IOException {
//		
//		FileReader file = new FileReader(fPath);
//		int i;
//		while((i=file.read())!=-1) {
//			System.out.println((char)i);
//		}
//	}

	public static void main(String[] args) throws FileNotFoundException, IOException {

		String filePath = "C:\\Users\\Kirti\\Documents\\testFile.txt";
		System.out.println("*****Reading through Buffered Reader******");
		readFileUsingBufferedReader(filePath);

		System.out.println("");
		System.out.println("******Reading through Scanner ***********");
		readFileUsingScanner(filePath);

//		System.out.println("");
//		System.out.println("******Reading through FileRaeder ***********");
//		readFileUsingFileReader(filePath);
	}

}
