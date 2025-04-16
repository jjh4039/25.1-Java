/*
 * 학기 : 2025년 1학기
 * 과목 : Java프로그래밍
 * 과제 : J4_1
 * 소속 : 소프트웨어융합학부
 * 이름 : 정재하
 * 학번 : 202214042
 */

import java.util.Scanner;

public class J4_2 {
	public static void main(String[] args) {
		String course[] = {"C", "C++", "Python", "Java", "HTML5"};
		String grade[] = { "A", "B+", "B", "A+", "D" };
		boolean isFound; 

		Scanner scan = new Scanner(System.in);
		String courseName = "";

		while(true) {
			
			isFound = false;
			System.out.print("과목 >> ");
			courseName = scan.nextLine();

			if (courseName.equals("그만")) break;
			
			for (int i = 0; i < course.length; i++) {
				if (course[i].equals(courseName)) {
					System.out.println(course[i] + " 학점은 " + grade[i]);
					isFound = true;
					break;
				}
			}
			if (!isFound)
				System.out.println(courseName + "는 없는 과목입니다.");
		}
	}
}
