package step6_01.classObject;

//2022-10-25 오후 5시 10분 ~ 오후 5시 20분

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

//class Ex03{
//	int[] arr = {87, 100, 11, 72, 92};
//}

class Ex03_풀이 {
	
	int[] arr = {87, 100, 11, 72, 92};
	
}


public class ClassEx03_풀이 {

	public static void main(String[] args) {
		
		Ex03_풀이 e = new Ex03_풀이();
				
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		
		int allPlus = 0;
		
		for (int i = 0; i < e.arr.length; i++) {
			allPlus += e.arr[i];
		}
		System.out.println(allPlus);
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		
		int plus4Mul = 0;
		
		for (int i = 0; i < e.arr.length; i++) {
			if (e.arr[i] % 4 == 0) {
				plus4Mul += e.arr[i];
			}
		}
		
		System.out.println(plus4Mul);
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		
		int cnt4Mul = 0;
		
		for (int i = 0; i < e.arr.length; i++) {
			if (e.arr[i] % 4 == 0) {
				cnt4Mul++;
			}
		}
		
		System.out.println(cnt4Mul);
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		
		int evenCnt = 0;
		
		for (int i = 0; i < e.arr.length; i++) {
			if (e.arr[i] % 2 == 0) {
				evenCnt++;
			}
		}
		System.out.println(evenCnt);
	}

}
