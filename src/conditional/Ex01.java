package conditional;

public class Ex01 {

	public static void main(String[] args) {

		int age = 10; // 7로 바꿔보기
		if (age >= 8) { // 나이가 8살 이상이면
			System.out.println("학교에 다닙니다");
		}

		// 블록의 의미
		if (age >= 8) {
			int temp = 0; // temp는 블록이 끝나기 전까지만 존재함 -> 지역변수이기 때문.
			System.out.println();
		}
		System.out.println(); // 변수가 소멸되어 에러남

	}

}
