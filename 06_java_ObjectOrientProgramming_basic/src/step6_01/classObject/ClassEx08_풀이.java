package step6_01.classObject;
/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */

import java.util.Scanner;

/*
class Ex08{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}
*/

class Ex08_풀이 {
	String[] game = {"_", "_", "■", "_", "웃", "_", "_", "■", "_"};
}

public class ClassEx08_풀이 {

	public static void main(String[] args) {
		Ex08_풀이 dong = new Ex08_풀이();
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < dong.game.length; i++) {
			System.out.print(dong.game[i] + " ");
		}
		System.out.println();
		System.out.print("어디로 갈까요?(1 = 왼쪽으로 가기 / 2 = 오른쪽으로 가기): ");
		int move = scan.nextInt();
		
		for (int i = 0; i < dong.game.length; i++) {
			if (move == 1) {
				if (dong.game[i].equals("웃")) {
					if (!dong.game[i - 1].equals("■")) {
						dong.game[i] = "_";
						dong.game[i - 1] = "웃";
					}
					else if (dong.game[i - 1].equals("■")) {
						System.out.print("격파하시려면 3을 입력하세요: ");
						int punch = scan.nextInt();
						
						if (punch == 3) {
							dong.game[i - 1] = "_";
						}
					}
				}
			}
			else if (move == 2) {
				if (dong.game[i].equals("웃")) {
					if (!dong.game[i + 1].equals("■")) {
						dong.game[i] = "_";
						dong.game[i + 1] = "웃";
					}
					else if (dong.game[i + 1].equals("■")) {
						System.out.print("격파하시려면 3을 입력하세요: ");
						int punch = scan.nextInt();
						
						if (punch == 3) {
							dong.game[i + 1] = "_";
						}
					}
				}
			}
		}
	}

}
