 package step6_02.method;

//2022-10-28 오후 4시 00분 ~ 오후 4시 29분
 
import java.util.Scanner;

/*
 * # 영화관 좌석예매 : 클래스 + 메서드
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

class Theater_풀이{
	
	Scanner scan = new Scanner(System.in);
	String[] seat = new String[10];
	String[] temp = new String[10];
	int bookCnt = 0;				
	int money = 0;					
	
	void showMenu() {
		
		System.out.println("=== 메가박스 ===");
		System.out.println("1.예매하기");
		System.out.println("2.종료하기");
		
	}
	
	
	
	void showSeat() {
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == null) {
				seat[i] = "[X]";
			}
			
		}
		System.out.println();
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + " ");
		}
		System.out.println();
	}
	
	void choiceSeat() {
		// 좌석 현황 출력하기
		
		System.out.print("좌석번호를 선택하세요[1 ~ 10]: ");
		int seatNumber = scan.nextInt() - 1;
		System.out.println();
		
		if (seat[seatNumber] == "[X]") {
			for (int i = 0; i < seat.length; i++) {
				temp[i] ="[O]";
			}
			
			seat[seatNumber] = temp[seatNumber];
			money += 12000;
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
				
			}
			System.out.println();
			System.out.println("예매를 완료하였습니다.");
			System.out.println();
		}
		
		else if (seat[seatNumber] == "[O]") {
			System.out.println("이미 예약된 자리입니다. 다시 선택해주세요.");
			System.out.println();
		}
		
		
		
	}
	
	
	
	void showSales() {
		System.out.println();
		System.out.println("총 매출 금액 = " + money + "원");
	}
	
	void run() {
		
		while (true) {
			
			// 메뉴 출력
			showMenu();
			
			// 메뉴 선택하기
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			// 예매하기
			if (choice == 1) {
				showSeat();
				choiceSeat();
			}
			// 종료하기
			else if (choice == 2) {
				// 매출 현황 출력하기
				showSales();
				
				System.out.println("프로그램 종료");
				break;
			}
			
		}
	}
}

public class MethodEx14_풀이 {

	public static void main(String[] args) {

		Theater_풀이 megabox = new Theater_풀이();
		megabox.run();
		
	}

}
