package kr.hs.dgsw.java.dept2.d0427;

public class Dog extends Animal{
	
	@Override
	public String makeSound() {
		return "�۸�";
	}
	@Override
	public String getName() {
		return "������";
	}

	public void eat() {
		System.out.println("�ͱ��ͱ� �Խ��ϴ�");
	}
	
public static void main(String[] args) {
	Dog dog = new Dog();
	Animal = dog1 = new Dog();
	dog.move();
} 
//abstract void abcd(); //�߻� �޼ҵ�� �߻�Ŭ�������� ���밡��
}
