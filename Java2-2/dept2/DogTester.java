package kr.hs.dgsw.java.dept2;

public class DogTester {
	public static void main(String[] args) {
		Dog jindo = new Dog();
		Dog chichu = new Dog();
		
		jindo.name = "�����";
		jindo.color ="�����";
		jindo.age = 3;
		
		chichu.name = "�˵���";
		chichu.color = "��ȫ��";
		chichu.age = 7;
		
		jindo.makeSound();
		jindo.eat("����");
		jindo.printInformation();
		
		chichu.makeSound();
		chichu.eat("���");
		chichu.printInformation();
	}
}
