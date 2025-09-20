package statement4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Case5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\Manikandan\\eclipse-workspace\\SampleProject\\src\\test\\java\\test.txt");
       // file.createNewFile();
		try (BufferedWriter writter = new BufferedWriter(new FileWriter(file,true))) {
			
			writter.write("abcdef ghijkl");
			writter.write(System.lineSeparator());
			writter.append("1234345 234");
			writter.write(System.lineSeparator());
		}
		
		 BufferedReader reader = new BufferedReader(new FileReader(file)) ;
		 String line=reader.readLine();
			while(line!=null) {
			System.out.println(line);
			line=reader.readLine();}
		
		
	}

}
