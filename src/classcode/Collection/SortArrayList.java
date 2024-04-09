package classcode.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(16);
		al.add(33);
		al.add(7);
		al.add(1);
		System.out.println("original order is:"+al);
Collections.sort(al);
System.out.println("after sorting arraylist in ascending order:"+al);
Collections.sort(al,Collections.reverseOrder());
System.out.println("after sorting arraylist inthe descending order: "+al);
	}

}
