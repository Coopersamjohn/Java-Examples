package file_char_demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

	public static void main(String[] args) {


		try(FileWriter fw=new FileWriter("chardemo.txt");
				BufferedWriter bw=new BufferedWriter(fw);
				){
			bw.write("hello from file writer");
			bw.newLine();
			bw.write("I will be in new line");
			bw.newLine();
			bw.write("No need of conversion when using character stream classes");
			
			System.out.println("Message written successfully");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
