package kr.hs.dgsw.java.dept2;

public class Dog {
	String name;
	
	String color;
	
	int age;

	public void makeSound() {
		System.out.println("�۸�");
	}
	
	public void eat(String food) {
	 System.out.printf("%s��(��) %s��(��)�Դ´�\n",name,food);	
	}
	
	public void printInformation() {
		System.out.printf("�̸� : %s\n",name);
		System.out.printf("���� : %s\n",color);
		System.out.printf("���� : %d\n",age);
	}
}
