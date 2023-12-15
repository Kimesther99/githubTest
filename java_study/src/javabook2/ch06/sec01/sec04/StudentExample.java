package javabook2.ch06.sec01.sec04;

//실행클래스
public class StudentExample {

	public static void main(String[] args) {
		
//		클래스타입 변수명;		//클래스 선언
		Student	kim;
		
//		1. null 초기화
		kim = null;// 값 할당
		
//		2. new 연산자 초기화
		kim = new Student();			// 객체 생성 값 할당
		
		Student park = new Student();  // 초기화 (선언 + 할당)
		
		Student lim = new Student();
		System.out.println("실험클래스 동작");
		
		Student lee = new Student("이순신");
	
	}

}
