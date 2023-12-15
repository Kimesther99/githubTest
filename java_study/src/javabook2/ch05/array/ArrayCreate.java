package javabook2.ch05.array;

public class ArrayCreate {
	//main 메서드
	public static void main(String[] args) {
		
		
		int [] iArr1 = null;			// 배열 선언 1
		int iArr2[] = {1,2,3};			// 배열 선언 2
		
		String [] sArr1 = null;				// 1. null 초기화
		String sArr2 [] = {"홍길동", "임꺽정"}; // 2. 값으로 초기화
		
		//3. new 연산자 초기화
//		타입[] 변수명 = new 타입[길이];
//		int[] iArr3 = new int[2];			// 배열 선언
		int[] iArr3 = new int[] {10,20};	//배열 초기화(선언 + 할당)			
		
		
		System.out.println(iArr3[0]);
		System.out.println(iArr3[1]);
		System.out.println("=============================");
		
		iArr3[0] = 10;						// 배열 값 할당
		iArr3[1] = 20;
//		iArr3[2] = 20;			길이 2를 벗어 낫음. 오류
		
		
		System.out.println(iArr3[0]);
		System.out.println(iArr3[1]);
		
		printName();		// 함수 호출(사용)
		printName();
		printName();
		
	}
	
	
	public static void printName() {
		System.out.println("입력도 없고, 출력(반환)도 없는 함수 입니다.");
	}
	
	//*** 매서드 선언(만들기)
//	리턴타입 매서드명(타입 변수명) {
//		return 값;
//	}
//	// void : 반환(return) 값이 없다.
//	public static void printName(String str1, int num1) {
//		[return 값;]
//	}
//	
//	
//	void PrintName() {
//		System.out.println("입력도 없고, 출력(반환)도 없는 함수 입니다.");
//	}
//	
	
	
//	함수 형태 1 : 입력x, 반환x
//	void add() {
//		System.out.println("더하기");
//	}
//	
//	함수 형태 2 : 입력o, 반환x
//	void sum(int a, int b) {
//		System.out.println("a 더하기 b");
//	}
//	
//	함수 형태 3 : 입력o, 반환o
//	int avg(int a, int b) {
//		System.out.println("a 와 b의 평균 구하기");
//		return a+b/2;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
