package javaFileHandling;

import java.io.FileReader;

public class CreateFileInFileHandling {

	public static void main(String[] args) {
	
//		File file= new File("Javafile.txt");
//		try {
//			// create new file using object 
//			
//			boolean  value = file.createNewFile();
//			if(value) {
//				System.out.println("The file is created");
//			}else {
//				System.out.println("The file already exists");
//			}
//		}catch(Exception e) {
//			e.getStackTrace();
//			System.out.println("exception is handled , file can not be created");
//		}
   char[] array = new  char[1000];
     try {
	   FileReader  obj = new FileReader("Javafile.txt");
	   obj.read(array);
	   System.out.println("data in the file");
	   System.out.println(array);
	   obj.close();
     }catch(Exception e){
	  e.getStackTrace();
	   }

}
}
