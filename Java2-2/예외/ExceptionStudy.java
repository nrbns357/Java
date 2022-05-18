package kr.hs.dgsw.java.dept2.d0518;

import java.util.Scanner;

public class ExceptionStudy {
	public void method1() throws MyException {// 자신이 직접 예외 처리를 하지 않고 method1을 호출하는 곳에 예외를 던져줌
		System.out.println("metod1 호출됨");
		if ((System.currentTimeMillis() % 2) == 1) {
			MyException e = new MyException();
			throw e;
		}
	}

	public void method2() throws MyRuntimeException {
		System.out.println("metod1 호출됨");
		if ((System.currentTimeMillis() % 2) == 1) {
			MyRuntimeException e = new MyRuntimeException();
			throw e;
		}
	}
	
	public static void main(String[] args) {
		try {
			ExceptionStudy study = new ExceptionStudy();
//			study.method1();
			System.out.println("시작");
			Scanner scanner= new Scanner(System.in);
			int a= scanner.nextInt();
		} catch (Exception e) {
			e.printStackTrace();//예외가 발생된 함수가 
		}
	}
}
