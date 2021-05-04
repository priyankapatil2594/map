package com.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap; 
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;

public class WaysToIterateHashmap {
	
public static void main(String[] args) {
		
		Map <Integer , String> employeeinfo = new HashMap <Integer , String>();
		
		employeeinfo.put(11 , "Candy");
		employeeinfo.put(12 , "Pihu");
		employeeinfo.put(13 , "Murali");
		employeeinfo.put(14 , "Aniket");
		employeeinfo.put(15 , "Shubham");
		
		System.out.println("Emplyee details :- " + employeeinfo);
		
		System.out.println("************************************");
		
		IterateKey(employeeinfo);
		
		System.out.println("\n***********************************");
		
		IteratValue(employeeinfo);
		
		
		System.out.println("\n***********************************");
		
		IterateEntry(employeeinfo);
		
		System.out.println("\n***********************************");
	
		System.out.println("Using For eatch loop");
		
		forEatchKey(employeeinfo);
		
		System.out.println("\n***********************************");
		
		forEatchValue(employeeinfo);
		
		System.out.println("\n***********************************");
		
		forEatchEntries(employeeinfo);
	}
	
	
	// method using Iterator on key
	public static void IterateKey(Map <Integer , String> m) {
		Set <Integer> allKeys = new HashSet <Integer>();
		allKeys = m.keySet();
		Iterator <Integer> itr = allKeys.iterator();
		System.out.print("All key's are :- ");
		while(itr.hasNext()) {
			System.out.print(itr.next() + ", ");
		}
		
	}
	
	// method using Iterator on values
	public static void IteratValue(Map <Integer , String> m ) {
		Collection <String> allValues = new ArrayList <String> ();
		allValues = m.values();
		Iterator <String> itr = allValues.iterator();
		System.out.print("All value's are :- ");
		while(itr.hasNext()) {
			System.out.print(itr.next() + ", ");
		}
	}
 
	// method using Iterator on Entry<k,v>
	public static void IterateEntry(Map <Integer , String> m) {
		Set <Entry<Integer , String> > allEntries = new HashSet <>();
		allEntries = m.entrySet();
		Iterator <Entry<Integer , String>> itr = allEntries.iterator();
		System.out.print("All Entries in map :- " );
		while(itr.hasNext()) {
			System.out.print(itr.next() + ", ");
		}
	}
	
	// method using foreatch on keys
	public static void forEatchKey(Map <Integer , String> m) {
		Set <Integer> allKeys = new HashSet <Integer> ();
		allKeys = m.keySet();
		System.out.print("All key's are :- ");
		for(Integer key : allKeys)
			System.out.print(key + ", ");
		
	}
	
	// method using foreach on values
	public static void forEatchValue(Map <Integer , String> m) {
		Collection <String> allValues = new ArrayList <String> ();
		allValues = m.values();
		System.out.print("All value's are :- ");
		for(String value : allValues)
			System.out.print(value + ", ");
		
	}
	
	// method using foreatch on Entries
	public static void forEatchEntries(Map <Integer , String> m) {
		Set <Entry<Integer , String>> allEntries = new HashSet <>();
		allEntries = m.entrySet();
		System.out.print("All Entries in map :- " );
		for(Entry<Integer , String> e : allEntries){
			System.out.print(e + ", ");
		}
		
	}
	

}
