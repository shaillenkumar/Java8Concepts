package WhenNotToUseParallelStreams;

import java.util.stream.IntStream;

public class SumClient {
    public static void main(String[] args) {
        Sum sum = new Sum();
        IntStream.rangeClosed(1,200)
                .parallel()  // you will not get the same result for the sequential Stream.
                .forEach(sum::performSummation); // sum is mutable object hence or suitable for Parallel Stream
        System.out.println(sum.getSum());
    }
}
