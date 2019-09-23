package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxReduce {

    public static int getMaxInteger(List<Integer> intList){
       return intList.stream()
                .reduce(0, (a,b) -> (a>b)?a:b );
    }
    public static int getMinInteger(List<Integer> intList){
        return intList.stream()
                .reduce(0, (a,b) -> (a<b)?a:b );
    }
    public static Optional<Integer> getMinIntegerwithoutIdentity(List<Integer> intList){
        return intList.stream()
                .reduce((a,b) -> (a<b)?a:b );
    }

    public static void main(String[] args) {
        List intList = Arrays.asList(10,3,11,15,5,17,8);

        System.out.println("Min ->"+getMinInteger(intList));

        Optional<Integer> integerOptionalList = getMinIntegerwithoutIdentity(intList);
        if(integerOptionalList.isPresent()){
            System.out.println("Min w/o identity ->"+integerOptionalList.get());
        }

        System.out.println("Max ->"+getMaxInteger(intList));
    }
}
