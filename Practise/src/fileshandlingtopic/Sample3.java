package fileshandlingtopic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample3 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\LOGUTHIRU\\Documents\\file_handling\\sample\\Apple.txt");
		FileWriter fr = new FileWriter(f, true);
		BufferedWriter br = new BufferedWriter(fr);
//		br.write("Hi guys java");
//		br.flush();
//		br.close();
		FileReader fe = new FileReader(f);
		BufferedReader fer = new BufferedReader(fe);
		String line= fer.readLine();
		while(line != null)
		{
			System.out.println(line);
			line = fer.readLine();
		}
		
	}

}
