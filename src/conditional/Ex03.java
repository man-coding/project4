package conditional;

public class Ex03 {

	public static void main(String[] args) {
		
		int age = 25;
		
		if (age < 8) { // 1~7 -> age < 8  ** false 이므로 age>=8 이 된다.
			System.out.println("미 취학 아동입니다.");
		} else if (age < 14) { // 8~13 -> age>=8 && age < 14  **첫번째 조건에서 false가 나왔기 때문에 age >= 8 조건 필요없음.
			System.out.println("초등학생입니다.");
		} else if (age < 20) { //
			System.out.println("중, 고등학생입니다.");
		} else { //모두 아니라면
			System.out.println("성인입니다.");
		}
		//어떤 조건을 만족하면, 다음 조건을 비교하지 않고 조건문이 종료된다.
	}

}
