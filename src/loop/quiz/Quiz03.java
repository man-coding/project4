package loop.quiz;

/*
 * 정수형 변수 n을 선언하고
 * n의 크기만큼 *을 출력하세요.
 * */

public class Quiz03 {

	public static void main(String[] args) {
		
		int n = 5;   // 조건식에서 반복수(범위)에 해당. 
		int i; // i 변수를 밖에서 선언하면 for문 밖에서도 실행이 가능.
		
		for(i = 1; i <= n; i++ ) {
			System.out.print("*");  //한 줄로 출력하려면 ln을 뺌. i 변수를 밖에서 선언하면 for문 밖에서도 실행이 가능.
		}
		System.out.println(i);
	}

}
