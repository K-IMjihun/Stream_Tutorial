package Stream;

import java.util.function.*;

public class FuntionInterface {
    public static void main(String[] args) {


        // Supplier<T> : return값만 있는 Function 인터페이스
        Supplier<String> supplier = () -> "Hello World!";
        System.out.println(supplier.get());
        System.out.println("-------------------------------");

        // Consumer<T> : T를 매개변수로 받아서 사용하며, 반환값이 없는 함수형 인터페이스
        Consumer<String> consumer = (str) -> System.out.println(str.split(" ")[0]);
        // andThen() : 두개의 Consumer를 순차적으로 연결할 때 사용.
        // accept("Hello World") : "Hello World"를 첫 번째 Consumer 객체에 전달하여 실행
        consumer.andThen(System.out::println).accept("Hello World");
        System.out.println("-------------------------------");

        // Function<T, R> : T는 매개변수, R은 반환값을 갖는 함수형 인터페이스
        Function<String, Integer> function = str -> str.length();
        //apply() : Function 인터페이스에 정의된 동작을 수행한 후 결과 반환
        System.out.println(function.apply("hello world!"));
        System.out.println("-------------------------------");

        // Predicate <T> : T를 매개 변수로 받아 처리한 후 Boolean을 반환
        Predicate<String> predicate = (str) -> str.equals("Hello World");
        System.out.println(predicate.test("Hello World"));
    }
}
