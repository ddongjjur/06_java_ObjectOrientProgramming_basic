package step6_01.classObject;

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

class Ex03_2 {
	int[] arr = {87, 100, 11, 72, 92};
}



public class ClassEx03_풀이2 {

	public static void main(String[] args) {
		Ex03_2 ex03_2 = new Ex03_2();
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		
		int total = 0;
		for (int i = 0; i < ex03_2.arr.length; i++) {
			total += ex03_2.arr[i];
		}
		System.out.println(total);
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		
		int quatroMultiTotal = 0;
		for (int i = 0; i < ex03_2.arr.length; i++) {
			if (ex03_2.arr[i] % 4 == 0) {
				quatroMultiTotal += ex03_2.arr[i];
			}
		}
		System.out.println(quatroMultiTotal);
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		
		int quatroMultiCnt = 0;
		for (int i = 0; i < ex03_2.arr.length; i++) {
			if (ex03_2.arr[i] % 4 == 0) {
				quatroMultiCnt++;
			}
		}
		System.out.println(quatroMultiCnt);
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		
		int even = 0;
		for (int i = 0; i < ex03_2.arr.length; i++) {
			if (ex03_2.arr[i] % 2 == 0) {
				even++;
			}
		}
		System.out.println(even);

	}

}
