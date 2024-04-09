package classcode.Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashsetToArraylistPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> hs=new HashSet<String>();
hs.add("ganga");
hs.add("shaju");
hs.add(null);
hs.add("veena");
hs.add("arush");
hs.add("kunju");
hs.add("shiga");
System.out.println("hashset:"+hs);
ArrayList<String> al=new ArrayList<String>(hs);
System.out.println("ArrayList:"+al);
	}

}
