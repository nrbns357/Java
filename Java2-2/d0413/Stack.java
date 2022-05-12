package kr.hs.dgsw.java.dept2.d0413;

public class Stack {
	public static final int SIZE = 10;
	private final String[] buffer;
	private int index;

	public Stack() {
		this.buffer = new String[SIZE];
		index = 0;
	}

	public void push(String value) {
		this.buffer[this.index] = value;
		this.index++;
	}

	public String pop() {
		this.index--;
		return this.buffer[this.index];
	}

	public String top() {
			return this.buffer[this.index - 1];
	}

	public int getSize() {
		return this.index;
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("Dog");
		stack.push("Mouse");
		stack.push("Cat");
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.getSize());
		System.out.println(stack.pop());
		System.out.println(stack.top());
		System.out.println(stack.getSize());
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.getSize());
	}
}
