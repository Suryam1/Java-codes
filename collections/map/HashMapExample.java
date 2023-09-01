package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public HashMapExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> data = new HashMap<Integer, String>();
		
		/*
		 * Add or update value : put()
		 */
		
		data.put(101, "Mercury");
		data.put(102, "Venus");
		data.put(103, "Earth");
		data.put(104, "Mars");
		data.put(105, "Jupiter");
		data.put(106, "Saturn");
		data.put(107, "Uranus");
		
		
		data.put(108, "Pluto"); //wrong value
		data.put(108,"Neptune");  //update
		
		System.out.println(data);
		
		/*
		 * Get Size : size()
		 */
		
		System.out.println(data.size());
		
		/*
		 * Retrieve value : get(hey)
		 */
		
		System.out.println("Key 103 value is "+data.get(103));
		
		/*
		 * Search the Key : containsKey(key)
		 */
		
		System.out.println(data.containsKey(103));
		
		/*
		 * Remove the data : remove(key)
		 */
		
		data.put(109, "Temp Data");
		System.out.println(data);
		data.remove(109);
		
		//1. Print statement
		System.out.println(data);
		
		//2. entrySet() method
		for(Map.Entry<Integer, String> entry: data.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		//3. keySet() method
		for(Integer key:data.keySet()) {
			System.out.println(key);
		}
		
		//4. values() method
		for(String value : data.values()) {
			System.out.println(value);
		}
		
		//5. forEach Loop
		data.entrySet().forEach(entry->{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		});
		
	}
	

}
