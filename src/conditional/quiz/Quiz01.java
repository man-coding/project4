package conditional.quiz;

/*
 * <if문>
 * int형 변수를 선언하고 값을 대입하세요.
 * 그리고 조건문을 사용해서 변수의 값이 2의 배수거나 3의 배수라면 "2 또는 3의 배수입니다"를 출력하세요.*/

public class Quiz01 {

	public static void main(String[] args) {

		int i = 7588495;

		// 2의 배수 -> 2로 나머지를 구할 때 0으로 떨어진다
		if (i % 2 == 0 || i % 3 == 0) {
			System.out.println("2 또는 3의 배수입니다");
		}

	}
}
