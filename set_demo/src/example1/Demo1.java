package example1;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {

		// doesn't maintain order of insertion, uses hash order
		Set<String> hs=new HashSet<>();
		hs.add("java");
		hs.add("jee");
		hs.add("abc");
		hs.add("xyz");
		hs.add("java");
		hs.add("jee");
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
		// maintains order of insertion
		Set<String> lhs=new LinkedHashSet<>();
		lhs.add("java");
		lhs.add("jee");
		lhs.add("abc");
		lhs.add("xyz");
		lhs.add("java");
		lhs.add("jee");
		lhs.add(null);
		lhs.add(null);
		System.out.println(lhs);
		
		// alphabetical order, CAN"T ACCEPT NULLS
		//Set<String> ts=new TreeSet<>();
		// use this for reverse order
		Set<String> ts=new TreeSet<>(Collections.reverseOrder());
		ts.add("java");
		ts.add("jee");
		ts.add("abc");
		ts.add("xyz");
		ts.add("java");
		ts.add("jee");
		// ts.add(null);
		// ts.add(null);
		System.out.println(ts);
		
		//Set<String> synchSet=Collections.synchronizedSet(ts);
		//System.out.println(synchSet);
		
		ts.remove("xyz");
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.contains("xyz"));
		System.out.println(ts.contains("java"));
		
		/*
		 * for each
		 * for in
		 * enhanced for loop, advanced for loop
		 * Syntax for(type iterable:ObjectArray) {
		 * 		iterate
		 * }
		 * 
		 * Use for unindexed
		 */
		 
		for(String s:ts) {
			System.out.println(s);
		}
		
		int ar[]= {12,11,11,22,33,44};
		for(int x:ar) {
			System.out.println(x);
		}
		
		/*
		 * for(Object o:ts) { if (o == String) { // then do something } else if (o ==
		 * Integer) { // do something else } System.out.println(o); }
		 */
		
		ts.clear();
		System.out.println(ts);
	}

}
