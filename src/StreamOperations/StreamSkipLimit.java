package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/***
 * Skip(n) -> skips n number of elements from the streams
 * Limit(n) -> limits to n number of elements to be processed in the streams
 */
public class StreamSkipLimit {

    public static Optional<Integer> streamLimit(List<Integer> intList){
        return intList.stream()
                .limit(3)       // will process first two elements in the List 6,7 and 8
                .reduce((x,y)->x+y);
    }
    public static Optional<Integer> streamSkip(List<Integer> intList){
        return intList.stream()
                .skip(3)       // will skip 6,7,8 and will parse 9 and 10 only
                .reduce((x,y)->x+y);
    }

    public static void main(String[] args) {
        List intList = Arrays.asList(6,7,8,9,10);
        Optional<Integer> limitResult1 = streamLimit(intList);
        System.out.println("-> "+limitResult1.get());
        Optional<Integer> limitResult2 = streamSkip(intList);
        System.out.println("-> "+limitResult2.get());
    }
}
