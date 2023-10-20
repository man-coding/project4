package conditional.quiz;

public class Quiz08 {

	public static void main(String[] args) {
		
		int score = 65;
		int value = score / 10;   // 10으로 나누면 나머지는 빼고 10의 자리만 출력됨.
		
//		int value2;
//		if(score>=90) {value2=1;}//
//		if(score>=80) {value2=2;}//
//		if(score>=70) {value2=3;}//
//		if(score<70) {value2=4;}//  집 가서 풀어보기
	
		
		switch (value) {
		case 9 : // 90~99
			System.out.println("수");
			break;
		case 8 : // 80~89
			System.out.println("우");
			break;
		case 7 : // 70~79
			System.out.println("미");
			break;
		default : // ~
			System.out.println("양");
			
		
			
			
		
		}
		//조건이 90<=score<=99와 같이 포괄적인 범위일 때는 if문을 사용한다
				//switch문은 조건이 하나의 값으로 구분되는 경우에 사용한다
				//따라서 switch문을 사용하여 조건을 구현하려면 값이 구분되도록 만들어야 한다
				//점수의 범위로 몫을 구한 다음에 조건으로 사용한다
				//이와같이 조건이 복잡한 경우에는 switch문보다는 if문이 편리하다
	}

}
