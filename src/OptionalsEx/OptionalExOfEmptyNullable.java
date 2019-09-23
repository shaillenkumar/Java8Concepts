package OptionalsEx;

import java.util.Optional;

public class OptionalExOfEmptyNullable {
    public static Optional<String> ofNullableTest(){
        Optional<String> name = Optional.ofNullable("Ram");
        Optional<String> nameNull = Optional.ofNullable(null); // will return Optional.empty and will not result in exception.
        return name;
    }
    public static Optional<String> ofTest(){
        Optional<String> name = Optional.of("Ram");
        Optional<String> nameNull = Optional.of(null); // will result in NullPointer Exception Unlike Optional.ofNullable(null)
        return name;
    }
    public static Optional<String> isEmptyTest(){
        return Optional.empty();  // This can be used in exception block instead of returning null
    }

    public static void main(String[] args) {
        String nameOfNullable = (ofNullableTest()).get();  // ofNullableTest() returns Optional<String> use get() to retrieve the String.
        String nameOfNull = ofTest().get();// will return String similar to the ofNullable("Hello").get()
        System.out.println(isEmptyTest());
    }
}
