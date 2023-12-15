package javabook1.loop;

public class ForDemo {

	public static void main(String[] args) {
		// 문제: 다음과 같이 출력되는 프로그램을 작성 하시오.(for 사용)
		// 출력 결과 :
//		Coding Everybody 3
//		Coding Everybody 6
//		Coding Everybody 9
//		Coding Everybody 12
		// ============================================
		
		System.out.println("Coding Everybody 3");
		System.out.println("Coding Everybody 6");
		System.out.println("Coding Everybody 9");
		System.out.println("Coding Everybody 12");
		
		System.out.println("=======================");
		// 횟수 반복 사용 4번
//		증감식: i = i = 3;
		
		for(int i=3;i<15;i=i+3) {
			System.out.print("Coding Everybody");
			System.out.println(" "+i);
		}
		
		
		
		
		
		
		
		//==============================================
		
		
		
		
		
//		for(int i=3;i<15;i++) {
//			
//		if(i%3==0)
//			
//		System.out.println("Coding Every body "+ i);
//			
//		}
			
		
		
		
		
		
	}

}
