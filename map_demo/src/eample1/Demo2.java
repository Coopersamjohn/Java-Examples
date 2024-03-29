package eample1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Map<String, List<String>> countryMap=new LinkedHashMap<>();
		
		System.out.println("Enter # of countries");
		
		int n=sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Entr country - "+(i+1)+" name - ");
			String country=sc.next();
			System.out.println("Enter number of states you want in country - "+country);
			int c=sc.nextInt();
			List<String> stateList=new ArrayList<>();
			System.out.println("Enter "+c+" number of state/s for the country "+country);
			for (int j=0; j<c; j++) {
				stateList.add(sc.next());
			}
			countryMap.put(country, stateList);			
		}
		
		System.out.println("Printing all countries and their states");
		for(Entry<String, List<String>>e:countryMap.entrySet()) {
			System.out.println("Country Name - "+e.getKey());
			List<String> stateList=e.getValue();
			System.out.println("List of states are");
			for(String s:stateList) {
				System.out.println(s);
			}
		}
		

	}

}
