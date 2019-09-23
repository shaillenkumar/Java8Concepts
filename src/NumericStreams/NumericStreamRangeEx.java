package NumericStreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangeEx {
    /**
     * IntStream.range(1,50) returns 1 to 49
     * IntStream.rangeClosed(1,50) returns 1 to 50
     * LongStream.range(1,50) returns 1 to 49
     * LongStream.rangeClosed(1,50) returns 1 to 50
     * DoubleStream does not stop range() and rangeClosed()
     */

    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1,50);
        IntStream intStreamRangeClosed = IntStream.rangeClosed(1,50);
        System.out.println("--------");
        intStream.forEach(System.out::println);
        System.out.println("--------");
        intStreamRangeClosed.forEach(System.out::println);
        System.out.println("--------");
        long longStreamCount = LongStream.rangeClosed(1,35).count();
        System.out.println("Long Stream Count "+longStreamCount);
        System.out.println("--------");
        IntStream.range(1,50).asDoubleStream().forEach(System.out::println);
    }
}
