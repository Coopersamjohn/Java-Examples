package file_byte_demo;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutByte {

	public static void main(String[] args) {

		// try to write a file and then read
		
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		//String s="this message should be written inside the file...\nthis will be in new line..";
//		String s="\nthis is the new message";
		String s="\nYou can also use try w/ resources to simplify code";
		try {
			fos=new FileOutputStream("bytedemo.txt",true);
			bos=new BufferedOutputStream(fos);
			byte b[]=s.getBytes(); // converts message to bytes
			bos.write(b);
			System.out.println("data written sucessfully");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				bos.flush(); // clear out last remaining data to destination
				bos.close();
				fos.close();
			} catch (IOException e){
				System.out.println(e);
			}
			
		}
		
		

	}

}
