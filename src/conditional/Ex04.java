package conditional;

public class Ex04 {

	public static void main(String[] args) {

		int rank = 5; // 순위

		//변수와 값이 일치하는 .case문을 실행한다.
		switch (rank) {
		case 1: //rank 값이 1이면
			System.out.println("메달의 색은 금입니다");
			break;
		case 2: //rank 값이 2이면
			System.out.println("메달의 색은 은입니다");
			break; // break문을 만나고 switch문을 완전히 빠져 나간다.
		case 3: //if(rank==3)
			System.out.println("메달의 색은 동입니다");
			break;
		default: //변수와 일치하는 값이 없으면
			System.out.println("메달이 없습니다");
		}

	}

}
