package conditional.quiz;

/*
 * <switch문>
 * char타입 변수를 선언하고 문자 b,c,d 중에서 하나를 입력하세요.
 * 문자에 해당하는 동물을 출력하세요.
 * 
 * b - 새
 * c - 고양이
 * d - 강아지
 * */

public class Quiz07 {

	public static void main(String[] args) {
		
		char animal = 'd';
		
		switch(animal) { // 괄호 안에 식이 아닌 변수를 작성.
		case 'b': // animal == "b" 비교값은 타입이 맞게 작성. case에 실수는 못 씀.
			System.out.println("새");
			break;
		case 'c':
			System.out.println("고양이");
			break;
		case 'd':
			System.out.println("강아지");	
		}
	}

}
