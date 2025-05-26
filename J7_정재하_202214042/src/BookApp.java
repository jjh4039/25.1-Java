/*
 * 학기 : 2025년 1학기
 * 과목 : Java프로그래밍
 * 과제 : J7_2
 * 소속 : 소프트웨어융합학부
 * 이름 : 정재하
 * 학번 : 202214042
 */

class Book {
	
	private String writer;
	private String title;
	private String name;
	
	public Book(String writer, String title, String name){
		this.writer = writer;
		this.title = title;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name + "이 구입한 도서 : " + writer + "의 " + title;
	}
	
	// '저자'와 '도서명' 일치 확인 (구입자 X) 
	@Override
	public boolean equals(Object obj) { 
		Book bk = (Book)obj; // 다운캐스팅2
		return this.writer.equals(bk.writer) && this.title == bk.title;
	}
}

public class BookApp {

	public static void main(String[] args) {
		Book a = new Book("황기태", "명품자바", "김하진");
		Book b = new Book("황기태", "명품자바", "하여린");
		
		System.out.println(a);
		System.out.println(b);
		
		if (a.equals(b)) 
			System.out.println("같은 책");
		else
			System.out.println("다른 책");
	}

}
