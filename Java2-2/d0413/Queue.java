package kr.hs.dgsw.java.dept2.d0413;

public class Queue {
	public static final int SIZE = 10;
	private final String[] buffer;
	private int index,start;
	public Queue() {
		this.buffer = new String[SIZE];
		index = 0;
		start = 0;
	}
	public void add(String value) {
		this.buffer[this.index] = value;
		this.index=(this.index+1)%SIZE;
	}
	
	public String poll() { 	
		this.start = (this.start+1)%SIZE;
		return this.buffer[this.start-1];
	}
	
	public int getSize() {
		if (this.index > this.start) {
			return this.index - this.start;
		} else {
			return SIZE - (this.index - this.start);
		}
	}
	
	public boolean isFull() {
		return (this.index == 10);
	}
	
	
	public boolean isEmpty() {
		return (this.index == 0);
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		
//		queue.add("Dog");
//		queue.add("Mouse");
//		queue.add("Dragonfly");
//		queue.add("Dog2");
//		queue.add("Mouse2");
//		queue.add("Dragonfly2");
//		queue.add("Dog3");
//		queue.add("Dog4");
//		queue.add("Mouse3");
//		queue.add("Dragonfly3");
//		
//		System.out.println(queue.getSize());
//		System.out.println(queue.isFull());
//		System.out.println(queue.isEmpty());
//		
//		
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		
//		System.out.println(queue.getSize());
//		System.out.println(queue.isEmpty());
//		
//		queue.add("Mouse4");
//		queue.add("Dragonfly4");
//		queue.add("Dragonfly5");
//		System.out.println(queue.poll());
//
//		queue.add("Mouse5");
//		System.out.println(queue.poll());
//		queue.add("Dragonfly6");
//		queue.add("Dragonfly7");
//		System.out.println(queue.poll());
//		queue.add("Mouse6");
//		queue.add("Dragonfly8");
//		queue.add("Dragonfly9");
//		System.out.println(queue.getSize());
		queue.add("Dog");
		System.out.println(queue.poll());
		queue.add("Dog");
		System.out.println(queue.poll());
		queue.add("Dog");
		System.out.println(queue.poll());
		queue.add("Dog");
		System.out.println(queue.poll());
		queue.add("Dog");
		System.out.println(queue.poll());
		queue.add("Dog");
		System.out.println(queue.poll());
		queue.add("Dog");
		System.out.println(queue.poll());
		queue.add("Dog");
		System.out.println(queue.poll());
		queue.add("Dog");
		System.out.println(queue.poll());
		queue.add("Dog");
		System.out.println(queue.poll());
		queue.add("Dog");
		System.out.println(queue.poll());
		queue.add("Dog");
		System.out.println(queue.poll());
		queue.add("Dog");
		System.out.println(queue.poll());
		queue.add("Dog");
		System.out.println(queue.poll());
		queue.add("Dog");
		System.out.println(queue.poll());
		queue.add("Dog");
		System.out.println(queue.poll());
		queue.add("Dog");
		System.out.println(queue.poll());
		queue.add("Dog");
		System.out.println(queue.poll());
		queue.add("Dog");
		System.out.println(queue.poll());
		queue.add("Dog");
		System.out.println(queue.poll());
		queue.add("Dog");
		System.out.println(queue.poll());
		queue.add("Dog");
		System.out.println(queue.poll());
		queue.add("Dog");
		System.out.println(queue.poll());
		
	}
}