package Files;

import java.io.FileWriter;
import java.io.IOException;

public class WritetoFile {

	public static void main(String[] args) {
	
		try {
			FileWriter myWriter =new FileWriter("D:\\WiproFiles\\TestDemodoc.txt");
			myWriter.write("Welcome to Wipro Tech");
			myWriter.close();
			System.out.println("Successfully wrote to the file");
		}catch(IOException e ) {
			System.out.println("An error Occured ");
			e.printStackTrace();
		}
	}
}

		
			
	
		
		
		
		
		
	

