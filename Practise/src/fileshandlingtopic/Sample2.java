package fileshandlingtopic;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample2 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\LOGUTHIRU\\Documents\\file_handling\\sample\\demo.txt");
		f.createNewFile();
		System.out.println(f.exists());
		FileReader fr = new FileReader(f);		
		char[] a = new char[(int)f.length()];
		fr.read(a);
		fr.close();
//		for(char c : a)
//		{
//			System.out.print(c);
//		}
		for(int i = 0; i<a.length; i++)
		{
			System.out.print(a[i]);
		}
	}

}
