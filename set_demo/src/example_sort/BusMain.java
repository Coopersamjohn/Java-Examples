package example_sort;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class BusMain {

	public static void main(String[] args) {
		
		// Set of <Bus> objects
		// Set<Bus> busList=new HashSet<>();
		
		Set<Bus> busList=new TreeSet<>();
		
		busList.add(new Bus(101, "ABC Travels", 1200.99, 2.5f));
		busList.add(new Bus(122, "K Travels", 1100.99, 1.5f));
		busList.add(new Bus(102, "PQR Travels", 1300.99, 2.5f));
		busList.add(new Bus(231, "JME Travels", 1100.99, 2.5f));
		busList.add(new Bus(121, "JEE Travels", 1200.99, 4.5f));
		busList.add(new Bus(141, "JAVA Travels", 1200.99, 4.8f));
		busList.add(new Bus(141, "JAVA Travels", 1200.99, 4.8f));
		busList.add(new Bus(122, "K Travels", 1100.99, 1.5f));
		busList.add(new Bus(133, "Kay Travels", 1300.99, 1.5f));
		busList.add(new Bus(101, "ABC Travels", 1200.99, 2.5f));
		
		
		// prints in Hash order
		printBuses(busList);
		
		
	}

	public static void printBuses(Set<Bus> busList) {
		//System.out.println("Total "+busList.size()+" no of buses available");
		System.out.println("Printing Bus Details");
		for(Bus b:busList) {
			System.out.println(b);
		}
	}
	
}
