package maptreecomparison;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapTreeComparison3 { // Range Search의 경우

	public static void main(String[] args) {
		int numItems = 1000000; // key-value pairs 데이터를 무작위로 100만 개 생성
		Random random = new Random();

		// self-balancing tree를 활용한 key-value pairs 저장
		TreeMap<Integer, Integer> treeMap = new TreeMap<>();
		for (int i = 0; i < numItems; i++) {
			treeMap.put(random.nextInt(numItems), i);	// 랜덤값 삽입
		}

		// hashmap을 활용한 key-value pairs 저장
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < numItems; i++) {
			hashMap.put(random.nextInt(numItems), i);
		}

		// Range search용으로 500000보다 작은 값 지정
		int targetValue = 500000;

		// self-balancing tree를 활용한 range search
		// headMap method 활용: a view of the portion of the map whose keys are strictly
		// less than the target value.(시간: O(log n))
		long startTime = System.currentTimeMillis();	// record the current system time in milliseconds
		SortedMap<Integer, Integer> treeRangeMap = treeMap.headMap(targetValue);	// // get a sub-map of the self-balancing tree with keys less than targetValue
		long endTime = System.currentTimeMillis();
		System.out.println("Time to perform range search on self-balancing tree: " + (endTime - startTime) + "ms");	// print out the time taken to perform the range search on the self-balancing tree
		System.out.println("Number of items found: " + treeRangeMap.size());	// print out the number of items found in the sub-map

		// Using hashmap for range search
		// 맵의 모든 key-value pairs에 대해 읽어내길 반복하는 방식: targetValue보다 작은 값일 때 해당 키를 list에
		// 추가(시간: O(n))
		startTime = System.currentTimeMillis();
		List<Integer> hashRangeList = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {	// iterate over the key-value pairs in the hashmap
			if (entry.getValue() < targetValue) {	// check if the value of the current key-value pair is less than the target value
				hashRangeList.add(entry.getKey());	// add the key to the ArrayList if it satisfies the condition
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println("Time to perform range search on hashmap: " + (endTime - startTime) + "ms");	// print out the time taken to perform the range search on the hashmap
		System.out.println("Number of items found: " + hashRangeList.size());	// print out the number of items found in the ArrayList
	}

}
