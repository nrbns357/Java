package kr.hs.dgsw.java.dept2.d0420;
//상속을 쓰는 이유
//상속을 사용하면 재활용성이 좋다,안전하게 프로그램 확장 가능,공통된 기능 공유
public class Child extends Parent{ //extends Parent : Parent를 부모클래스로 설정

		protected int age;
		
		public static void main(String[] args) {
			Child child = new Child();
			child.age = 18;
			//상속을 받으면 부모클래스의 메소드들을 사용가능
			child.name = "영희"; //상속을 받았기 때문에 사용가능
			child.sayHello();
			
			Parent parent = new Parent();
			parent.age = 45; //부모는 자식 클래스의 메소드를 사용하지 못함
		}
}
