package loop.quiz;

public class Quiz01 {

	public static void main(String[] args) {
		
		int sum = 0;    // 합을 구할 땐 변수를 0으로 초기화할 것.
		int num = 10;   // 시작값을 10으로 초기화
		
		while(num <= 20) {
			sum = sum + num;
			num++;   // num = num +2;  로 하면 5번 실행함(?)  10 + 12 + 14 + ...
		}
		System.out.println(sum);
	}

}
