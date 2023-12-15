package javabook2.ch04.sec_switch;

public class SwitchDice {

	public static void main(String[] args) {
		// 문제 : 주사위 프로그램 구현
		// => 임의의(1부터 6까지) 정수 출력(random)
		// Match.random(): 랜덤 실수 생성
			=> 실수 생성 범위: 0.0 <= [실수] <1.0
					0.0 *6 <= [실수]*6 < 1.0 + 6
					0.0 + 1<= [실수]*6+1 < 6.0 + 1
					1.0 <= [실수]*6+1 <6.0 + 1
			int num = (int)(Math.random()*6+1);
			System.out.println(Math.random()*6+1);
			System.out.println(num);
			System.out.println("던져진 주사위 값:");
			
			
			
			
	
	}			
			

	}

}
