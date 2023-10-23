package loop;

public class Ex10 {

	public static void main(String[] args) {

		// 외부 for문에서 2단부터 9단까지 총 8번 수행함.
		for (int dan = 2; dan <= 9; dan++) {
			for (int times = 1; times <= 9; times++) {
				// 내부 for문에서 곱하는 수 1부터 9까지 총 9번 수행함 (내부 for문이 끝날 때까지 수행)
				System.out.println(dan + "X" + times + "=" + dan * times);

			}

			System.out.println();
		}

		// 2단 출력이 끝나면 다시 외부 for문으로 돌아간다.
	}

}
