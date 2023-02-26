package maptreecomparison;

import java.util.HashMap;
import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapTreeComparison2 {	//  일반적으로 hashmap이 self-balancing tree보다 실행시간이 빠름을 보여주는 예시. 
	//hashmap: 해시 함수를 사용하여 메모리에서 키-값 쌍의 위치를 계산
	// self-balancing tree: 노드를 탐색하며 트리를 지남
	public static void main(String[] args) {
		int numItems = 1000000;
		Random rand = new Random();

		// Using a self-balancing tree to store key-value pairs
		SortedMap<Integer, Integer> treeMap = new TreeMap<>();
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < numItems; i++) {
			treeMap.put(rand.nextInt(numItems), i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println(
				"Time to insert " + numItems + " items into self-balancing tree: " + (endTime - startTime) + "ms");

		startTime = System.currentTimeMillis();
		treeMap.get(rand.nextInt(numItems));
		endTime = System.currentTimeMillis();
		System.out.println("Lookup time for self-balancing tree: " + (endTime - startTime) + "ms");

		// Using a hashmap to store key-value pairs
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		startTime = System.currentTimeMillis();
		for (int i = 0; i < numItems; i++) {
			hashMap.put(rand.nextInt(numItems), i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Time to insert " + numItems + " items into hashmap: " + (endTime - startTime) + "ms");

		startTime = System.currentTimeMillis();
		hashMap.get(rand.nextInt(numItems));
		endTime = System.currentTimeMillis();
		System.out.println("Lookup time for hashmap: " + (endTime - startTime) + "ms");
	}

}
