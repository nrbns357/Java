package kr.hs.dgsw.java.dept2;

public class CatTester {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		cat1.name = "�����";
		cat1.pattern = "�ٹ���";
		cat1.age = 1;
		
		cat2.name = "��ũ";
		cat2.pattern="���� ����";
		cat2.age = 2;
		
		cat1.makeSound();
		cat1.eat("������");
		cat1.catInfo();
		
		cat2.eat("����");
		cat2.catInfo();
	}
}
