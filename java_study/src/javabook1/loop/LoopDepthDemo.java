package javabook1.loop;

public class LoopDepthDemo {

	public static void main(String[] args) {
		// [문제] 구구단 2단을 출력하는 프로그램을 작성하시오.
//		System.out.println("[구구단 2단]");
//		for(int i=1; i<=10; i++) {
//			
//		
//			System.out.println("2 x "+i+" = "+2*i);
//		}

		//[문제2] 구구단 2단부터 9단까지 출력하는 프로그램을 작성하시오.
		
		for(int i=1; i<10; i++) {
			System.out.println("2 x "+i+" = "+2*i);
			
		}
		
		System.out.println("===========================");
		for(int i=1; i<10; i++) {
			System.out.println("3 x "+i+" = "+3*i);
		
	
		}
		
//		System.out.println("============================");
//		for(int i=1; i<10; i++) {
//			System.out.println("4 x "+i+" = "+4*i);
//		
//	
//		}
		
		
		for(int j=2; j<10; j++) {
			System.out.println("=================");
			for(int i=1; i<10; i++)
			System.out.println(j+" x "+i+" = "+j*i);
		
		
		}
	
		
	}
	

}
