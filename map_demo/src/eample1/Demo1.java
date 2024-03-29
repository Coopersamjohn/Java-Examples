package eample1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {

	public static void main(String[] args) {


		Map<Integer, String> hm=new HashMap<>();
		hm.put(123, "java");
		hm.put(145, "jee");
		hm.put(113, "deepesh");
		hm.put(null, "java");
		hm.put(178, null);
		hm.put(199, null);
		hm.put(199, "updated");
		System.out.println("HashMap DOES NOT maintain order of insertion, uses Hash Order");
		System.out.println(hm);
		
		Map<Integer, String> lhm=new LinkedHashMap<>();
		lhm.put(123, "java");
		lhm.put(145, "jee");
		lhm.put(113, "deepesh");
		lhm.put(null, "java");
		lhm.put(178, null);
		lhm.put(199, null);
		lhm.put(199, "updated");
		System.out.println("Linked Hash Map maintains order of insertion");
		System.out.println(lhm);
		
		Map<Integer, String> tm=new TreeMap<>();
		tm.put(123, "java");
		tm.put(145, "jee");
		tm.put(113, "deepesh");
		//tm.put(null, "java");
		tm.put(178, null);
		tm.put(199, null);
		tm.put(199, "updated");
		System.out.println("Tree Map maintains order of Keys");
		System.out.println(tm);
		
		Map<Integer, String> ht=new Hashtable<>();
		ht.put(123, "java");
		ht.put(145, "jee");
		ht.put(113, "deepesh");
		//ht.put(null, "java");
		//ht.put(178, null);
		//ht.put(199, null);
		ht.put(199, "updated");
		System.out.println("Tree Map maintains order of Keys");
		System.out.println(ht);
		
		System.out.println(ht.size());
		System.out.println(ht.containsKey(111));
		System.out.println(ht.containsValue("jee"));
		System.out.println(ht.get(111));
		System.out.println(ht.get(145));
		ht.remove(123);
		System.out.println("ID: 123 just removed "+ht);
		
		System.out.println("This is the key set thingy :::::"+ht.keySet());
		System.out.println(ht.values());
		
		// this is how to print out each Key/Value pair
		Set<Integer> set=ht.keySet();
		for(Integer i:set) {
			System.out.println("Key = "+i+" Value = "+ht.get(i));
		}

		// even shorter way to do it
		for(Entry<Integer, String> e:ht.entrySet()) {
			System.out.println("Key -> "+e.getKey()+" Value -> "+e.getValue());
		}
		
		System.out.println("Using Iterator");
		Iterator<Entry<Integer, String>> i=ht.entrySet().iterator();
		while(i.hasNext()) {
			Entry<Integer, String> e=i.next();
			System.out.println("Key is "+e.getKey()+" Value is "+e.getValue());
		}
	}

}
