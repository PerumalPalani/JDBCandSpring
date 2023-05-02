package fileshandlingtopic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Sample1 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\LOGUTHIRU\\Documents\\file_handling\\sample\\demo.txt");
		FileWriter fw = new FileWriter(f,true);
		fw.write("Hello java");
		fw.flush();
		
	}

}
