package loop.quiz;

public class Quiz10 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			
			for (int a = 1; a <= i; a++) {  // "a <= i"  중요!
				System.out.print("*"); // 1 2 3 4 5
			}
			System.out.println();
		}
		System.out.println();
		
	
	
	}
}
