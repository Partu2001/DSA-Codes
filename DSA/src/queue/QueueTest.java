package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		
		Queue<Integer> q=new LinkedList<Integer>();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.offer(50);
		
		System.out.println(q);
		
		System.out.println("Head : " + q.peek());
		
		System.out.println("Remove :" +q.poll());
		
		System.out.println(q);
		
		System.out.println("Queue is Empty or Not:" +q.isEmpty());

		System.out.println("Size : " +q.size());
	}

}
