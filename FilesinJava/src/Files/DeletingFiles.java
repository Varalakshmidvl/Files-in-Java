package Files;

import java.io.File;

public class DeletingFiles {

	public static void main(String[] args) {
		
		File myobj =new File("D:\\WiproFiles\\dvl.txt");
		 
		 if(myobj.delete()) {
			 System.out.println("Delete File "+ myobj.getName());
		
		 }else {
			 System.out.println("Failed to delete the file");

	}
	}

	}
