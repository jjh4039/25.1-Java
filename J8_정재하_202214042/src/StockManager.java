/*
 * 학기 : 2025년 1학기
 * 과목 : Java프로그래밍
 * 과제 : J8_2
 * 소속 : 소프트웨어융합학부
 * 이름 : 정재하
 * 학번 : 202214042
 */

import java.util.*;

public class StockManager {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		System.out.println("주식 종목과 주가를 입력하세요");
		
		while(true){ // 종목, 주가 입력
			System.out.print("종목, 주가 >> ");
			String ctg = scan.next();
			if(ctg.equals("그만")) break;
			else {
				Integer stock = scan.nextInt();
				map.put(ctg, stock);
			}
		}
		
		System.out.println("주가를 검색합니다.");
		
		while(true) {
			System.out.print("종목 >> ");
			String key = scan.next();
			if(key.equals("그만")) break;
			else {
				if (map.get(key) == null) System.out.println(key + "은 없는 종목입니다.");
				else System.out.println(key + "의 주가는 " + map.get(key) + "원");
			}
		}
	}

}
