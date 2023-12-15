package javabook2.ch02;

import java.util.Scanner;  //라이브러리 클래스 위치

public class ScannerType {
	
	
	
	public static void main(String[] args) {
		// Scanner 타입 변수 활용	:	값을 입력 받기 위해 사용
	//   1.Scanner 타입 변수 선언	:	Scanner sc;
	  
		// 라이브러리 클래스 : 이미 만들어진 소스코드
//		2. 라이브러리 클래스 추가 : 단축키 Ctrl + Shift + o
		
//		3. 변수 할당 : new Scanner(System.in);
		
	//	4.변수 할당 해제 : 변수명.close();
		Scanner sc = new Scanner(System.in);
		
		String str1;
//		String str2;
		
	//	5.문자열 입력 
		
		System.out.println("이름을 입력하세요.");
		str1 = sc.nextLine();	//입력 문자열 할당
		
//		System.out.print("성별을 입력하세요 ");
//		str2 = sc.nextLine();
		
		
//		System.out.println("당신의 이름은:"); //출력
		System.out.println(str1);
//		System.out.println("당신의 성별은: ");
//		System.err.println("str2"); 		//출력
		
		
		sc.close();		//변수 할당 해제
		
	}

}
