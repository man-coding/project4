package loop;

public class Ex08 {

	public static void main(String[] args) {

		int sum = 0; // 합계

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue; // 다음 코드를 수행하지 않는다.

			}
			
			sum = sum + i; // i이 홀수라면 sum에 더하기
		}

		System.out.println("1부터 10까지의 홀수들의 합은 " + sum + "입니다.");
	}

}
