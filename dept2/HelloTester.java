package kr.hs.dgsw.java.dept2;

public class HelloTester {
	
	public static void main(String[] args) { //메인함수의 기본적인 형태
		Hello object = new Hello(); // Hello 클래스를 object라는 객체로 만들고
		object.sayHello();// Hello 클래스 안에 있는 sayHello를 실행
		object.sayHello("배진영");
	}
}
