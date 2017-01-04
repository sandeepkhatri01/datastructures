package com.problems.queue;

public interface Queue<T extends Comparable<T>> {

	void enqueue(T element);

	T deQueue();
}
