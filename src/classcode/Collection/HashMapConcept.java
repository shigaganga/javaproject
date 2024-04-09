package classcode.Collection;


	import java.util.HashMap;
	import java.util.Map;

	public class HashMapConcept {
		
		public static void main(String[] args) {
			
			HashMap<Integer, String> hm = new HashMap<Integer, String>();
			hm.put(101, "Jnanesh");
			hm.put(102, "Rajapriya");
			hm.put(104, "Sridevi");
			hm.put(103, "Kiranmayi");
			hm.put(106, "Nazia");
			hm.put(106, "Pavani");


			System.out.println(hm.get(106));

			HashMap<String, String> hm1 = new HashMap<String, String>();
			hm1.put("A123", "Jnanesh");
			hm1.put("*", "Rajapriya");
			hm1.put("test", "Sridevi");
			hm1.put("123", "Kiranmayi");
			hm1.put(null, "Nazia");
			hm1.put("check", "Pavani");
			hm1.put("1", null);
			hm1.put("2", null);
			hm1.put(null, "Meghana");
			hm1.put("", "Meghana");
			
			
			System.out.println(hm1.get(""));
			
		
			for(String value:hm1.values()) {
				//System.out.println(value);
			}
			
			for(String key:hm1.keySet()) {
//				System.out.println(key);
			}
		
			
			for(Map.Entry display : hm1.entrySet()) {
				
				System.out.println(display.getKey()+" "+display.getValue() );
			}		
			
			
			
		}
		
		

	}

