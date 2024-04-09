package classcode.Collection;

import java.util.Collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedhashmaEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String,String> ele=new LinkedHashMap<String,String>();
		ele.put("113","shiga");
		ele.put("111","shiga");
		ele.put("113","arush");
		ele.put(null,"rai");
		ele.put("112",null);
		ele.put("114",null);
		ele.put("117", "kanmani");
		ele.put(null,"raji");  
		System.out.println(ele); 
		
		// 113:aana 111:john null:divya 112:null 114:null 117:ddg
		for(String key:ele.keySet()) {
			System.out.println(key);
		}
		for(String value:ele.values()) {
			System.out.println(value);
		}
		for(Map.Entry display:ele.entrySet()){
		System.out.println("key="+display.getKey()+" and value="+display.getValue());
		
		}
		
		
	
		
		
		
		

	}

}
// 113-aana   111-john  null-divya  112-null 114-null 117-ddg  
//null-divya 