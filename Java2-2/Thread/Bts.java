package kr.hs.dgsw.java.dept2.d0525;

public class Bts implements job{
	@Override
	public void work() {
		System.out.println("bts 열심히 공연을 합니다");
	}
	
	@Override
	public int getPrice() {
		return 100000000;
	}
}
