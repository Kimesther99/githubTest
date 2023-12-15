package javabook2.ch06.sec01;

// 라이브러리 클래스
// (누구나 볼 수 있는) 자동차 설계도
public class Car {	
	
// [문제] 자동차 설계도를 작성하시오.
//		자동차가 가지는 속성을 하나 필드로 작성하시오.
//		자동차가 가지는 기능을 하나 메서드로 작성하시오.
//		1.필드
	 	 
//		int airbag = 4;
		String company = "현대자동차";
		String model = "tusan";
		int maxSpeed = 300;
		
	
//		2.생성자
//		Car(){
//			System.out.println("에어백의 개수 :" + airbag);
//			bang();
//		}
		
	
	
//		3.메서드 (기능)
//		void bang() {
//			System.out.println("에어백의 개수 :" + airbag);
//			System.out.print("에어백의 기능은" );
//		}
		
		
//		기능 : 주행하다.
		void run() {
			System.out.println("주행하다.");
		}
//		기능 : 속도를 표시하다.
		void displaySpeed() {
			System.out.println("속도를 표시하다.");
			System.out.println("최고속도 : " + maxSpeed);
		}
		
		
		
}
