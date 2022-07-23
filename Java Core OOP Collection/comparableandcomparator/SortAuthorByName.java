package comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortAuthorByName {

	public static void main(String[] args) {
		ArrayList<Author> al = new ArrayList<Author> ();
		al.add(new Author("Chetan", "Bhagat", "Half Girlfriend"));
		al.add(new Author("Ankur", " Warikoo", "Do Epic Shit "));
		al.add(new Author("RD", "Sharma ", "Mathematics "));
		al.add(new Author("frank", " Miller ", "300 "));
		Collections.sort(al);;
		 for(Author disPlay: al) {
			 System.out.println(disPlay.firstName +" "+ disPlay.lastName + " "+ "Book "+ disPlay.bookName);
		 }

	}

}
