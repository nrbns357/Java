package kr.hs.dgsw.java.dept2;

public class Cat {
	String name;
	String pattern;
	int age;
	
	public void makeSound() {
		System.out.println("냐옹");
	}
	
	public void eat(String food) {
		System.out.printf("%s가 지금먹고 있는것은 %s이다\n",name,food);
	}
	
	public void catInfo() {
		System.out.printf("이름 : %s\n",name);
		System.out.printf("무늬 : %s\n",pattern);
		System.out.printf("나이 : %d\n",age);
	}
}

