package kr.hs.dgsw.java.dept2;

public class Cat {
	String name;
	String pattern;
	int age;
	
	public void makeSound() {
		System.out.println("�Ŀ�");
	}
	
	public void eat(String food) {
		System.out.printf("%s�� ���ݸ԰� �ִ°��� %s�̴�\n",name,food);
	}
	
	public void catInfo() {
		System.out.printf("�̸� : %s\n",name);
		System.out.printf("���� : %s\n",pattern);
		System.out.printf("���� : %d\n",age);
	}
}

