package classcode.Collection;
import java.util.HashMap;
import java.util.Map;

public class UniqueWordOnlyPractise {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	 String str="Dog chases cat and cat chases rat";
	 freequency(str);
	 }
		
	 public static void freequency( String str) {
		 
		
		 String str2=str.toLowerCase();
		String[] newstr=str2.split("\\s+");      //same as str.split(" ") ie split words with space and returs array of string
		 Map<String, Integer> hmap=new HashMap<String, Integer>();
		for(String word :newstr) {
			if((hmap.containsKey(word))) {//if more than one time paticular word present it removes the word
				hmap.remove(word);
			}
			else {
					hmap.put(word, 1);//only one time that word present in particular string ,put(key,value)
				}
			
			}
		System.out.println(hmap.keySet());
		}


}
