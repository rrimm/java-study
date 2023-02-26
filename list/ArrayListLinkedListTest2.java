package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListLinkedListTest2 {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>(1000000);
		List<String> ll = new LinkedList<>();
		add(al);
		add(ll);

		System.out.println("= 접근시간테스트 =");
		System.out.println("ArrayList :" + access(al));
		System.out.println("LinkedList :" + access(ll));
		add(al);
		add(ll);
	}

	public static void add(List<String> list) {
		for (int i = 0; i < 100000; i++) {
			list.add(i + "");
		}
	}

	public static long access(List<String> list) {	// 0~list.size의 임의 인덱스를 생성한 후 get 메서드를 사용하여 해당 인덱스 요소에 액세스
		Random random = new Random();
		long start = System.currentTimeMillis();
	    for (int i = 0; i < 10000; i++) {
	        int index = random.nextInt(list.size());
	        list.get(index);
	    }
	    long end = System.currentTimeMillis();
	    return end - start;
	}
}