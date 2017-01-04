package com.problems.stack;

import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * You want to be able to access the largest element in a stack. Use the
 * built-in Stack class to implement a new class MaxStack with a function
 * getMax() that returns the largest element in the stack. getMax() should not
 * remove the item.
 * 
 * Your stacks will contain only integers.
 **/
public class MaxStack {

	private Stack<Integer> stack = new Stack<>();
	private Stack<Integer> maxStack = new Stack<>();

	public Integer getMax() {
		return maxStack.peek();
	}

	public void push(Integer item) {
		stack.push(item);

		if (maxStack.empty()) {
			maxStack.push(item);
		} else {
			Integer topElement = maxStack.peek();
			if (topElement.compareTo(item) > 0) {
				maxStack.push(topElement);
			} else {
				maxStack.push(item);
			}
		}

	}

	public Integer poll() {
		if (!maxStack.isEmpty() && !stack.isEmpty()) {
			maxStack.pop();
			return stack.pop();
		}
		throw new NoSuchElementException("Can't dequeue from empty stack!");
	}

}
