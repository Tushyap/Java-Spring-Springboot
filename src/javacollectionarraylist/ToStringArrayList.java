package javacollectionarraylist;

import java.util.ArrayList;

import collectionarraylist.Tostringarraylist;

public class ToStringArrayList {

	public static void main(String[] args) {
		ArrayList<Tostringarraylist>  arrayList =new ArrayList<Tostringarraylist>();
		arrayList.add(new Tostringarraylist(101, "Tushyap","Software Engineer",4));
		for (Tostringarraylist display:arrayList) {
			System.out.println(display);
		}
	}

}
