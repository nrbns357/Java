package kr.hs.dgsw.java.dept2.d0525;

public class Developer implements job{
	@Override
	public void work() {
		System.out.println("개발자 열심히 개발을 합니다");
	}
	
	@Override
	public int getPrice() {
		return 1240000000;
	}
}
