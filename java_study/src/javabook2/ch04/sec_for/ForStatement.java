package javabook2.ch04.sec_for;

public class ForStatement {

	public static void main(String[] args) {
		
//		System.out.println(0);
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);	// 0부터 1만개의 숫자들을 출력해내려고 한다. 그럴 때는 for 구문을 쓴다.
		
		//for(초기화식;조건식;증감식){}
//		int i = 0;
//		i = i + 1;
//		System.out.println(i);
//		i = i + 1;
//		i++;
//		++i;
//		System.out.println(i);
		
		//for(int i = 0;i<10; i++) {
		
//		0 => 1 => 2 => 3 => 4 => 5 => 6
		
//		for (int i=0; i<6; i++) {
//			System.out.println(i);
//			
//		}
		
//		문제1. 숫자를 출력하려고 함.
//		5 => 4 => 3 => 2 =>1 =>0
		
		// i => 5 4 3 2 1 0 
//		for(int n = 5; n>=0; n--) {
//			System.out.println(n);
//		} 									//6번 실행
//		
		
		
//		문제2. 다음과 같이 숫자를 출력하시오.
//		0 2 4 6 8
		
//		for(int k = 0; k<10; k=k+2) {
//			System.out.println(k);			//5번 실행
//		}
//		
//		문제3. 1부터 5까지 합을 구하는 프로그램을 작성하시오.
//		1+2+3+4+5
		
		int sum = 0;
//		System.out.println(sum);
//		
//		sum = 1;		//1
//		sum = 1+2;		//3
//		sum = 1+2+3;	//6	
//		sum = 1+2+3+4;	//10
//		sum = 1+2+3+4+5;//15
		
		
//		sum => 0 1 3 6 10
//		i	=> 1 2 3 4 5
		
		for(int i = 1; i<=5; i++) {
//			System.out.println(i);		//1 2 3 4 5
			sum = sum + i;			//	0 1 3 6 10 15	
			System.out.println(sum);
		}
		
		
//		System.out.println(sum);
		
		
		
		
		
	}

}
