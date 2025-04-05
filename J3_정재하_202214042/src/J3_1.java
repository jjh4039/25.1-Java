/*
 * 학기 : 2025년 1학기
 * 과목 : Java프로그래밍
 * 과제 : J3_1
 * 소속 : 소프트웨어융합학부
 * 이름 : 정재하
 * 학번 : 202214042
 */

import java.util.Scanner;

public class J3_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		do{
			System.out.print("양의 정수 입력 >> ");
			num = scan.nextInt();
		} while(num <= 0);
		
		for (int i = num;i >= 1;i--) {
			for (int j = 0;j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

