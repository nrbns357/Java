package kr.hs.dgsw.network.class22.d0421;

public class ThreadMain {
	public static void main(String[] args) {
//		Thread1 r1 = new Thread1();
//		
//		Thread t1  = new Thread(r1,"a");
//		Thread t2 = new Thread(r1,"b");
//		
//		
//		t1.start();
//		t2.start();
//		
//		for(int i =0; i<100; i++) {
//			System.out.println("Main Thread: " +i);
//		}
		Thread1 m1 = new Thread1();
		for (int i = 1; i <= 10; i++) {
			Thread t1 = new Thread(m1, "thread" + i);

			if (i == 10) {
				t1.setPriority(Thread.MAX_PRIORITY);
			} else {
				t1.setPriority(Thread.MIN_PRIORITY);
			}

			t1.start();
		}
	}
}
