package step6_01.classObject;

import java.util.Random;

//2022-10-26 오후 3시 10분 ~ 오후 3시 29분

/*
 * # OMR카드 : 클래스 + 변수
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
 */

/*
class Ex06{
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	
	int answerCnt = 0;					// 정답 맞춘 개수
	int score = 0;						// 성적
}
*/

class Ex06_풀이 {
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	String[] testAnswer = {"X", "X", "X", "X", "X"};	// 정오표
	
	int answerCnt = 0;					// 정답 맞춘 개수
	int score = 0;						// 성적
}

public class ClassEx06_풀이 {

	public static void main(String[] args) {
		
		Ex06_풀이 e = new Ex06_풀이();
		Random ran = new Random();
		
		for (int i = 0; i < e.hgd.length; i++) {
			e.hgd[i] = ran.nextInt(5) + 1;
		}
		
		for (int i = 0; i < e.answer.length; i++) {
			if (e.hgd[i] == e.answer[i]) {
				e.testAnswer[i] = "O";
				e.answerCnt++;
				e.score += 20;
			}
		}
		System.out.print("정답: ");
		for (int i = 0; i < e.hgd.length; i++) {
			System.out.print(e.answer[i] + " ");
		}
		System.out.println();
		System.out.print("학생: ");
		for (int i = 0; i < e.hgd.length; i++) {
			System.out.print(e.hgd[i] + " ");
		}
		System.out.println();
		System.out.print("정오표: ");
		for (int i = 0; i < e.answer.length; i++) {
			System.out.print(e.testAnswer[i] + " ");
		}
		System.out.println();
		System.out.println("맞춘 갯수: " + e.answerCnt + "개");
		System.out.println("성적: " + e.score + "점");
		
	}

}
