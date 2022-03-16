package kr.hs.dgsw.java.dept2;

public class CatTester {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		cat1.name = "브라우니";
		cat1.pattern = "줄무늬";
		cat1.age = 1;
		
		cat2.name = "밀크";
		cat2.pattern="무늬 없음";
		cat2.age = 2;
		
		cat1.makeSound();
		cat1.eat("통조림");
		cat1.catInfo();
		
		cat2.eat("생선");
		cat2.catInfo();
	}
}
