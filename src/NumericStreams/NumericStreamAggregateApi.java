package NumericStreams;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Aggregate Functions in Numeric Streams
 *     sum()
 *     max()
 *     min()
 *     average()
 */
public class NumericStreamAggregateApi {

    public static void main(String[] args) {
        int sum = IntStream.range(1,50).sum();
        System.out.println("Sum : "+sum);

        OptionalInt optionalInt = IntStream.range(1,50).max();
        System.out.println(optionalInt.isPresent()?optionalInt.getAsInt():0);

        OptionalLong optionalLong = LongStream.rangeClosed(1,50).min();
        System.out.println(optionalLong.isPresent()?optionalLong.getAsLong():0);
    }
}
