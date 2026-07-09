package queue;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(50);
		
		System.out.println(pq);
		
		System.out.println("Removed :" +pq.poll());
		System.out.println("Removed :" +pq.poll());
		
		System.out.println(pq);
		
		
		
		
		

	}

}
