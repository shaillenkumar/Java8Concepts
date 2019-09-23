package FactoryMethod;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/***
 *  iterate() and generate() used to create infinite stream
 *  we will use limit(10)
 *  Stream.of creates Stream of
 */
public class StreamOfGeneratorIterator {

    public static void main(String[] args) {
        Stream<String> strStream = Stream.of("adam","eve","dan","julie");
        strStream.forEach(System.out::println);
        System.out.println("--------");
        Stream.iterate(1, x->x*2)
                .limit(10)
                .forEach(System.out::println);
        System.out.println("--------");
        Supplier<Integer> intSupplier = new Random()::nextInt;
        Stream.generate(intSupplier)
                .limit(10)
                .forEach(System.out::println);

    }

}
