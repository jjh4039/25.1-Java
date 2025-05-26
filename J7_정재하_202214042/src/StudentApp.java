/*
 * 학기 : 2025년 1학기
 * 과목 : Java프로그래밍
 * 과제 : J7_1
 * 소속 : 소프트웨어융합학부
 * 이름 : 정재하
 * 학번 : 202214042
 */

class Student {
	
	private String name;
	private int id;
	
	public Student(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "학번이 " + id + "인 황기태";
	}
	
	@Override
	public boolean equals(Object obj) {
		Student std = (Student)obj; // 다운캐스팅
		return this.name.equals(std.name) && this.id == std.id;
	}
}

public class StudentApp {
	public static void main(String[] args) {
		Student a = new Student("황기태", 23);
		Student b = new Student("황기태", 77);
		System.out.println(a);
		
		if(a.equals(b)) // equals return 타입 -> boolean
			System.out.println("같은 학생입니다.");
		else
			System.out.println("다른 학생입니다.");
	}

}
