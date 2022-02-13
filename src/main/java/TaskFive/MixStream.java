package TaskFive;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MixStream {
    public static void main(String[] args) {

        List<Integer> mixStream = zip(Stream.of(1, 2, 4, 6), Stream.of(5, 8, 3, 7, 9))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(mixStream);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> elementFirst = first.iterator();
        Iterator<T> elementSecond = second.iterator();
        Stream<T> result = Stream.empty();
        while (elementFirst.hasNext() && elementSecond.hasNext()) {
            result = Stream.concat(result, Stream.of(elementFirst.next(), elementSecond.next()));
        }
        return result;
    }
}
