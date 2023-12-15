package javabook2.ch06.sec01.sec04;

//라이브러리 클래스
public class Student {

//		1. 필드 (속성, 변수)
//		타입 필드명;
//		타입 필드명 = 초기값;
		
//		String name ;	
		String name = "강호동";
		int age = 56;
		boolean man = false;
		
		
		
//		2. 생성자 : 객체를 생성
//		!주의사항 : 사용자 생성자를 만든 경우, 기본 생성자를 생략할 수 없다.
		//		Student(타입 값1, 타입 값2) {
//			실행문;
//		}
		
//		형태 1 : 기본 생성자(생략 가능) : 입력x, 내용x
		Student(){			
		}
		
//		형태 2 : 사용자 생성자(생략 불가) : 입력(선택), 내용o
		Student(String name) {
			System.out.println(name);
//			매서드 사용 방법 : 메서드명(값1,값2)
//			study1();					// 매서드 호출(사용)
			study2("국어");
//			study3("수학");
			
		}
		
		
		

//		3. 매서드 (기능, 함수)
//		타입 메서드명(타입 값1, 타입 값2) {
//			
//		}
		
//		형태 1 : 입력x, 반환x
//		기능 : 기능(함수, 메서드)의 설명을 출력하다.
		void study1() {
			System.out.println("나이가 "+age+"세 인");
//			System.out.println("나이가 "+(age+1)+"세 인");    // 변수는 연산 가능하다.
			System.out.println(name+"이" +" 공부하다.");
			
		}
		
//		형태 2 : 입력o, 반환x
//		기능 : 어떤 과목을 공부하는지 출력하다.
//		입력 : 과목
		void study2(String subject) {
			System.out.println(subject + "공부하다.");
		}
		
//		형태 3 : 입력o, 반환o
//		기능 : 어떤 과목을 공부하는지 출력하고 과목을 반환한다.
//		입력 : 과목
//		변환 : 과목
		String study3(String subject) {
			System.out.println(subject + "공부하다.");
			return "subject";
		}
		
		
		
	
}
