package kr.hs.dgsw.java.dept2.d0427;

public abstract class Animal { // �߻� Ŭ����
	
	public abstract String getName();
	public abstract String makeSound();//�߻�޼ҵ�
	
	public void move() {
		System.out.printf("%s��(��) %s �Ҹ��� ���� �����Դϴ�\n",getName(),makeSound());
	}
	public static void main(String[] args) {
		Animal animal = new Dog();//�߻� Ŭ������ object�� ����� ����
		animal.move();
	}
}
