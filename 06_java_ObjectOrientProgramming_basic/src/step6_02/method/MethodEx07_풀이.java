package step6_02.method;

//2022-10-26 오후 5시 12분 ~ 오후 5시 26분

class Ex07 {
	
	void printEvenOrOdd(int num) {
		if (num % 2 == 0) {
			System.out.println(num + "은(는) 짝수입니다.");
		}
		else {
			System.out.println(num + "은(는) 홀수입니다");
		}
	}
	void getAvgBetweenValues(int x, int y) {
		int hap = 0;
		
		for (int i = x; i <= y; i++) {
			hap += i;
		}
		System.out.println("x부터 y까지 합의 평균: " + (hap / 2));
	}

	void printPrimeNums(int primeNumber) {
		
		for (int i = 2; i <= primeNumber; i++) {
			int cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.print(i + " ");
			}
		}
	}
}


public class MethodEx07_풀이 {

	public static void main(String[] args) {
		

			Ex07 e = new Ex07();
			
			// 문제 1) num이 홀수인지 짝수인지 출력하는 메서드
			int num = 19;
			e.printEvenOrOdd(num);
	
			// 문제 2) x부터 y까지 합의 평균을 출력하는 메서드
			int x = 1;
			int y = 10;
			e.getAvgBetweenValues(x, y);
	
			// 문제3) 2부터 primeNumber까지의 소수를 전부 출력하는 메서드 
			int primeNumber = 20;
			e.printPrimeNums(primeNumber);




	}

}
