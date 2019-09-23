package DefaultMethodStaticInterfaceEx;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5);
        Multiplier multiplier = new MultiplierImpl();
        System.out.println(multiplier.multiply(intList));
        boolean isEmpty = Multiplier.isEmpty(intList); // Interface static should be reffered in static way.
        System.out.println(isEmpty);

    }
}
