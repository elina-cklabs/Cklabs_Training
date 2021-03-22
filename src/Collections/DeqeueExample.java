package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeqeueExample {

	public static void main(String[] args) {
		//For Deque
		Deque<String> dequeCustomers = new ArrayDeque<>();
		 
		dequeCustomers.add("Bill");
		dequeCustomers.add("Kim");
		dequeCustomers.add("Lee");

		System.out.println("Queue before: " + dequeCustomers);
		System.out.println("First comes: " + dequeCustomers.removeFirst());
		System.out.println("Last comes: " + dequeCustomers.removeLast());
		System.out.println("Queue after: " + dequeCustomers);
		
		Deque<Integer> dequeNumbers = new ArrayDeque<>();

		dequeNumbers.add(10);
		dequeNumbers.add(20);
		dequeNumbers.add(30);
		dequeNumbers.add(40);

		System.out.println("first: " + dequeNumbers.peekFirst());
		System.out.println("last: " + dequeNumbers.peekLast());

	}

}
