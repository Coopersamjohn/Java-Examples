package iterator_example;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IteratorDemo {

	public static void main(String[] args) {

		
		Set<String> ts=new TreeSet<>();
		
		ts.add("java");
		ts.add("jee");
		ts.add("abc");
		ts.add("xyz");
		ts.add("java");
		ts.add("jee");
		ts.add("hey");
		ts.add("hello");
		ts.add("enumerator");
		ts.add("iterator");
		ts.add("listIterator");
		System.out.println("Contents of your treeset before deletion");
		System.out.println(ts);
		
		// this produces ConcurrentModificationException because TreeSet doesn't work with enhanced for loop
		// for(String s:ts) { if(s.startsWith("j")) { ts.remove(s); } } 
		
		// for TreeSet, use Iterator
		Iterator<String> i=ts.iterator();
		while (i.hasNext() ) {
			String s = i.next();
			if(s.startsWith("j")) {
				i.remove();
			}
		}
		
		System.out.println("Contents of your treeset after deletion");
		System.out.println(ts);
		
		/*
		 * Enumerator
		 * (read from top to bottom only)
		 * child-> Iterator
		 * (read and remove from top to bottom only)
		 * child-> ListIterator
		 * (add,read,remove from any direction, but applicable only on List Interface
		 */
		

	}

}
