package javabook2.ch05.array;

import java.util.Scanner;

public class AdvancedFor_travel {

	public static void main(String[] args) {

		
		for(String str : args) {
			System.out.println(str);
		}
		
		
		
		
		
		
		
		String [] travelAreas = new String[10];
		
		// 배열에 데이터 입력 전
//		for(String area : travelAreas) {
//			System.out.println(area);
//			
//		}
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("떠나고 싶은 여행지 입력: ");
		String travelArea = sc.nextLine();
//		System.out.println(travelArea);
		
		travelAreas[0] = travelArea;
		
		//배열에 데이터 입력 전
		System.out.println("======================");
		
		for(String area : travelAreas) {
			System.out.println(area);
			
		}
		
		sc.close();

	}

}
