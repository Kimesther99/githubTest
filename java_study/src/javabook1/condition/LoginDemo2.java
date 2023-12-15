package javabook1.condition;

import java.util.Scanner;

public class LoginDemo2 {

	public static void main(String[] args) {
		// 문제 : Scanner 를 사용하여 아이디를 입력받아
		//		 로그인을 수행하는 프로그램을 작성하세요.
		
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.print("아이디를 입력하시오 :");
		// 입력 받는 소스 코드 작성
		String id = sc.nextLine();
		System.out.println("입력된 아이디:" + id);
		sc.close();
		String DB_id = "esther" ;	//DB 저장된 id
				
//		만약, 입력된 아이디가 esther 이면 로그인 성공
//		그렇지 않으면 로그인 실패 표시

		System.out.println(DB_id.equals(id));
		
		if(DB_id.equals(id)){
			System.out.println("로그인 성공 !");
	}	else {
			System.out.println("로그인 실패ㅠㅠ");
		
		
		
	}
		
	
		
	}

}
