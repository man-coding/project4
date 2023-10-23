package loop.quiz;

public class Quiz06 {

	public static void main(String[] args) {

		int sum = 0;
		int i; // 마지막에 i 값을 출력할 수 있도록 변수를 밖에다 선언해준다.  i는 더할 수.

		for (i = 1; i <= 100; i++) {
			sum = sum + i;

			if (sum >= 500) {
				break;
			}
		}
		System.out.println(i);
		System.out.println(sum);
	}

}
