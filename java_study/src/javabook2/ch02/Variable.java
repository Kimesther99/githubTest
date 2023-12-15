package javabook2.ch02;

public class Variable{

	public static void main(String[] args) {
//		 부동 소수점(floating point) 방식오차
//		:	가수부와 지수부로 나누어 표현
//		고정 소수점(fixed point) 방식
//		
		
		
		//		1. 연산문제(이진수 표현 문제)
//			실수 또한 이진수로 표현되므로
//			가수부가 1/2^n 형태로 표현되는 경우만 오차없이 정확하게 값이 계산
			double d1 = 0.1;
			double d2;
			d2 = d1 + 0.1;
			
			System.out.println(d2);   //0.2
			d2 = d2 + 0.1;
			System.out.println(d2);   //0.3
			
//		2. 범위 문제
//		 float 형은 소수점 6번째 자리까지 정확하게 표현가능(그 이상은 부정확)
//		 double 형은 소수점 15자리까지 오차없이 표현가능(그 이상은 오차 발생))
		float f1 = 1.23456789f;
		double d3 = 1.23456789;
		
		System.out.println(f1);
		System.out.println(d3);
		
//		문자열 데이터 타입
		String s1 = "ab";
		
//		이스케이프 문자
		String str1 = "\"안녕하세요?\"";           // \"문자 포함
		String str2 = "반갑습니다.";				// \'문자 포함
		String str3 = "안녕하세요?\s반갑\s습니다";
		String str4 = "안녕하세요?\t반갑\s습니다";
		String str5 = "안녕하세요?\t\n반갑\s습니다";  // \n 출력시 줄바꿈(라인피드)
		
//		자동완성 : Ctrl + space
//		예) syso
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		
		
		
	}

}
