package javabook2.ch04.sec_for;

public class ForPrint {

	public static void main(String[] args) {
//		for (int i = 0; i<10; i++) {
//			System.out.println(i);
//		}
		
		//문제 : 1부터 15까지 합
		int sum = 0;
		
							//sum = sum + i;
//			sum += 1;
//			sum += 2;
//			sum += 3;
//			sum += 4;
//			sum += 5;
//			sum += 6;
//			sum += 7;
//			sum += 8;
//			sum += 9;
//			sum += 10;
//			sum += 11;
//			sum += 12;
//			sum += 13;
//			sum += 14;
//			sum += 15;
			
			for(int i=1; i<=15;i++) {
				sum += i;
		}
		System.out.println(sum);
		
	}

}
