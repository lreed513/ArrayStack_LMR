

package jsjf;

import util.java.Arrays;

/**
 * @author leaia
 *
 */
public class ArrayStack<T> implements StackADT<T>{
	
	private final static int DEFAULT_CAPACITY = 100;
	private T[] stack;
	private int top;
	
	public ArrayStack() {
		this(DEFAULT_CAPACITY);
	}
	

}
