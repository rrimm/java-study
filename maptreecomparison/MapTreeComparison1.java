package maptreecomparison;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapTreeComparison1 {

	public static void main(String[] args) {
		// Using a self-balancing tree to store key-value pairs
		SortedMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("a", 1);
		treeMap.put("b", 2);
		treeMap.put("c", 3);
		long startTime = System.currentTimeMillis();
		System.out.println(treeMap.get("c"));
		long endTime = System.currentTimeMillis();
		System.out.println("Lookup time for self-balancing tree: " + (endTime - startTime) + "ms");

		// Using a hashmap to store key-value pairs
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("a", 1);
		hashMap.put("b", 2);
		hashMap.put("c", 3);
		startTime = System.currentTimeMillis();
		System.out.println(hashMap.get("c"));
		endTime = System.currentTimeMillis();
		System.out.println("Lookup time for hashmap: " + (endTime - startTime) + "ms");
	}
}
