package step6_02.method;

import java.util.Scanner;

//2022-10-26 오후 4시 55분 ~ 오후 5시 2분

/*
class Ex05{

	void test1() {}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		scan.close();
	}
	
}
*/

class Ex05 {
	
	void test1() {
		int number = 1;
		int hap = 0;
		
		for (int i = 0; i < 5; i++) {
			hap += number;
			System.out.print(number + " ");
			number ++;
		}
		System.out.println("= " + hap);
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		int maximum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 정수 입력: ");
			arr[i] = scan.nextInt();
			if (maximum < arr[i]) {
				maximum = arr[i];
			}
		}
		System.out.println("최댓값: " + maximum);
		
		scan.close();
	}
	
	
}

public class MethodEx05_풀이 {

	public static void main(String[] args) {

		/*
			Ex05 e = new Ex05();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			e.test1();
			
			// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
			e.test2();
		*/
		
		Ex05 e = new Ex05();
		
		// 문제 1) 1부터 5까지의 합을 출력하는 메서드
		e.test1();
		
		// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
		e.test2();
		
	}

}
