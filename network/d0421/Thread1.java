package kr.hs.dgsw.network.class22.d0421;

public class Thread1 implements Runnable {
//	public void run() {
//		for (int i = 0; i < 5000; i++) {
//		}
//		System.out.println(Thread.currentThread().getName() + "종료");
//	}
	
	public int i=0;
	public void run() {
		//임계구역 전 공동작업 공간
		while(i<500) {
			show();
		}
	}
	
	public synchronized void show() {
//		for(int j =0; j<2000; j++){
//		}
			System.out.println((Thread.currentThread()).getName() + " i = "+i);
			System.out.println();
			i++;
	}
}
