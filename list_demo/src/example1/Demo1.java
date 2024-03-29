package example1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		// this is called a generic interface
		List li=new LinkedList();
		li.add("dsfhds");
		li.add(23.44);
		li.add(99);
		li.add(true);
		li.add('c');
		System.out.println(li);
		
		List<Integer> li2 = new LinkedList<>();
		// li2.add("dsfsdf") - error because type conflict
		li2.add(123);
		li2.add(123);
		li2.add(4555);
		li2.add(1233);
		li2.add(999);
		li2.add(null);
		li2.add(null);
		li2.add(23);
		li2.add(44);
		li2.add(123);
		System.out.println(li2);
		
		// first number becomes position
		li2.add(2,9);
		System.out.println(li2);
		// How big is the collection??
		System.out.println(li2.size());
		
		li2.set(0,  1000);
		System.out.println(li2);
		
		// remove by position!! - sees this a INDEX
		//li2.remove(1000); // error because out of bounds
		
		// remove(Object) - the first encountered
		Integer i=1000;
		li2.remove(i);
		System.out.println(li2);
		
		// remove(position)
		li2.remove(7); // remove by position
		System.out.println(li2);
		
		// removes all occurences of object i2 ?!?!?!?!?!?!?!
		Integer i2=123;
		while(li2.remove(i2)) {};
		System.out.println(li2);
		
		// get index
		System.out.println(li2.get(0));
		
		// return each list item
		for (int j = 0; j < li2.size(); j++) {
			System.out.println(li2.get(j));
		}
		
		// new ArrayList from old LinkedList
		List<Integer> li3=new ArrayList<>(li2);
		System.out.println("li3 is::: "+li3);
		//adding old LinkedList to new ArrayList
		// addAll is link union
		li3.addAll(li2);
		System.out.println("li3 is now::: "+li3);
		
		List<Integer> li4=new ArrayList<>();
		li4.add(123);
		li4.add(44);
		li4.add(22);
		li4.add(77);
		li4.add(66);
		li4.add(1000);
		li4.add(1000);
		
		System.out.println("li4 = "+li4);
		System.out.println("li2 = "+li2);
		
		
//		li2.retainAll(li4);
//		System.out.println(li2);
		
		// contents A not in B
		li2.removeAll(li4);
		System.out.println(li2);
		
		// get rid of nulls
		Collections.replaceAll(li2, null, 22);
		System.out.println(li2);
		
		// Collections Class
		//Collections.sort(li2); // ascending
		Collections.sort(li2, Collections.reverseOrder()); // descending
		System.out.println(li2);
		
		// Reverse order
		Collections.reverse(li2);
		System.out.println(li2);
		
		Collections.shuffle(li2);
		System.out.println(li2);
		
		Collections.sort(li2);
		// .binarySearch returns positive position number if found, negative value if not found
		System.out.println(Collections.binarySearch(li2, 9999));
		
		// does list contain value?
		System.out.println(li2.contains(100)); // false
		System.out.println(li2.contains(999)); // true
		
		System.out.println(Collections.binarySearch(li2, 999));
		
		

	}

}
