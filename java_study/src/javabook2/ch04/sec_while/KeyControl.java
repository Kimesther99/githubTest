package javabook2.ch04.sec_while;

import java.util.Scanner;

public class KeyControl {

	public static void main(String[] args) {
		// 문제 : 키 입력을 통해 자동차의 속도를 제어하는 프로그램 작성
		
		//1. 키 입력 구현
		Scanner sc = new Scanner(System.in); //입력준비
//		System.out.println(str=="가속");			//false
//		System.out.println(str.equals("가속"));	//true
		
		//2. 입력된 키를 사용하여 속도 제어 : 1.가속 2.감속 3.정지
		// 자동차 시동 => 주행(달리다)
		int speed = 0;
		System.out.println("현재 속도= "+ speed);

		// run => 자동차 주행(달리다) => true(주행중)/ false(정지)
		boolean run = true;
		//[변수] 초기화 과정 ==================================
		
		while(run) {
			System.out.println("주행중");
			// 반복 종료 코드 
			System.out.println("--------------");
			System.out.println("1.가속 2.감속 3.정지");
			System.out.println("--------------");
			System.out.println("선택 입력:");
			
			
			
			String str;
			str = sc. nextLine();			//문자열 입력 메서드	
//			System.out.println(str);	

			if( str.equals("가속") ) {
				System.out.print("속도 증가");
				speed++;
			}	else if(str.equals("감속")) {
				 System.out.print("속도 감소");
				speed--;
			}	else if(str.equals("정지")) {
				 System.out.print("정지(속도=0)");
				 speed = 0;
				 //반복 종료 코드
				 run = false;		// 자동차 정지
			}
			System.out.println("현재 속도= "+ speed);

		}

		sc.close();					//입력 종료

		
	}

}
