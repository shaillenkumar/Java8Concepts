package lambdas;
import java.util.Comparator;

public class ComparatorLambda {

	public static void main(String[] args) {
		
		// Comparator Old Method		
		Comparator<Integer> comparator1 = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		System.out.println("Result of comparator legacy: "+comparator1.compare(5, 1));
		
		// Comparator Lambda Method
		Comparator<Integer> comparator2 = (Integer a, Integer b) ->  a.compareTo(b);
		System.out.println("Result of comparator using lambda:  " +comparator2.compare(8,3));
		System.out.println("Result of comparator using lambda:  " +comparator2.compare(8,8));
		System.out.println("Result of comparator using lambda: "+comparator2.compare(3,9));
	}

}
