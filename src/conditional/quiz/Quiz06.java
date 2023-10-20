package conditional.quiz;

/*
 * 학생의 점수를 저장할 변수를 선언하고 0~99 사이의 값을 저장하세요.
 * 점수가 90~99이면 "수"
 * 80~89이면 "우"
 * 70~79이면 "미"
 * 그외는 "양" 출력
 * */

public class Quiz06 {

	public static void main(String[] args) {

		int score = 50;

		if (score >= 90) {
			System.out.println("수");
		} else if (score >= 80) {
			System.out.println("우");
		} else if (score >= 70) {
			System.out.println("미");
		} else { // else -> "그외는"
			System.out.println("양");
		}
	}

}
