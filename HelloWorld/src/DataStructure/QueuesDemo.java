package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesDemo
{
	public static void main(String[] args) 
	{
		//Queues are FIFO -> First IN First Out
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("Karen");
		queue.offer("Somesh");
		queue.offer("Kailasha");
		queue.offer("Sicessor");
		queue.offer("Brazzer");
		System.out.println(queue.peek());
		queue.poll();
		queue.poll();
//		System.out.println(queue.element());
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		System.out.println(queue.contains("Sicessor"));
		System.out.println(queue.contains("Hello"));
		
		System.out.println(queue);
	}

}
