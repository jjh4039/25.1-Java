/*
 * 학기 : 2025년 1학기
 * 과목 : Java프로그래밍
 * 과제 : J1_2
 * 소속 : 소프트웨어융합학부
 * 이름 : 정재하
 * 학번 : 202214042
 */

import java.util.Scanner;

public class J1_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count, total = 0;

		System.out.println("**** 자바 분식입니다. 주문하면 금액을 알려드립니다. ****");
		
		System.out.print("떡볶이 몇 인분 >> ");
		count = scanner.nextInt();
		total += count * 2000;
		
		System.out.print("김말이 몇 인분 >> ");
		count = scanner.nextInt();
		total += count * 1000;
		
		System.out.print("쫄면 몇 인분 >> ");
		count = scanner.nextInt();
		total += count * 3000;
		
		System.out.print("전체 금액은 " + total + "원입니다.");
		
	}
}