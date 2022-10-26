package step6_01.classObject;
/*
 * # 영화관 좌석예매 : 클래스 + 변수
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */


import java.util.Scanner;

//2022-10-26 오후 3시 31분 ~ 오후 3시 44분
 
 /*
class Ex07 {

	int[] seat = new int[7];
	int money = 0;
	int bookCnt = 0;
	
}
*/

class Ex07_풀이 {
	int[] seat = new int[7];
	int money = 0;
	int bookCnt = 0;
	String[] seat1 = {"X","X","X","X","X","X","X"};
}

public class ClassEx07_풀이 {

	public static void main(String[] args) {
		Ex07_풀이 mega = new Ex07_풀이();
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			for (int i = 0; i < mega.seat.length; i++) {
				System.out.print("[" + mega.seat1[i] + "]");
			}
			System.out.println();
			System.out.println("[MEGA MOVIE]");
			System.out.println("[1]좌석예매");
			System.out.println("[2]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				System.out.print("좌석을 선택해주세요(1 ~ 7): ");
				int inputSeat = scan.nextInt() - 1;
				
				if (mega.seat[inputSeat] == 0) {
					mega.seat[inputSeat] = 1;
					mega.seat1[inputSeat] = "O";
					mega.bookCnt += 12000;
				}
				else if (mega.seat[inputSeat] == 1) {
					System.out.println("이미 예약이 된 자리입니다.");
					continue;
				
				}
			}
			else if (sel == 2) {
				break;
			}
		}
		System.out.println("================");
		System.out.println("매출액: " + mega.bookCnt + "원");

	}

}
