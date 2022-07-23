package collectionarraylist;

import java.util.ArrayList;

import javacollectionarraylist.ToStringStudentArrayList;

public class TostringstudentArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ToStringStudentArrayList> studentArrayList = new ArrayList<ToStringStudentArrayList>();
		studentArrayList.add(new ToStringStudentArrayList(25225140, "Tushyap","B.tech","2018-2022",790539142));
		for (ToStringStudentArrayList display:studentArrayList) {
			System.out.println(display);
		}
		
	}

}
