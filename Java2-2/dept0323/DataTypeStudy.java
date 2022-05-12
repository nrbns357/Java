package kr.sh.dgsw.java.dept0323;

public class DataTypeStudy {
	public void studyInteger() {
		byte byteValue = -128;
		short shortValue = 32767;
		int intValue = 2147483647; // ���� 21��
		long longValue = 10000000000L;// ����� �� ������ ��� ? ��Ʈ�� ǥ�����ϴ� ����̶�� ���ڸ� �־
	}

	public void studyReal() {
		float floatValue = 123453.1415926123456789F;
		double doubleValue = 123453.14159261234567890;
		System.out.println(floatValue);
		System.out.println(doubleValue);
	}

	public void studyBoolean() {
		boolean b1 = (4 > 2);
		boolean b2 = (3 == 2);
		System.out.println(b1);
		System.out.println(b2);

		if (4 > 2) {
			System.out.println("OK");
		}
	}

	public void studyChar() {
		char ch1 = 'a';
		char ch2 = 'a' + 1;
		int ch3 = 65;
		char ch4 = '��';
		char ch5 = '��';
		System.out.println((int) ch1);
		System.out.println(ch2);
		System.out.println((char) ch3);
		System.out.println((int) (ch4));
		System.out.println((int) ch5);
	}

	public void studyAsc() {
		for (int i = 0; i <= 256; i++) {
			System.out.printf("%d = %c\n", i, i);
		}
	}

	public void knum() {
		int n = '�R' - '��';
		System.out.println(n);

		for (char ch = '��'; ch < '��'; ch++) {
			System.out.printf("%d %c\n" + "", (int) ch, ch);
		}
	}

	public static void main(String[] args) {
		DataTypeStudy study = new DataTypeStudy();
		study.knum();
	}
}