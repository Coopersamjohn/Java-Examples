package example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeMain {

	public static void main(String[] args) {


		CreditCard cc=new CreditCard(1234567890123456L, "Bob", "ABC Bank", 122);
		
		try(FileOutputStream fos=new FileOutputStream("serialize.txt");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				){
			oos.writeObject(cc);
			System.out.println("Object Serialized");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
		
		
		
		

	}

}
