package com.queue.interf;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {

	public static void main(String[] args) {
		Queue<Integer>queue = new LinkedList<Integer>();
		queue.add(6);
		queue.add(14);
		queue.add(20);
		queue.add(40);
		queue.add(45);
		
		
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.removeAll(queue));
		
		
	
	}

}
