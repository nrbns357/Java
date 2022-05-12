package kr.sh.dgsw.java.dept0323;

import java.util.Scanner;

public class ScannerStudy {
	private Scanner scanner;

	public void prepareScanner() {
		this.scanner = new Scanner(System.in);
	}

	public void closeScanner() {
		this.scanner.close();
	}

	public void execute() {
		while (true) {
			System.out.println("���ڿ��� �Է��ϼ���");
			String str = scanner.next();
			
			if("quit".equals(str)) {
				break;
			}
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		ScannerStudy scannerStudy = new ScannerStudy();
		scannerStudy.prepareScanner();

		scannerStudy.execute();

		scannerStudy.closeScanner();
	}
}
