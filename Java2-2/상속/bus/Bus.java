

package kr.hs.dgsw.java.dept2.d0420.bus;

public class Bus {

	protected int income;

	protected int countOfAdults;
	
	protected int countOfStudents;
	
	public Bus() {
		this.income = 0;
		countOfAdults = 0;
		countOfStudents = 0;
	}
	
	public static void main(String[] args) {
		Bus bus = new Bus();
		
		Card adult1 = new CardForAdult();	
		adult1.charge(2000);
		
		Card adult2 = new CardForAdult();
		adult2.charge(5000);
		
		Card student1 = new CardForStudent();
		student1.charge(3000);

		Card student2 = new CardForStudent();
		student1.charge(500);

		bus.payment(adult1);
		bus.payment(student1);
		bus.payment(student2);
		bus.payment(adult2);
		
		bus.payment(adult1);
		bus.payment(adult2);
		bus.payment(student1);
		
		System.out.println("오늘의 수입 : " + bus.getIncome());
		System.out.println("성인 손님 수 : " + bus.getCountOfAdults());
		System.out.println("학생 손님 수 : " + bus.getCountOfStudents());
	}
	
	public void payment(Card card) {
		if (card.canPayment()) {
			income += card.requestPayment();
			
			if (card.getType().equals("학생")) {
				this.countOfStudents++;
			} else {
				this.countOfAdults++;
			}
			
			System.out.println(card.getType() + "입니다. 어서 오세요");
		} else {
			System.out.println("잔액이 부족합니다. 당장 내리세요.");
		}
	}
	
	public int getCountOfAdults() {
		return countOfAdults;
	}
	
	public int getCountOfStudents() {
		return countOfStudents;
	}
	
	public int getIncome() {
		return income;
	}
	
}