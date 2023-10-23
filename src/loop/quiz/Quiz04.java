package loop.quiz;

/*
 * 
 * 1~100 중에 2의 배수만 출력
 * 
 * */

public class Quiz04 {

	public static void main(String[] args) {

		int n = 100;

		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
