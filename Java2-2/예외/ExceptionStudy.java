package kr.hs.dgsw.java.dept2.d0518;

import java.util.Scanner;

public class ExceptionStudy {
	public void method1() throws MyException {// �ڽ��� ���� ���� ó���� ���� �ʰ� method1�� ȣ���ϴ� ���� ���ܸ� ������
		System.out.println("metod1 ȣ���");
		if ((System.currentTimeMillis() % 2) == 1) {
			MyException e = new MyException();
			throw e;
		}
	}

	public void method2() throws MyRuntimeException {
		System.out.println("metod1 ȣ���");
		if ((System.currentTimeMillis() % 2) == 1) {
			MyRuntimeException e = new MyRuntimeException();
			throw e;
		}
	}
	
	public static void main(String[] args) {
		try {
			ExceptionStudy study = new ExceptionStudy();
//			study.method1();
			System.out.println("����");
			Scanner scanner= new Scanner(System.in);
			int a= scanner.nextInt();
		} catch (Exception e) {
			e.printStackTrace();//���ܰ� �߻��� �Լ��� 
		}
	}
}
