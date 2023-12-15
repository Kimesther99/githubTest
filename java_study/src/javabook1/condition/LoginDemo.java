package javabook1.condition;

public class LoginDemo {

	public static void main(String[] args) {
		// 로그인 화면 : 아이디 / 비밀번호

		String id = "esther";
		
//		만약, 아이디가 esther 이면 로그인 성공
//		그렇지 않으면 로그인 실패 표시
//		if(id == "esther" ) {
		
//		System.out.println();
		if(id.equals("esther") ) {
			
		System.out.println("로그인 성공");
			
		} else {
		System.out.println("로그인 실패");	
		}
		
		
		
	}

}
