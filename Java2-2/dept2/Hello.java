package kr.hs.dgsw.java.dept2;

public class Hello {
	public void sayHello() { //void = �� �Լ��� ���ϰ��� ���� sayHello = �Լ��̸� ()�ȿ��� �Ķ����(�Ű�����,����)�� ����
		//System.out.println("Hello World!");//println("Hello World"); Hello World ��� ln������ �ٹٲ� ���� ����
		//System.out �� ǥ�������ġ�� ����Ѵٴ� ���̴�
		sayHello("World");
	}
	
	public void sayHello(String name) { //�ڹٿ����� �Լ��̸��� �ߺ���ų�� �ִ� ������ �Ű����� ���� sayHello() �� �ϸ� ������ �߻�
		//�Ű������� �ִٸ� �Լ��� ȣ���Ҷ� �Ű������� �ִ� �� ���°����� �����Ҽ� �ֱ� ������ �̸��� �ߺ���� �� �� �ִ�
		//System.out.println("Hello" + name + "!" );
		System.out.printf("Hello %s!\n",name); 
	}
}

