/*
 * 학기 : 2025년 1학기
 * 과목 : Java프로그래밍
 * 과제 : J8_1
 * 소속 : 소프트웨어융합학부
 * 이름 : 정재하
 * 학번 : 202214042
 */

import java.util.*;

public class SumPositives {
	Scanner scan = new Scanner(System.in);
	private Vector<Integer> v = new Vector<Integer>();
	
	void read() {
		System.out.print("0이 입력될 때까지 정수 입력 >> ");
		int n;
		while(true) {
			n = scan.nextInt();
			if (n == 0) break;
			else v.add(n);
		}
	}
	
	void changeToZero() {
		for (int i = 0 ;i < v.size();i++) {
			if (v.get(i) < 0) v.set(i, 0);
		}
	}
	
	void showAll() {
		for (int i = 0 ;i < v.size();i++) {
			System.out.print(" " + v.get(i));
		}
		System.out.println()
		;
	}
	
	int add() {
		int sum = 0;
		for (int i = 0;i < v.size();i++) {
			sum += v.get(i);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		SumPositives sp = new SumPositives();
		sp.read();
		sp.changeToZero();
		System.out.print("음수를 0으로 바꾸면");
		sp.showAll();
		System.out.println("양수들의 합은 " + sp.add());
	}
}
