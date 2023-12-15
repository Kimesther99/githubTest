package javabook2.ch05.array;

public class ArrayInArray_exam {

	public static void main(String[] args) {
		// 평가 예제
		//	: 반 별 학생 별 점수 생성 및 합계와 평균 구하기
		
		int[][] scores = {
				{80,90,96},			//1반 3명
				{76,88}				//2반 2명								
		};
		
		// 1반 2번째 학생 점수
		System.out.println(scores[0][1]);
		
		// 2반 1번째 학생 점수
		System.out.println(scores[1][0]);
		
		System.out.println(scores.length);		// 1차원 배열 길이
		System.out.println(scores[0].length);	// 2차원 0번 인덱스 배열길이(1반 학생수)
		System.out.println(scores[1].length);   // 2차원 1번 인덱스 배열길이(2반 학생수)

		System.out.println("1반 학생 점수");
		for(int i=0; i<3; i++) {
			System.out.println(scores[0][i] + "점");
		}
		
		for(int i=0; i<scores[0].length; i++) {
			System.out.println(scores[0][i] + "점");
		}
		System.out.println("2반 학생 점수");
		for(int i=0; i<scores[1].length; i++) {
			System.out.println(scores[1][i] + "점");
		}
		
		//[문제1] 1반 학생들 점수 총합
		int sum = 0;		// 80 170 266
		System.out.println("1반 학생들 점수 총합 : ");
		for(int i=0; i<3; i++) {
			
			sum += scores[0][i];	
			//sum = scores[0][i+=i]; == 내가 한 계산식_오류
		}
		
		System.out.println(sum + "점");
		
		
		
		
		
		
		//[문제2] 2반 학생들 점수 평균
		int avg = sum / scores[1].length;
		System.out.println("평균 :" + avg + "점");
		
		double dAvg = sum / (double)scores[1].length;
		System.out.println("평균:" + dAvg + "점");
		
		
		
		
		//[문제3] 전체 학생들 점수 총합
//		for(int i = 0; i<scores[0].length; i++) {
//			
//			System.out.println(scores[0][1]);
//			
//		}
//		
//		for(int i = 0; i<scores[1].length; i++) {
//			
//			System.out.println(scores[1][1]);
//			
//		}
		sum = 0;
		int count = 0;
		for(int j = 0; j<scores.length; j++) {				// 2번 반복 : 행 개수
			for(int i=0; i<scores[j].length; i++) {			// 3번 반복 : 열 개수
//				System.out.println(scores[j][i]);
				sum += scores[j][i];						// 6명 성적 더하기
				count ++;				// count = count +1;
			}
			
			
		}
		System.out.println(sum + "점");
		
		double dAvg1 = (double)sum / count;
		System.out.println("평균 :" + dAvg1 + "점");
		
		
	}

}
