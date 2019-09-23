package DefaultMethodStaticInterfaceEx;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jane","David","Bill","Adam","Jenny","Anne");
        /*
        Collections.sort(names);
        System.out.println("Sorted using Collection.sort() "+names);
         */
        // Exploring Default Methods in list Interface.
        names.sort(Comparator.naturalOrder());
        System.out.println("Sorted using List Interfaces sort() "+names);

        names.sort(Comparator.reverseOrder());
        System.out.println("Sorted using Collection.sort() "+names);
    }
}
