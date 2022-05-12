package kr.hs.dgsw.java.dept2.d0427;

public class Dog extends Animal{
	
	@Override
	public String makeSound() {
		return "멍멍";
	}
	@Override
	public String getName() {
		return "강아지";
	}

	public void eat() {
		System.out.println("와구와구 먹습니다");
	}
	
public static void main(String[] args) {
	Dog dog = new Dog();
	Animal = dog1 = new Dog();
	dog.move();
} 
//abstract void abcd(); //추상 메소드는 추상클래스에만 적용가능
}
