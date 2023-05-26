package Files;

import java.io.File;
import java.io.IOException;

public class CreatingFilesDirectory {

	public static void main(String[] args) {
	 try {
		 File myobj =new File("D:\\WiproFiles\\dvl.txt");
		 
		 if(myobj.createNewFile()) {
			 System.out.println("File created "+ myobj.getName());
			 System.out.println("Absolute path: "+ myobj.getName());
		 }else {
			 System.out.println("File already exists");
		 }
	 }catch(IOException e) {
		 
		 System.out.println("An error occured");
		 e.printStackTrace();
 	
	 }
		
		

	}

}
