package NumericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapEx {
    /**
     * mapToLong()
     * mapToObj()
     * mapToInt()
     */
    public static List<Integer> maptToObj(){
        return IntStream.rangeClosed(1,20)
                .mapToObj((i)->  new Integer(i))  // this converts int to Integer object could be any function impl to covert to any object
                .collect(Collectors.toList());
    }

    public static long mapToLong(){
        return IntStream.rangeClosed(1,20)
                .mapToLong((i)->i)
                .sum();
    }

    public static double mapToDouble(){
        return IntStream.rangeClosed(1,20)
                .mapToDouble((i)->i)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(maptToObj());
        System.out.println(mapToLong());
        System.out.println(mapToDouble());
    }
}
