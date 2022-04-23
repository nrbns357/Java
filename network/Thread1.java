package kr.hs.dgsw.network.class22;

public class Thread1 implements Runnable {
	//작업구현
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.printf("t1 Thread: %d \n",i);
		}
	}
}
