package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		//For Queue
		Queue<String> queueCustomers = new LinkedList<>();
		queueCustomers.add("Jack");
		 
		String next = queueCustomers.remove();
		System.out.println("Next customer is: " + next);
		System.out.println(queueCustomers);

		
		queueCustomers.add("John");
		System.out.println("who's next: " + queueCustomers.peek());
		System.out.println(queueCustomers);
	}

}
