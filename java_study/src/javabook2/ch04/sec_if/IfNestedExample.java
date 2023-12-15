package javabook2.ch04.sec_if;

public class IfNestedExample {

	public static void main(String[] args) {
		int num = 1;
		//중첩된 if문
//		if(num==1) {			//true
//			System.out.println("1");
//			if(num==2) {		//false				
//				System.out.println("2");
//			}else if(num==1) {	//false
//				System.out.println("3");
//				System.out.println("num:" + num);	
//			}
//			System.out.println("num:" + num);	//출력
//			
//		}else {
//			System.out.println("num:" + num);	//안됨
//		}
		//지역변수
		if(num==1) {
			int num1 = 3;	//변수 초기화
			if(num==1) {
				System.out.println("num1:" + num1);
			}	else if(num==1) {		//false
				System.out.println("num1:"+num1);
			}
			
			
		} else {}
		
	}

}
