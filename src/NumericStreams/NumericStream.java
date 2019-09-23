package NumericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 *  Represents primitive values in Streams
 *      IntStream
 *      LongStream
 *      DoubleStream
 */

public class NumericStream {
    public static int sumOfNumbers(List<Integer> integerList){
        return integerList.stream()
                .reduce(0,(x,y)-> x+y);  // there is effort to Unbox Integer to int.
    }
    // the sumOfNumbers() method can be written as below
    public static int sumOfNNumbers(){
        return IntStream.rangeClosed(1,6) // 1,2,3,4,5,6
                .sum();
    }

    public static void main(String[] args) {
        List intList = Arrays.asList(1,2,3,4,5,6);
        System.out.println("Sum Of Number -> "+sumOfNumbers(intList));
        System.out.println("--------");
        System.out.println("Sum Of Number using IntStream -> "+sumOfNNumbers());
        System.out.println("--------");

    }

}
