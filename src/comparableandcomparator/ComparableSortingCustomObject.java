package comparableandcomparator;


class Author implements Comparable<Author>{
	// data members
	String firstName;
	String lastName;
	String bookName;
  Author(String firstName, String lastName, String bookName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.bookName = bookName;
	}
@Override
public int compareTo(Author o) {
	int last = this.lastName.compareTo(o.lastName);
	return last==0?this.firstName.compareTo(o.firstName):last;
}
	
	
}
public class ComparableSortingCustomObject {

}
