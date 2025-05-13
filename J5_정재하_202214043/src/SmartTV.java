/*
 * 학기 : 2025년 1학기
 * 과목 : Java프로그래밍
 * 과제 : J5_1
 * 소속 : 소프트웨어융합학부
 * 이름 : 정재하
 * 학번 : 202214042
 */

// Class 3
public class SmartTV extends ColorTV {
	
	private String ip;
	
	public SmartTV(String ip, int size, int color) {
		super(size, color); // ColorTV 생성자
		this.ip = ip;
	}
	
	@Override
	public void printProperty() {
		System.out.println("나의 SmartTV는 " + this.ip + " 주소의 " +
				getSize() + "인치 " + getColor() + "컬러");
	}

	public static void main(String[] args) {

		SmartTV smartTV = new SmartTV("192.168.0.5", 77, 20000000);
		smartTV.printProperty();
	}
}
