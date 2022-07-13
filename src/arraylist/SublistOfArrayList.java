package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SublistOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<String>  languages = new ArrayList<String>();
       languages.add("hindi");
       languages.add("english");
       languages.add("kannad");
       languages.add("tamil");
       languages.add("spanish");
       System.out.println("Original Array List: "+ languages);
       // original array list
       ArrayList<String>  language = new ArrayList<String>(languages.subList(1, 4));
       // sublist of array list
       System.out.println("Sub list of  Array List is : "+ language);
       // list of sublist
       List<String>  list = languages.subList(1,4);
       System.out.println("Sub list of  List is : "+ list);
       // swap
       Collections.swap(languages, 1, 4);
       System.out.println("List after swapping");
       for (String swapArray:languages) {
    	   System.out.println( swapArray); 
       }
       
	}
	
	

}
