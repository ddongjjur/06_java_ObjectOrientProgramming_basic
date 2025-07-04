package step6_01.classObject;

//2022-10-25 오후 9시 44분 ~ 오후 10시 03분

import java.util.Scanner;

/*
 * # 학생성적 관리 프로그램[3단계] : 클래스 + 변수
 * 1. 학번을 입력하면, 해당 학생의 성적이 출력된다.
 * 2. 단, 없는 학번 입력에 관한 예외상황을 반드시 처리해야 한다.
 * 3. 1등과 꼴등 학생의 정보를 확인할 수 있다.
 */

/*
class Ex05{
	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}
*/

class Ex05_풀이 {
	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};
	
}


public class ClassEx05_풀이 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);

		Ex05_풀이 mega = new Ex05_풀이();
		mega.name = "메가IT 고등학교";
		
		while (true) {
			
			// 메뉴 출력
			System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			
			// 메뉴 선택
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			if		(choice == 1) {
				int totalScore = 0;
				
				for (int i = 0; i < mega.arScore.length; i++) {
					if (totalScore < mega.arScore[i]) {
						totalScore += mega.arScore[i];
					}
				}
				System.out.println("전교생 수: " + mega.arScore.length + "명");
				System.out.println("총점: " + totalScore + "점");
				System.out.println("평균: " + (totalScore / mega.arScore.length) + "점");
				System.out.println();
			}
			else if (choice == 2) {
				System.out.println("=== 1등 ===");
				int bestStudent = 0;
				int bestScore = 0;
				
				for (int j = 0; j < mega.arScore.length; j++) {
					if (bestScore < mega.arScore[j]) {
						bestScore = mega.arScore[j];
						bestStudent = mega.arHakbun[j];
					}
				}
				System.out.println("학번: " + bestStudent);
				System.out.println("성적: " + bestScore);
				System.out.println();
			}
			else if (choice == 3) {
				int worstStudent = 100000;
				int worstScore = 100000;
				
				for (int i = 0; i < mega.arScore.length; i++) {
					if (worstScore > mega.arScore[i]) {
						worstScore = mega.arScore[i];
						worstStudent = mega.arHakbun[i];
					}
				}
				System.out.println("=== 꼴등 ===");
				System.out.println("학번: " + worstStudent);
				System.out.println("성적: " + worstScore);
				System.out.println();
			}
			
			else if (choice == 4) {
				System.out.print("학번을 입력하세요: ");
				int inputHakbun = scan.nextInt();
				
				if (inputHakbun <= mega.arHakbun[mega.arHakbun.length - 1] && inputHakbun >= mega.arHakbun[0]) {
					for (int i = 0; i < mega.arHakbun.length; i++) {
						if (inputHakbun == mega.arHakbun[i]) {
							System.out.println(inputHakbun + "학번의 학생의 성적은 " + mega.arScore[i] + "점 입니다.");
							System.out.println();
						}
					}
				}
				else {
					System.out.println("학번을 잘못 입력하였습니다.");
					System.out.println();
				}
				
			}
			else if (choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		scan.close();

	}

}
