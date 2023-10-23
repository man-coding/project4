package loop.quiz;

/*
 * 
 * 1~100 중 3의 배수만 출력
 * 
 * */

public class Quiz05 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) { //i가 100될 때까지 총 100번 수행
			if (i % 3 == 0) { //i가 3의 배수가 아니면 다음 코드를 스킵
				System.out.println(i);

			}
			

		}

	}
}
