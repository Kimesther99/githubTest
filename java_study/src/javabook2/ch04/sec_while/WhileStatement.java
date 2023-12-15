package javabook2.ch04.sec_while;

public class WhileStatement {

	public static void main(String[] args) {
		//While 문
		//문제 : 숫자를 0부터 9까지 출력하시오.
		System.out.println("1. for문 사용하지 않고 작서===");
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		
		System.out.println("2.for 문을 사용해서 작성=====");
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		
		System.out.println("3.for 조건식을 건드리지 말고 1부터 7까지 쓰기====");
//		해석 : 변수 i = 0부터 시작하여 10보다 작을 때까지 1씩 증가하면서 i를 출력
//		문제 : 7까지는 정상적으로 출력하다가 8,9는 건너뛰고 싶음. =>분기문(조건문) => 
//			=>  if(만약 조건식이 참/거짓이라면, )
//			=>	만약, 7을 만났다면 멈춰라(건너뛰어라)

		for(int i=0;i<10;i++) {
			if(i ==7) {break;}
			System.out.println(i);
		}
		
		System.out.println("while문===============");
		
		//문제 : break 를 사용하여 0부터 5까지 출력하는 코드 작성
		int i = 0 ;		// 1 2 3 4 ... 10
		while(i<10) {
			System.out.println(i);
//			반복 종료 코드;
//			i = 11;
			i++;
			if(i==6) {break;}
			
//			System.out.println(i);
			
			
			
			
		}
		

	}

}
