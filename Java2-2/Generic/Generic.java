package kr.hs.dgsw.java.dept2.d0615;

public class Generic<T, MyType> {

	private T value;
	
	private MyType type;
	
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public MyType getType() {
		return type;
	}
	
	public void setType(MyType type) {
		this.type = type;
	}
	
	public static void main(String[] args) {
		Generic<String> generic = new Generic<String>();
		generic.setValue("Hello");
		String name = generic.getValue();
		
		Generic<Integer> generic1 = new Generic<Integer>();
		generic1.setValue(4);
		int value = generic1.getValue();
		
		
	}
	
}