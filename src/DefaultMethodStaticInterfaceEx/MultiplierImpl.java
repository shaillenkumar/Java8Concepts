package DefaultMethodStaticInterfaceEx;

import java.util.List;

public class MultiplierImpl implements Multiplier {
    @Override
    public int multiply(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1,(x,y)->x*y);
    }
    // the default method from interface Multiplier can be overriden here if needed
    @Override
    public int size(List<Integer> integerList){
        System.out.println("From Class.");
        return integerList.size();
    }
}
