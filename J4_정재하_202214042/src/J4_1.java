/*
 * 학기 : 2025년 1학기
 * 과목 : Java프로그래밍
 * 과제 : J4_1
 * 소속 : 소프트웨어융합학부
 * 이름 : 정재하
 * 학번 : 202214042
 */

import java.util.Scanner;

public class J4_1 {
	public static void main(String[] args) {

		int first, second, count = 0;
		int answer = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("***** 구구단을 맞추는 퀴즈입니다 *****");

		while (count < 3) {
			first = (int) (Math.random() * 9 + 1);
			second = (int) (Math.random() * 9 + 1);

			System.out.print(first + " X " + second + " = ");
			answer = scan.nextInt();

			if (answer == (first * second)) {
				System.out.println("정답입니다. 잘했습니다.");
			} else {
				count++;
				if (count >= 3) {
					System.out.println(count + "번 틀렸습니다. 퀴즈 종료합니다.");
				} else
					System.out.println(count + "번 틀렸습니다. 분발하세요.");
			}
		}

	}
}
