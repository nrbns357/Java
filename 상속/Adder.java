package kr.hs.dgsw.java.dept2.d0420;

import java.util.Scanner;

public class Adder {
	protected final Scanner scanner;
	
	public Adder() {
		this.scanner = new Scanner(System.in);
	}
	
	
	public void execute() {
		//1.�� ������ �Է� �޴´�
		Values values = this.inputValues();
		//2.����� �����Ѵ�
		int result = this.calculate(values);
		//3.����� ����Ѵ�
		this.showResult(values,result);
		//4.���� �ڿ��� �����Ѵ�
		this.scanner.close();
	}
	
	public String getOperator() {
		return "+";
	}
	public Values inputValues() {
		System.out.println("�� ������ �Է��ϼ���");
		Values values = new Values();
		values.setValue1(this.scanner.nextInt());
		values.setValue2(this.scanner.nextInt());
		return values;
	}


	public void showResult(Values values, int result) {
		System.out.printf("%d %s %d = %d",values.getValue1(),getOperator(),values.getValue2(),result);
		
	}


	public int calculate(Values values) {
		return values.getValue1() + values.getValue2();
	}

	public static void main(String[] args) {
		Adder adder = new Adder();
		adder.execute();
	}


	public class Values{//���� Ŭ����
		private int value1;
		private int value2;
		
		public int getValue1() {
			return value1;
		}
		public void setValue1(int value1) {
			this.value1 = value1;
		}
		public int getValue2() {
			return value2;
		}
		public void setValue2(int value2) {
			this.value2 = value2;
		}
		
		
	}
	
	
}

