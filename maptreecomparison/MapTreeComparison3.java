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
		// headMap method 활용: 첫 엘리먼트에서 targetValue 범위 안에 속한 객체를 반환(시간: O(log n))
		long startTime = System.currentTimeMillis();	
		SortedMap<Integer, Integer> treeRangeMap = treeMap.headMap(targetValue);	
		long endTime = System.currentTimeMillis();
		System.out.println("Time to perform range search on self-balancing tree: " + (endTime - startTime) + "ms");	// print out the time taken to perform the range search on the self-balancing tree
		System.out.println("Number of items found: " + treeRangeMap.size());	// sub-map(두 개의 숫자를 입력해서 그 사이의 객체 반환)

		// Using hashmap for range search
		// 맵의 모든 key-value pairs에 대해 읽어내길 반복하는 방식: targetValue보다 작은 값일 때 해당 키를 list에 추가(시간: O(n))
		startTime = System.currentTimeMillis();
		List<Integer> hashRangeList = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {	// iterate key-value pairs
			if (entry.getValue() < targetValue) {	// check if the value of the current key-value pair가 target value보다 작은 경우
				hashRangeList.add(entry.getKey());	// 조건을 만족하면 키 삽입
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println("Time to perform range search on hashmap: " + (endTime - startTime) + "ms");	//  hashmap으로 range search 시간
		System.out.println("Number of items found: " + hashRangeList.size());	// ArrayList에서 찾은 값
	}

}
