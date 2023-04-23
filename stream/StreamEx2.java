package stream;

import java.util.ArrayList;
import java.util.List;

public class StreamEx2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // 병렬 스트림을 이용하여 짝수만 필터링하고, 그 합을 구함
        int sumOfEvenNumbers = numbers.parallelStream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("짝수의 합: " + sumOfEvenNumbers); // 출력: 짝수의 합: 30
    }
}
