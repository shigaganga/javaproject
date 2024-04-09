package classcode.Collection;

import java.util.HashSet;

public class HashSetEx {

	/*  Set 
	 *    Set is an unordered Collection.
	 *    Set will not allow duplicate 
	 *    Cannot access the data in the Set by Index.
	 *    it will allow null 
	 *  
	 * 
	 */

		
		public static void main(String[] args) {
			
			HashSet<Integer> hs = new HashSet<Integer>();
			hs.add(10);
			hs.add(9);
			hs.add(13);
			hs.add(20);
			hs.add(15);
			hs.add(20);
			hs.add(null);
			hs.add(null);
			
			for(Integer num:hs) {
				System.out.println(num);
				
			}
			
		}

	}

