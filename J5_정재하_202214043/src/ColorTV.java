/*
 * 학기 : 2025년 1학기
 * 과목 : Java프로그래밍
 * 과제 : J5_1
 * 소속 : 소프트웨어융합학부
 * 이름 : 정재하
 * 학번 : 202214042
 */

// Class 2
public class ColorTV extends TV {
	
	private int color;
	
	public ColorTV(int size, int color) {
		super(size); // TV 생성자
		this.color = color;
	}
	
	protected int getColor() { return this.color; }
	
	public void printProperty() {
		System.out.println(getSize() + "인치 " + color + "컬러");
	}
	
	public static void main(String[] args) {
		ColorTV myTv = new ColorTV(65, 65536);
		myTv.printProperty();
	}
}
