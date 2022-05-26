package kr.hs.dgsw.java.dept2.d0525;

public class Playground {
public void work(job job, int hours) {
	for(int i=0; i<hours;i++) {
		job.work();
	}
	System.out.println("±Þ·á : "+(hours*job.getPrice()) );
}
public static void main(String[] args) {
	Playground ground = new Playground();
	job bts = new Bts();
	job student = new Student();
	job developer = new Developer();
	
	ground.work(student,10);
	ground.work(developer,8);
	ground.work(bts,2);
}
}
