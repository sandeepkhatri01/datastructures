package com.problems.stack;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.BeforeClass;
import org.junit.Test;

public class MaxStackTest {

	private static MaxStack maxStack;

	@BeforeClass
	public static void init() {
		maxStack = new MaxStack();
	}

	@Test(expected = NoSuchElementException.class)
	public void shouldThrowErrorOnPollOnEmptyStack() {
		maxStack.poll();
	}
	
	@Test
	public void shouldReturnMaxElement(){
		maxStack.push(new Integer(10));
		assertEquals(new Integer(10), maxStack.getMax());
		
		maxStack.push(new Integer(11));
		assertEquals(new Integer(11), maxStack.getMax());
		
		maxStack.push(new Integer(12));
		maxStack.push(new Integer(8));
		assertEquals(new Integer(12), maxStack.getMax());
		
		maxStack.poll();
		assertEquals(new Integer(12), maxStack.getMax());
		
		maxStack.poll();
		assertEquals(new Integer(11), maxStack.getMax());
		
	}

}
