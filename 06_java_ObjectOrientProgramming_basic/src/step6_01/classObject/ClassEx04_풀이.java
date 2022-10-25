package step6_01.classObject;

import java.util.Random;
import java.util.Scanner;

//2022-10-25 오후 5시 21분 ~ 오후 5시 

/*
class Ex04 {

	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];
	
}
*/

class Ex04_풀이 {
	
	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];
	
}


public class ClassEx04_풀이 {

	public static void main(String[] args) {
		
		Ex04_풀이 e = new Ex04_풀이();
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		
		Random ran = new Random();
		
		for (int i = 0; i < e.scores.length; i++) {
			e.scores[i] = ran.nextInt(100) + 1;
		}
		for (int i = 0; i < e.scores.length; i++) {
			System.out.print(e.scores[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		
		int totalScore = 0;
		
		for (int i = 0; i < e.scores.length; i++) {
			totalScore += e.scores[i];
		}
		
		System.out.println("총점: " + totalScore + " 평균: " + (totalScore / 5));
		System.out.println();
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int pass = 0;
		
		for (int i = 0; i < e.scores.length; i++) {
			if (e.scores[i] >= 60) {
				pass++;
			}
		}
		System.out.println("합격자: " + pass + "명");
		System.out.println();
		
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("인덱스 입력: ");
		int inputIdx = scan.nextInt();
		
		for (int i = 0; i < e.scores.length; i++) {
			if (inputIdx > e.scores.length - 1 || inputIdx < 0) {
				System.out.println("다시 입력해주세요");
				continue;
			}
			
			else {
				System.out.println("성적: " + e.scores[inputIdx]);
				break;
			}
		}
		System.out.println();
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		
		
		System.out.print("성적을 입력: ");
		int inputScore = scan.nextInt();
		
		for (int i = 0; i < e.scores.length; i++) {
			if (inputScore == e.scores[i]) {
				System.out.println("인덱스: " + i);
			}
		}
		System.out.println();
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 45점
		
		System.out.print("학번 입력: ");
		int inputHakbun = scan.nextInt();
		
		for (int i = 0; i < e.hakbuns.length; i++) {
			if (inputHakbun == e.hakbuns[i]) {
				System.out.println("성적: " + e.scores[i]);
				System.out.println();
			}
			
		}
		if (inputHakbun < e.hakbuns[0] || inputHakbun > e.hakbuns[e.hakbuns.length -1]) {
			System.out.println("해당 학번은 존재하지 않습니다.");
		}
		System.out.println();
			
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		
		
		
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		int bestStudent = 0;
		int bestScore = 0;
		
		for (int i = 0; i < e.scores.length; i++) {
			if (bestScore < e.scores[i]) {
				bestScore = e.scores[i];
				bestStudent = e.hakbuns[i];
			}
		}
		System.out.println("1등 학생: " + bestStudent + " 점수: " + bestScore);
		
	}

}
