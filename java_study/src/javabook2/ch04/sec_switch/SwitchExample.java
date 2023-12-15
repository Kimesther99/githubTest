package javabook2.ch04.sec_switch;

public class SwitchExample {

	public static void main(String[] args) {
		
		int num;	// 변수 선언
		num = 2;	// 1의 값 할당.
		
		
		// switch-case 문 //건너뛰기는 할 수 있어도 멈추지는 못함. 상단에 있는 case가 거짓이면 일치하는 case 까지 넘어가지만 break는 못해서 밑에 값까지 다 출력해버림.
		switch(num) {
			
			case 3: 
				System.out.println("3");
		
			case 2: 
				System.out.println("2");
				break;
			case 1: 
				System.out.println("1");	
				
			case 4: 
				System.out.println("4");	
				
		}

	}

}
