package oops;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapmethod {
	public static void main(String[] args) {
		Map<Object,Object> m= new HashMap<>();
		
		m.put("rajavel", 29);
		m.put("senthil",  31);
		m.put("arun",  28);
		m.put("sathish", 27);
		
		System.out.println(m);
		System.out.println(m.values());
		System.out.println(m.keySet());
		System.out.println(m.entrySet());
		System.out.println(m.containsKey("rajavel"));
		System.out.println(m.containsValue(29));
	    System.out.println(m.get("senthil"));
	    

		
		
		
		
		Map<Integer,String> m1= new LinkedHashMap<>();
		
		m1.put(10, "britanio");
		m1.put(20, "marigold");
		m1.put(30, "dairkmilk");
		m1.put(40, "hastun");
		
		System.out.println(m1);
		
		Map<Integer,String> m2= new TreeMap<>();
		
		m2.put(10, "cinthol");
		m2.put(20, "dove");
		m2.put(30, "sandal");
		m2.put(40, "chandrika");
		
		System.out.println(m2);
		
		
	}

}
