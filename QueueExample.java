package colletionprogramms.com;

import java.util.Queue;
import java.util.PriorityQueue;

public class QueueExample {
	public static void main(String[] args) {
		
	 Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println(q.element());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		q.clear();
		System.out.println("Is Queue Empty?"+q.isEmpty());
		System.out.println(q.poll());
	}

}
