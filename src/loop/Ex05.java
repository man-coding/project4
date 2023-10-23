package loop;

public class Ex05 {

	public static void main(String[] args) {
		
		//초기화, 조건, 증감
		for(int i = 11; i <= 21; i++) { // i가 1부터 10까지 1씩 증가되므로, 
			//블록을 10번 실행한다. i의 용도 파악이 가장 중요. i는 지역변수이므로 변수선언x
			//(평가, 출력, 증감까지가 1번 반복임.)
			System.out.println("안녕하세요");
		}
	}

}
