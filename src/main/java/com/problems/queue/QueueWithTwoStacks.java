package com.problems.queue;

import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * Implement a queue with 2 stacks. Your queue should have an enqueue and a
 * dequeue function and it should be "first in first out" (FIFO). Optimize for
 * the time cost of m function calls on your queue. These can be any mix of
 * enqueue and dequeue calls.
 * 
 * Assume you already have a stack implementation and it gives O(1) time push
 * and pop.
 **/
public class QueueWithTwoStacks<T extends Comparable<T>> implements Queue<T> {
	private Stack<T> forwardStack = new Stack<>();
	private Stack<T> backwardStack = new Stack<>();

	public void enqueue(T element) {

		forwardStack.push(element);
		// if (forwardStack.isEmpty() && !backwardStack.isEmpty()) {
		// while (!backwardStack.isEmpty()) {
		// forwardStack.push(backwardStack.pop());
		// }
		// }
		// forwardStack.push(element);

	}

	public T deQueue() {

		if (backwardStack.isEmpty()) {

			if (forwardStack.isEmpty()) {
				throw new NoSuchElementException("Can't dequeue from empty queue!");
			} else {
				while (!forwardStack.isEmpty()) {
					backwardStack.push(forwardStack.pop());
				}
			}
		}
		return backwardStack.pop();

		// if (backwardStack.isEmpty() && !forwardStack.isEmpty()) {
		// while (!forwardStack.isEmpty()) {
		// backwardStack.push(forwardStack.pop());
		// }
		// }
		// if (!backwardStack.isEmpty()) {
		// return backwardStack.pop();
		// }
		// throw new RuntimeException();

	}

}
