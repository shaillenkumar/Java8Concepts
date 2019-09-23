package ParallelStream;

import java.util.stream.IntStream;

public class ParallelStreamEx {
    public static int sum_sequentialStream(){
        int sum = IntStream.rangeClosed(1,10000).sum();
        return sum;
    }
    public static int sum_parallelStream(){
        int sum = IntStream.rangeClosed(1,10000)
                .parallel()
                .sum();
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum_sequentialStream());
        System.out.println(sum_parallelStream());

    }
}
