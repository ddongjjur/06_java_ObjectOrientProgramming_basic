package step6_02.method;


//2022-10-26 오후 5시 33분 ~ 오후 5시 37분, 오후 10시 49분 ~ 오후 11시 30분

import java.util.Random;
import java.util.Scanner;


class Ex09 {

	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	//문제 1)
	void setRandomValuesinArray(int [] scores) {
		for (int i = 0; i < scores.length; i++) {
			scores[i] = ran.nextInt(100) + 1;
		}
		System.out.print("랜덤 정수를 5개: ");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		System.out.println();
	}
	
	//문제 2)
	void printSumAndAverage (int [] scores) {
		int total = 0;
		
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		System.out.println("전교생의 총점: " + total + " / 전교생의 평균: " + (total / scores.length));
		System.out.println();
	}
	
	//문제 3) 성적이 60점 이상이면 합격이며 합격생 수를 출력하는 메서드
	void printWinner (int [] scores) {
		int passStudent = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 60) {
				passStudent++;
			}
		}
		System.out.println("성적이 60점 이상인 합격생 수: " + passStudent + "명");
		System.out.println();
	}
	
	//문제 4) 인덱스를 입력받아 성적 출력하는 메서드
	void printScore1 (int [] scores) {
		System.out.print("성적을 출력할 인덱스: ");
		int inputIdx = scan.nextInt();
		
		System.out.println(scores[inputIdx] + "점");
		System.out.println();
	}
	
	//문제 5) 성적을 입력받아 인덱스 출력하는 메서드
	void printScore2 (int [] scores) {
		System.out.print("인덱스를 출력할 성적입력: ");
		int inputScore = scan.nextInt();
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == inputScore) {
				System.out.println("인덱스: " + i);
			}
		}
		System.out.println();
	}
	
	//문제 6) 학번을 입력받아 성적 출력하는 메서드 // 단, 없는학번 입력 시 예외처리
	void printScore3(int [] hakbuns, int [] scores) {
		System.out.print("학번을 입력하세요: ");
		int inputHakbun = scan.nextInt();
		int error = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (inputHakbun < hakbuns[hakbuns.length - 1] && inputHakbun >= hakbuns[0]) {
				if (hakbuns[i] == inputHakbun) {
					System.out.println("성적: " + scores[i] + "점");
				}
			}
			else {
				error = 1;
				continue;
			}
		}
		if (error == 1) {
			System.out.println("없는 학번입니다.");
		}
		System.out.println();
	}
	
	//문제 7) 1등학생의 학번과 성적 출력하는 메서드
	void printNumberOne (int [] hakbuns, int [] scores) {
		int bestStudent = 0;
		int bestScore = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (bestScore < scores[i]) {
				bestScore = scores[i];
				bestStudent = hakbuns[i];
			}
		}
		System.out.println("1등학생의 학번과 성적: " + bestStudent + "번 / " + bestScore + "점");
	}
	
}



public class MethodEx09_풀이 {

	public static void main(String[] args) {
		
		Ex09 e = new Ex09();
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores  = new int[5];
		
		
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장하는 메서드
		// 예 1) 87, 11, 92, 14, 47
		e.setRandomValuesinArray(scores);
		
		// 문제2) 전교생의 총점과 평균 출력하는 메서드
		// 예 2) 총점(251) 평균(50.2)
		e.printSumAndAverage(scores);
		
		// 문제3) 성적이 60점 이상이면 합격이며 합격생 수를 출력하는 메서드
		// 예 3) 2명
		e.printWinner(scores);
		
		// 문제4) 인덱스를 입력받아 성적 출력하는 메서드
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		e.printScore1(scores);
		
		// 문제5) 성적을 입력받아 인덱스 출력하는 메서드
		// 정답5) 성적 입력 : 11 인덱스 : 1
		e.printScore2(scores);

		// 문제6) 학번을 입력받아 성적 출력하는 메서드 // 단, 없는학번 입력 시 예외처리
	    // 단, 없는학번 입력 시 예외처리
		// 정답6) 학번 입력 : 1003 성적 : 45점
		e.printScore3(hakbuns, scores);

		// 문제7) 1등학생의 학번과 성적 출력하는 메서드
		// 정답7) 1004번(98점)
		e.printNumberOne(hakbuns, scores);
		
	}

}
