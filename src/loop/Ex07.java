package loop;

public class Ex07 {

	public static void main(String[] args) {
		
		//for문
		int sum = 0;  //변수의 생애주기는 블록스코프와 연관이 있다.
		
		for (int i = 1; i <= 10; i++) { //초기화식, 조건식, 증감식
			sum = sum + i;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		//while문  -> 가독성이 떨어짐. for문을 더 많이 씀.
		int i = 1;
		int sum2 = 0;
		while (i <= 10) {
			sum2 = sum2 + i;
			i++;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}

}
