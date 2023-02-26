package hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));

		System.out.println(set);
	}
}

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + ":" + age;
	}
}
