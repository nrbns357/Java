package kr.hs.dgsw.network.class22;

public class Thread2 extends Thread {
	//작업구현
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.printf("t2 Thread: %d \n",i);
		}
	}
}
