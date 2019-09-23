package ParallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamPerformanceEx {
    public static long checkPerformanceResult(Supplier<Integer> supplier, int numberOfTimes){
        long startTime = System.currentTimeMillis();
        for(int i=0; i<=30; i++){
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return (endTime-startTime);
    }
    public static int sum_sequentialStream(){
        int sum = IntStream.rangeClosed(1,1000000).sum();
        return sum;
    }
    public static int sum_parallelStream(){
        int sum = IntStream.rangeClosed(1,1000000)
                .parallel()
                .sum();
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Available Processors = "+Runtime.getRuntime().availableProcessors());
        System.out.println("Sum Parallel Stream - Performance = " +checkPerformanceResult(ParallelStreamPerformanceEx::sum_parallelStream,10));
        System.out.println("Sum Sequential Stream - Performance = " + checkPerformanceResult(ParallelStreamPerformanceEx::sum_sequentialStream,10));

    }
}
