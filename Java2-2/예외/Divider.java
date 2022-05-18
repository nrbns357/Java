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
			System.out.println("두 정수를 입력하세요");
			// 숫자 대신 문자 넣으면 예외 발생 , 0 으로 나누어도 예외 발생
			// InputMismatchException은 runtimeExceoption을 상속 받음
			// runtimeExceoption들을 상속받는 예외들은 굳이 예외 처리 하지 않아도 된다 UnCheckedException
			// Exception을 상속받는 에외들은 예외 처리를 해야한다 CheckedException
			int value1 = scanner.nextInt();

			int value2 = scanner.nextInt();

			int result = claculate(value1, value2);

			System.out.printf("%d / %d = %d\n", value1, value2, result);

			saveResult(value1, value2, result);

			System.out.println("프로그램을 종료 합니다");

		} catch (InputMismatchException e) {
			System.out.println("문자가 아닌 숫자를 입력하세요");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		} catch (Exception e) {

		} finally { // 예외가 발생 해도 안해도 실행됨
			scanner.close();
		}

		/*
		 * catch(Exception e){ System.out.println("예외가 발생 하였습니다"+e); if(e instanceof
		 * InputMismatchException) { System.out.println("문자가 아닌 숫자를 입력하세요"); }else if(e
		 * instanceof ArithmeticException) { System.out.println("0으로 나눌 수 없습니다"); } }
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
			System.out.println("파일을 저장하지 못했습니다");
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
