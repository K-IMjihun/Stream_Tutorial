package Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class Stream_1 {
    public static void main(String[] args) {
        // 정렬 후 출력
        String[] nameArr = {"A, B, C, D, G, E, F"};
        List<String> nameList = Arrays.asList(nameArr);

        Stream<String> nameStream = nameList.stream();
        nameStream.sorted().forEach(System.out::println);


    }
}
