package step6_02.method;

//2022-10-26 오후 5시 3분 ~ 오후 5시 11분 

class Ex06{
	
	void test1(int x, int y) {
		int hap = 0;
		
		for (int i = x; i <= y; i++) {
			hap += i;
		}
		System.out.println(hap);
	}
	
	void test2(int[] arr) {
		int maximun = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (maximun < arr[i]) {
				maximun = arr[i];
			}
		}
		System.out.println(maximun);
	}
	
	void test3(int[] arr, int idx1, int idx2) {
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}


public class MethodEx06_풀이 {

	public static void main(String[] args) {
		

			Ex06 e = new Ex06();
			
			// 문제 1) x부터 y까지의 합을 출력하는 메서드
			int x = 1;
			int y = 10;
			e.test1(x, y);
			
			// 문제 2) arr배열을 전달받아 최대값을 출력하는 메서드
			int[] arr = {87, 100, 35, 12, 46};
			e.test2(arr);
			
			// 문제 3) arr배열과 idx1 , idx2를 전달받아 idx1번째와 idx2번째를 교체한뒤 출력하는 메서드
			int idx1 = 1;
			int idx2 = 4;
			e.test3(arr, idx1, idx2);


	}

}
