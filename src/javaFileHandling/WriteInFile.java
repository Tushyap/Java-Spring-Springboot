package javaFileHandling;

import java.io.FileWriter;
import java.util.Scanner;

public class WriteInFile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String data =  sc.nextLine();
		sc.close();
		 try {
			   FileWriter o =  new FileWriter("Javafile.txt");
			   o.write(data);
			   System.out.println("Data is written");
			   o.close();
		     }catch(Exception e){
			  e.getStackTrace();
			   }

	}

}
