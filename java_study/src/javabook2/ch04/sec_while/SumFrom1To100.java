package javabook2.ch04.sec_while;

public class SumFrom1To100 {

	public static void main(String[] args) {
		// 문제: 1부터 100까지 합 구하기 (while문 사용)
		int sum = 0;
		int i = 1;
		while(i<=100) {
				sum += i;
				i++;
				
			}
		System.out.println("합 : ");
		System.out.println(sum);
		}

	}


