package step6_02.method;

//2022-10-28 오후 3시 20분 ~ 오후 3시 57분

import java.util.Random;
/*
 * # OMR카드 : 클래스 + 메서드
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표 = {O, X, O, X, X}
 * 성적   = 40점
 */


class ScoreMng_풀이 {

	
	Random ran = new Random();
	int size = 5;
	int[] omrcard = new int[5];
	int[] answerCard = new int[5];
	String[] answer = new String[5];
	int score = 0;
	
	// 1.me 답안 완성하기
	void omr() {
			
		for (int i = 0; i < size; i++) {
			omrcard[i] = ran.nextInt(5) + 1;
		}
		System.out.print("omr = [");
		for (int i = 0; i < size; i++) {
			System.out.print(omrcard[i] + " ");
		}
		System.out.println("]");
		
	}
	
	// 2.정답 출력하기
	void answerNum() {
		
		
		for (int i = 0; i < size; i++) {
			answerCard[i] = ran.nextInt(5) + 1;
		}
		System.out.print("rNum = [");
		for (int i = 0; i < size; i++) {
			System.out.print(answerCard[i] + " ");
		}
		System.out.println("]");
	}
	
	// 3.정답 비교하기
	
	void answerCheck() {
		
		for (int i = 0; i < size; i++) {
			if (omrcard[i] == answerCard[i]) {
				answer[i] = "O";
				score += 20;
			}
			else if (omrcard[i] != answerCard[i]) {
				answer[i] = "X";
			}
		}
		System.out.print("정오표 = [");
		for (int i = 0; i < size; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.println("]");
		System.out.println("점수 = " + score + "점");
	}
	
	// 4.실행하기
	
	void run () {
		omr();
		answerNum();
		answerCheck();
		
	}
	
}

public class MethodEx13_풀이 {

	public static void main(String[] args) {
		
		ScoreMng_풀이 sm = new ScoreMng_풀이();
		sm.run();

	}

}
