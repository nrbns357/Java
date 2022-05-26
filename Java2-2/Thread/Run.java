package kr.hs.dgsw.java.dept2.d0525;

public class Run extends Thread {

	private final double speed;

	public Run(double speed) {
		this.speed = speed;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			System.out.println(getName() + ":" + i * speed);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Run t1 = new Run(100 / 9.58);
		t1.setName("우사인볼트");

		Run t2 = new Run(100 / 10.07);
		t2.setName("이국종");

		Run t3 = new Run(100 / 12);
		t3.setName("빠른");

		Run t4 = new Run(100 / 14);
		t4.setName("느린");

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
