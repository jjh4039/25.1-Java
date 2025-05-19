/*
 * 학기 : 2025년 1학기
 * 과목 : Java프로그래밍
 * 과제 : J6_1
 * 소속 : 소프트웨어융합학부
 * 이름 : 정재하
 * 학번 : 202214042
 */

import java.util.Scanner;

interface IStack {
	int capacity();
	int length();
	boolean push(String val);
	String pop();
}

class StringStack implements IStack {
		private String[] member;
		private int top = 0;
		
		public StringStack(int capacity) {
			member = new String[capacity];
		}
		
		@Override
		public int capacity() { //getCapacity 캡슐화?
			return this.member.length;
		}
		
		@Override
		public int length() { //getLength 캡슐화?
			return this.top;
		}
		
		@Override
		public boolean push(String val) {
			if (top == member.length) // 스택 가득참
				return false;
			
			member[top] = val;
			top++;
			return true; // String 저장 후 top++, true 리턴
		}
		
		@Override
		public String pop() {
			if(top == 0)
				return null; // String
			
			top--;
			return member[top]; // 바로 앞에(top--)저장한 String 리턴
		}
}

public class StackApp{
	public static void main(String[] args) {
		
		int capacity; // 스택 용량
		String tmp; // 문자열 대입용 필드
		
		Scanner scan = new Scanner(System.in);
		System.out.print("스택 용량 >> ");
		capacity = scan.nextInt();
		scan.nextLine(); // 줄바꿈 제거
		
		StringStack stack1 = new StringStack(capacity);
		
		while(true) {
			System.out.print("문자열 입력 >> ");
			tmp = scan.nextLine();
				
			if(tmp.equals("그만")) break;
			
			if(stack1.push(tmp) == false) {
				System.out.println("스택이 꽉 차서 " + tmp + " 저장 불가");
			}
		}
		
		System.out.print("스택에 저장된 문자열 팝 : ");
		
		// 스택 출력 (저장의 역순으로 출력됨)
		for(int i = 0;i < capacity;i++) {
			String strCheck = stack1.pop();
			
			if (strCheck == null) { break; }
			else System.out.print(strCheck+ " ");
		}
	}
}