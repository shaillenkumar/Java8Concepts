package WhenNotToUseParallelStreams;
/***
 * Shailendra
 */

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedEx {

    public static int sequentialSum(List<Integer> integerList){
        long startTime = System.currentTimeMillis();
        int sum = integerList.stream()
                .reduce(0, (x,y) -> x+y);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to execute sequentialSum = "+ (endTime-startTime));
        return sum;
    }
    public static int parallelSum(List<Integer> integerList){
        long startTime = System.currentTimeMillis();
        int sum = integerList.parallelStream()
                .reduce(0, (x,y) -> x+y);  // Parallel Streams is notsuitable here because of Unbox operation.c
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to execute parallelSum = "+ (endTime-startTime));
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = IntStream.rangeClosed(1,10000)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(sequentialSum(intList));
        System.out.println(parallelSum(intList));
    }
}
