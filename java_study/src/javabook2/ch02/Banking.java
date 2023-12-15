package javabook2.ch02;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System. in);
		
//		String str;
		int bal;
		
		System.out.println("입금하시겠어요?(입금 금액을 입력): ");
//		str = sc.nextLine(); 	// 문자열로 입력 받았기 때문에 숫자를 입력해도 계산은 안됨.
		bal = sc.nextInt();		// 점수 입력
		
		System.out.println("잔액: ");
		System.out.println(bal);
		
		
		sc.close();
	}

}
