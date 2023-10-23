package loop;

public class Ex09 {

	public static void main(String[] args) {
		
		int sum = 0; // 합계
		int i; //마지막에 i의 값을 출력하기 위해 외부에 선언
		
		for(i = 1; i <= 20; i++) { // i가 1부터 20이 될 때까지 총 20번 수행함
			
			sum = sum + i; // sum을 먼저 구해줘야 함.
			//System.out.println("i: " + i + " , sum: " + sum);  <- 중간에 수행과정을 확인하기 위한 코드
			if (sum >= 100) { // 합이 100을 넘으면 종료
				break;
			}
			
		//	sum = sum + i;  여기에 sum 값을 넣으면 for문에서 i를 마지막에 1번 더 증감시킴
		}	
		
		System.out.println("i : " + i); // 14
		System.out.println("sum : " + sum); // 1~14까지의 합은 105
	}

}
