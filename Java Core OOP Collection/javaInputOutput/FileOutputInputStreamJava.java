package javaInputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputInputStreamJava {

	public static void main(String[] args) {
		// creates a file object
				try {
			    File file = new File("fileJAva.txt");
			    // create file
			    boolean  value = file.createNewFile();
				if(value) {
					System.out.println("The file is created");
				}else {
					System.out.println("The file already exists");
			      } 
		             // file input stream
		             FileInputStream fin=new FileInputStream("fileJAva.txt");    
		             int i=fin.read();  
		             System.out.print((char)i);    
		   
		             fin.close();  
		          // file output stream
						
					  FileOutputStream fout=new FileOutputStream("fileJAva.txt");    
			             String s="Welcome to javaTpoint.";    
			             byte b[]=s.getBytes();//converting string into byte array    
			             fout.write(b);    
			             fout.close();    
			             System.out.println("success..."); 
				
				
				}catch(Exception e) {
					e.getStackTrace();
				}
		     
	}

}
