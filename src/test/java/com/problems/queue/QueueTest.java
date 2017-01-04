package com.problems.queue;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class QueueTest {

	private static Queue<Integer> queue;

	@BeforeClass
	public static void setUp() {
		queue = new QueueWithTwoStacks<>();
	}

	@Test()
	public void shouldEnqueue() {
		queue.enqueue(new Integer(1));
		assertEquals(new Integer(1), queue.deQueue());
		
		queue.enqueue(new Integer(1));
		queue.enqueue(new Integer(2));
		queue.enqueue(new Integer(3));
		
		assertEquals(new Integer(1), queue.deQueue());
		assertEquals(new Integer(2), queue.deQueue());
		assertEquals(new Integer(3), queue.deQueue());
		
		//queue.deQueue();
		
		queue.enqueue(new Integer(1));
		queue.enqueue(new Integer(2));
		queue.enqueue(new Integer(3));
		queue.enqueue(new Integer(4));
		
		queue.deQueue();
		queue.deQueue();
		
		queue.enqueue(new Integer(5));
		queue.enqueue(new Integer(6));
		
		assertEquals(new Integer(3), queue.deQueue());
		assertEquals(new Integer(4), queue.deQueue());
		assertEquals(new Integer(5), queue.deQueue());
		assertEquals(new Integer(6), queue.deQueue());
		
	}

}
