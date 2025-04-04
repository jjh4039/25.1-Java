/*
 * 학기 : 2025년 1학기
 * 과목 : Java프로그래밍
 * 과제 : J1_1
 * 소속 : 소프트웨어융합학부
 * 이름 : 정재하
 * 학번 : 202214042
 */

import java.util.Scanner;

public class J1_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int dollar;
		
		System.out.print("$1 = 1200원입니다. 달러를 입력하세요 >> ");
		dollar = scanner.nextInt();
		
		System.out.print("$" + dollar + "는 " + dollar*1200 + "원입니다.");
	}
}