package kr.hs.dgsw.java.dept2.d0518;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Divider {
	private final Scanner scanner;

	public Divider() {
		this.scanner = new Scanner(System.in);
	}

	private int claculate(int value1, int value2) {
		return value1 / value2;
	}

	private void excute() {

		try {
			System.out.println("�� ������ �Է��ϼ���");
			// ���� ��� ���� ������ ���� �߻� , 0 ���� ����� ���� �߻�
			// InputMismatchException�� runtimeExceoption�� ��� ����
			// runtimeExceoption���� ��ӹ޴� ���ܵ��� ���� ���� ó�� ���� �ʾƵ� �ȴ� UnCheckedException
			// Exception�� ��ӹ޴� ���ܵ��� ���� ó���� �ؾ��Ѵ� CheckedException
			int value1 = scanner.nextInt();

			int value2 = scanner.nextInt();

			int result = claculate(value1, value2);

			System.out.printf("%d / %d = %d\n", value1, value2, result);

			saveResult(value1, value2, result);

			System.out.println("���α׷��� ���� �մϴ�");

		} catch (InputMismatchException e) {
			System.out.println("���ڰ� �ƴ� ���ڸ� �Է��ϼ���");
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�");
		} catch (Exception e) {

		} finally { // ���ܰ� �߻� �ص� ���ص� �����
			scanner.close();
		}

		/*
		 * catch(Exception e){ System.out.println("���ܰ� �߻� �Ͽ����ϴ�"+e); if(e instanceof
		 * InputMismatchException) { System.out.println("���ڰ� �ƴ� ���ڸ� �Է��ϼ���"); }else if(e
		 * instanceof ArithmeticException) { System.out.println("0���� ���� �� �����ϴ�"); } }
		 */

	}

//	private void saveResult(int value1, int value2, int result) {
//		try {
//			File file = new File("D:/sample/s.txt");
//			FileWriter fw = new FileWriter(file);
//			BufferedWriter bw = new BufferedWriter(fw);
//			String msg = value1 +"/"+ value2 +"="+ result;
//			bw.write(msg);
//			bw.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

	private static final String FILE_PATH = "D:/sample/s.txt";

	private void saveResult(int value1, int value2, int result) {
		String str = String.format("%d / %d = %d\n", value1, value2, result);
		OutputStream os = null;
		try {
			File file = new File(FILE_PATH);
			os = new FileOutputStream(file);
			os.write(str.getBytes());
			os.close();
		} catch (IOException e) {
			System.out.println("������ �������� ���߽��ϴ�");
		} finally {
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		new Divider().excute();
	}
}
