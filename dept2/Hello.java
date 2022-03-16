package kr.hs.dgsw.java.dept2;

public class Hello {
	public void sayHello() { //void = 이 함수의 리턴값이 없다 sayHello = 함수이름 ()안에는 파라미터(매개변수,인자)가 들어간다
		//System.out.println("Hello World!");//println("Hello World"); Hello World 출력 ln을빼면 줄바꿈 되지 않음
		//System.out 은 표준출력장치로 출력한다는 것이다
		sayHello("World");
	}
	
	public void sayHello(String name) { //자바에서는 함수이름을 중복시킬수 있다 하지만 매개변수 없이 sayHello() 로 하면 오류가 발생
		//매개변수가 있다면 함수를 호출할때 매개변수가 있는 것 없는것으로 구별할수 있기 때문에 이름을 중복사용 할 수 있다
		//System.out.println("Hello" + name + "!" );
		System.out.printf("Hello %s!\n",name); 
	}
}

