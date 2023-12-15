package javabook2.ch05.array;

public class ArrayCreateByValueList2 {

	public static void main(String[] args) {
		
		//문제 : 3명의 학생의 정수의 합계와 평균을 구하시오.
		int[] scores = {83,90,87};  // 배열선언
		
		System.out.println("score[0]:"+scores [0]);
		System.out.println("score[1]:"+scores [1]);
		System.out.println("score[2]:"+scores [2]);
		System.out.println("=============================");
		for(int i=0; i<scores.length;i++) {
			System.out.println("scores["+i+"]:" + scores[i]);
		}
		
		
		
		System.out.println("배열길이: "+ scores.length);
		
		int sum = scores[0] + scores[1] + scores[2];
		System.out.println(sum);
		
		double avg = (double)sum/3;
		System.out.println(avg);
		
		
		//배열 길이 확인 => 변수명.length
		System.out.println("=============================");
		
		String[] season = {"spring","summer","fall","winter"};
		
		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);
		System.out.println("배열길이:"+season.length);
		
		System.out.println("=============================");
		for(int i=0; i<season.length; i++) {
			System.out.println(season[i]);
		}
		
		
		
		boolean[] is_winner= {true,false,true};
		
		System.out.println(is_winner[0]);
		System.out.println(is_winner[1]);
		System.out.println(is_winner[2]);
		
		System.out.println("배열길이:"+is_winner.length);
		
		//반복문은 배열의 친구이다. 같이 쓰면 좋다. 많이 활용하자.
		
		
	}

}
