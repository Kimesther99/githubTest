package javabook2.ch04.sec_dowhile;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// do-while문
//		##메세지를 입력 프로그램
//		1.메세지를 입력하세요.
//		2.키보드로 메세지 입력
//		3.q키를 입력하여 프로그램을 종료
		
		Scanner sc = new Scanner(System.in); //입력준비
		String inputStr;
		do {
			System.out.println("메세지를 입력하세요.");
			
			inputStr = sc.nextLine(); //입력수행
			System.out.println(inputStr);

//			실행문;
		}while(!inputStr.equals("q"));
		
		sc.close(); //입력 종료

	}

}
