package DefaultMethodStaticInterfaceEx;

import java.util.List;

public interface Multiplier {
    int multiply(List<Integer> integerList);

    // default method can be overidden in impl class
    default int size(List<Integer> integerList){
        System.out.println("From Interface.");
        return integerList.size();
    }

    // static method cannot be overidden in impl class
    static boolean isEmpty(List<Integer> integerList){
       return( integerList==null || integerList.size() == 0);
    }
}
