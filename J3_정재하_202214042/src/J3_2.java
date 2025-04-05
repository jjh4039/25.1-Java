/*
 * 학기 : 2025년 1학기
 * 과목 : Java프로그래밍
 * 과제 : J3_2
 * 소속 : 소프트웨어융합학부
 * 이름 : 정재하
 * 학번 : 202214042
 */

import java.util.Scanner;

public class J3_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int intArray[] = new int[10];
		
		System.out.print("양의 정수 10개 입력 >> ");
		
		for (int i = 0;i < 10;i++) {
			intArray[i] = scan.nextInt();
		}
		
		System.out.print("3의 배수는 ");
		
		for (int checker:intArray) {
			if (checker % 3 == 0) System.out.print(checker + " ");
		}
	}
}
