package step6_02.method;

/*
 * 
 * # return
 *   
 * 	1) 값을 반환한다.
 *  2) 메서드를 종료한다.
 *  3) 메서드에서의 return 값은 1개이다. 
 *  
 * */

class ReturnEx {
	
	void setScore1(int score1) {
		score1 = 100;
	}
	
	
	int setScore2(int score2) {
		score2 = 100;
		return score2;
	}
	
	
	int testReturn() {
		
		System.out.println("리턴 전 명령어1");
		System.out.println("리턴 전 명령어2");
		System.out.println("리턴 전 명령어3");
		
		// return 1,2,3,4,5; // 복수의 return값은 불가능하므로 error 발생
		return 0;		// == break;
		
		// return을 만나는 순간 메서드가 종료되므로 아래의 코드에서 unreachable error 발생
//		System.out.println("리턴 후 명령어1");
//		System.out.println("리턴 후 명령어2");
//		System.out.println("리턴 후 명령어3");
	}
	
	
}


public class MethodEx03 {

	public static void main(String[] args) {
		
		ReturnEx ex = new ReturnEx();
		
		int score1 = 87;
		System.out.println("메서드 호출 전 score1: " + score1); // 87
		
		ex.setScore1(score1);
		System.out.println("메서드 호출 후 score1: " + score1); // 87
		
		System.out.println();
		
		int score2 = 87;
		System.out.println("메서드 호출 전 score2: " + score2); // 87
		
		ex.setScore2(score2);
		System.out.println("메서드 호출 후 score2: " + score2); // 87
		
		score2 = ex.setScore2(score2);
		
		System.out.println("메서드 호출 후 score2: " + score2); // 100
		
		System.out.println("\n============================\n");
		
		System.out.println(ex.setScore2(999999));
		
		int result = ex.setScore2(99999);
		System.out.println(result);
		
		if(ex.setScore2(99999) == 100) {
			System.out.println("참");
		}

	}

}
