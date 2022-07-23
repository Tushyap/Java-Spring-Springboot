package javaFileHandling;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {

	    // creates a file object
		try {
	    File file = new File("file.txt");
	    // create file
	    boolean  value = file.createNewFile();
		if(value) {
			System.out.println("The file is created");
		}else {
			System.out.println("The file already exists");
	      }
		// can read method
		boolean  canRead = file.canRead();
		if(canRead) {
			System.out.println("We can read the file");
		}else {
			System.out.println("we can not read the file");
	      }
        // can write method
		boolean  canWrite = file.canRead();
		if(canWrite) {
			System.out.println("We can write in the file");
		}else {
			System.out.println("we can not write in the file");
	      }
		
		// exists method
		boolean  exists = file.exists();
		if(exists) {
			System.out.println("file exists");
		}else {
			System.out.println("file does not exists");
	      }
		// name of the file
		String  name= file.getName();
		System.out.println("Name of the file : "+name);
		
		// path of the file
		String  path= file.getAbsolutePath();
		System.out.println("Path of the file : "+path);	
	      
		// length of the file
		long length= file.length();
		System.out.println("Length of the file : "+length);	
			      
		// list of the file
		String[] listOfDir= file.list();
		System.out.println("List of dir : "+listOfDir);	
		
		File files = new File("files.txt");
		// make directory
		boolean  makeDir= files.mkdir();
		if(makeDir) {
			System.out.println("Directory created");
		}else {
			System.out.println("Directory did not created");
	      }
		// deletes the file
	    boolean val = file.delete();
	    if(val) {
	      System.out.println("The File is deleted.");
	    }
	    else {
	      System.out.println("The File is not deleted.");
	    }
		}catch(Exception e) {
			e.getStackTrace();
		}
	  }

}
