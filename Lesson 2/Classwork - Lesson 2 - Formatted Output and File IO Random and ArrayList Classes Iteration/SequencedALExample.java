import java.util.SequencedCollection;
import java.util.ArrayList;
public class SequencedALExample
{
	public static void main(String [] args)
	{
		SequencedCollection<Integer> myAl = new ArrayList<>();
		 
		myAl.add(10);          // Adds 10 to the list.
		myAl.add(70);          // Adds 70 to the list.
		myAl.add(100);          // Adds 100 to the list.
		myAl.addFirst(0);      // Adds 0 to the beginning of the list.
		myAl.addLast(20);      // Adds 20 to the end of the list.
		System.out.printf("Original List: %s\n", myAl);        // Output: list: [0, 10, 70, 100, 20]]
		System.out.printf("First element: %d\n", myAl.getFirst());         // Output: 0
		System.out.printf("Last element: %d\n", myAl.getLast());          // Output: 20
		System.out.printf("Reversed List: %s\n", myAl.reversed());        // Output: [20, 100, 70, 10, 0]
		System.out.printf("Original List: %s\n", myAl);        // Output: list: [0, 10, 70, 100, 20]]
		System.out.printf("First element: %d\n", myAl.removeFirst());         // Output: 0
		System.out.printf("Last element: %d\n", myAl.removeLast());          // Output: 20
		System.out.printf("Reversed List: %s\n", myAl.reversed());        // Output: [100, 70, 10]
	}
}