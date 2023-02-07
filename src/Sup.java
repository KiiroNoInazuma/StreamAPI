import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Sup {

    int test() {
        return (int) 12.1;
    }

    static Supplier<? extends Integer> state() {
        return () -> (int) (Math.random() * 11);

    }

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.generate(state());
        integerStream.limit(1).forEach(System.out::println);
    }
}
