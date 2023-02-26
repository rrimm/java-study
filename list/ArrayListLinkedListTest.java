package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest {

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

	public static long access(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			list.get(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
}