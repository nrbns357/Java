package kr.hs.dgsw.java.dept2.d0427;

public abstract class Animal { // 추상 클래스
	
	public abstract String getName();
	public abstract String makeSound();//추상메소드
	
	public void move() {
		System.out.printf("%s이(가) %s 소리를 내며 움직입니다\n",getName(),makeSound());
	}
	public static void main(String[] args) {
		Animal animal = new Dog();//추상 클래스는 object를 만들수 없다
		animal.move();
	}
}
