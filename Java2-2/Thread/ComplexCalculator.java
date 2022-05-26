package kr.hs.dgsw.java.dept2.d0525;

import java.util.Scanner;

public class ComplexCalculator {
	private final Scanner scanner;

	public ComplexCalculator() {
		this.scanner = new Scanner(System.in);
	}

	public void execute() {
		while (true) {
			System.out.println("�� ������ �Է��ϼ���");
			int value1 = scanner.nextInt();
			int value2 = scanner.nextInt();

			if (value1 == 0 && value2 == 00)
				break;

			calculateAndPrint(value1, value2);
		}
	}

	public void calculateAndPrint(int value1, int value2) {
		CalculaterThread calculateThread = new CalculaterThread(value1,value2);
		new Thread(calculateThread).start();
	}
	
	public static class CalculaterThread implements Runnable{
		private final int value1;
		private final int value2;
		
		public CalculaterThread(int value1,int value2) {
			this.value1 = value1;
			this.value2 = value2;
		}
		
		@Override
		public void run() {
			try {
				Thread.sleep(15*1000);
			} catch (Exception e) {}
			
		}
	}
	
	public static void main(String[] args) {
		ComplexCalculator complexCalculator = new ComplexCalculator();
		complexCalculator.execute();
	}
}
