package classcode.Collection;
import java.util.ArrayList;

public class ArrayListEx{


	

	/* List maintains the insertion order.
	 *  List is not a sorted collection
	 * List can allow duplicate values 
	 * List allow null value
	 * Collection can hold hetorogenous Data.
	 * put data to collection - add
	 *  to retreview - get. 
	 */


		
		public static void main(String[] args) {
			
			ArrayList <Object> arrayList = new ArrayList<Object>();
			arrayList.add("Jnanesh");
			arrayList.add(22);
			arrayList.add("Kishore");
			arrayList.add(21.0);
			arrayList.add(34);
			arrayList.add(2, "Java");
			
			
			// \ - back slash
			// /= forward slash
			
			/*
			 * for(int i=0; i<arrayList.size(); i++) { System.out.println(arrayList.get(i));
			 * }
			 */ 
			
			//foreach loop
		  for(Object data:arrayList)	{
			  System.out.println(data);
		  }
			
			
		}

	}


