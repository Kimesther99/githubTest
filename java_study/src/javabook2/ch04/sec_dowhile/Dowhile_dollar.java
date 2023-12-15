package javabook2.ch04.sec_dowhile;

import java.util.Scanner;

public class Dowhile_dollar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dollar;
		do {
			System.out.println("금액을 입력하세요"); //입력수행
			
			dollar = sc.nextLine();
			System.out.println(dollar);
			
			
		} 
		while(!dollar.equals("q"));
			sc.close();
	}
		
}
