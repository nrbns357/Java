package kr.hs.dgsw.java.dept2.d0420;

public class Animal {

	public void move() {
		System.out.println("움직입니다");
	}
	
	public void eat(String food) {
		System.out.println(food + "를 먹습니다");
	}
	
	public void birth() {
		System.out.println("새끼를 놓습니다");
	}
	
	public static void main(String[] args) {
		Dog happy = new Dog();
		happy.bark();
		happy.birth();
		
		Animal puppy = new Dog();
		puppy.birth();//다형성  birth는 Animal에도 있고 Dog 에도 있어서 사용할수 있고 자식 클래스의 birth로 실행된다
//		puppy.bark();
	}
}
