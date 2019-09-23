package MethodReference;

import java.util.function.Function;

public class FunctionMethodReference {

    public static Function<String, String> toUpperCaseLambda = (s) -> s.toUpperCase();
    public static Function<String, String> toLambdaMethodReference = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("java"));
        System.out.println(toLambdaMethodReference.apply("java"));
    }
}
