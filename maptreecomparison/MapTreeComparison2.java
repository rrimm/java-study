package maptreecomparison;

import java.util.HashMap;
import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapTreeComparison2 {	//  일반적인 탐색 예시 
	//hashmap: 해시 함수를 사용하여 메모리에서 키-값 쌍의 위치를 계산
	// self-balancing tree: 노드를 탐색
	public static void main(String[] args) {
		int numItems = 100000; // 랜덤으로 생성하는 숫자 개수
		Random random = new Random();
		int targetValue = 50000; // 찾고자 하는 값

		// self-balancing tree
		SortedMap<Integer, Integer> treeMap = new TreeMap<>();
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < numItems; i++) {
			treeMap.put(random.nextInt(100000), i);	// 100000까지의 숫자중에서 찾기
		}
		long endTime = System.currentTimeMillis();

		System.out.println("= 접근시간테스트 =");
		System.out.println("랜덤으로 생성하는 숫자 개수: " + numItems);
		System.out.println(" self-balancing tree 기준: " + numItems + "개의 데이터를 삽입하는 시간은 " + (endTime - startTime) + "ms");

		startTime = System.currentTimeMillis();
		boolean foundInTree = treeMap.containsValue(targetValue);
		endTime = System.currentTimeMillis();
		System.out.println(" self-balancing tree 기준: " + numItems + "개의 데이터를 탐색하는 시간은 " + (endTime - startTime) + "ms");
		System.out.println("탐색 성공 여부: " + foundInTree);
		System.out.println();
		

		// hashmap
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		startTime = System.currentTimeMillis();
		for (int i = 0; i < numItems; i++) {
			hashMap.put(random.nextInt(100000), i);
		}
		endTime = System.currentTimeMillis();
		System.out.println(" hashmap 기준: " + numItems + "개의 데이터를 삽입하는 시간은 " + (endTime - startTime) + "ms");
		startTime = System.currentTimeMillis();
		boolean foundInHash = hashMap.containsValue(targetValue);
		endTime = System.currentTimeMillis();
		System.out.println(" hashmap 기준: " + numItems + "개의 데이터를 탐색하는 시간은 " + (endTime - startTime) + "ms");
		System.out.println("탐색 성공 여부: " + foundInHash);
	}

}
