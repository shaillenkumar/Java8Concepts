package NumericStreams;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxUnbox {
    /**
     * Boxing is converting primitive type to wrapper types int -> Integer
     * Unboxing is the reverse converting Integer to int
     */

    public static List<Integer> boxing(){
        return IntStream.range(1,20)
                .boxed()
                .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> integerList){
        return integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
    public static void main(String[] args) {
        List integerList = boxing();
        int sum = unBoxing(integerList);
        System.out.println("Integer List -> "+integerList);
        System.out.println("sum -> "+sum);
    }
}
