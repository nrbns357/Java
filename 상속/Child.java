package kr.hs.dgsw.java.dept2.d0420;
//����� ���� ����
//����� ����ϸ� ��Ȱ�뼺�� ����,�����ϰ� ���α׷� Ȯ�� ����,����� ��� ����
public class Child extends Parent{ //extends Parent : Parent�� �θ�Ŭ������ ����

		protected int age;
		
		public static void main(String[] args) {
			Child child = new Child();
			child.age = 18;
			//����� ������ �θ�Ŭ������ �޼ҵ���� ��밡��
			child.name = "����"; //����� �޾ұ� ������ ��밡��
			child.sayHello();
			
			Parent parent = new Parent();
			parent.age = 45; //�θ�� �ڽ� Ŭ������ �޼ҵ带 ������� ����
		}
}
