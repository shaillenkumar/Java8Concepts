package StreamsEx;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsVsCollection {

	public static void main(String args[]) {
		ArrayList<String> names = new ArrayList();
		
		/**
		 * 1. Collection - You can modify - add or remove elements from Collection.
		 * 	  Streams - You can modify elements in a stream it is fixed data.
		 */
		names.add("adam");names.add("jim");names.add("jenni");
		names.add("mary");names.add("kate");names.add("jon");
		names.remove(1);
		
		/**
		 * 2. Elements in Stream can be accessed in sequence.
		 *    Elements in collection can be acceded in any order based on the collection and method used
		*/
		names.get(2);
		/**
		 * 3. Collection are eagerly created
		 *    Streams are lazily created -> created only at terminal operation
		 */
		
		/**
		 * 4. Streams can be traversed only once
		 *   Collections can be traversed n-times
		 */
		for(String name: names ) {
			System.out.println(name);
		}
		for(String name: names ) {
			System.out.println(name);
		}
		
		Stream<String> nameStream =names.stream();
		nameStream.forEach(System.out::println);
		// You would get Streams  has already been operated upon or closed
		nameStream.forEach(System.out::println);
				
		/**
		 * 5. Collection performs External Iteration
		 * Streams performs Internal Iteration through the elements
		 */
		
		
		
		
		
	}
}
