package collection;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "Sagar");
		m.put(2, "vaishvik");
		m.put(3, "pawan");
		m.put(4, "umesh");
		m.put(3, "sayali");
		m.put(5, "umesh");
		
		System.out.println(m.values());
		System.out.println(m.keySet());
		System.out.println(m.containsKey(5)); // false
		System.out.println(m.containsKey(2)); // true
	System.out.println(m.containsValue("shubham")); // false
		System.out.println(m.containsValue("pawan")); // true
		
		
		
		System.out.println(m.get(1)); // sagar
		System.out.println(m.get(3)); // pawan will replace with sayali
		System.out.println(m.entrySet()); // returns all pair of key and value
		
		// entry method
		for( Map.Entry entry :m.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		Set entry = m.entrySet();
		Iterator itr = entry.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		for (int k : m.keySet())
		{
			System.out.println(k + "  "+m.get(k));
		}
	}

}
