package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        // of() 메소드를 사용하여 스트림 생성
        Stream<String> stream = Stream.of("apple", "banana", "cherry", "date", "elderberry");

        // 스트림 요소 출력
        stream.forEach(System.out::println);

    }
}
