package loop.quiz;

public class Quiz102 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			// 공백문자
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" "); // 4 3 2 1
			}

			// 별
			for (int j = 1; j <= i; j++) {
				System.out.print("*"); // 1 2 3 4
			}
			System.out.println();
		}
		
	}

}
