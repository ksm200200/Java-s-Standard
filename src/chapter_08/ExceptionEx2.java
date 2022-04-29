package chapter_08;

public class ExceptionEx2 {
	
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
			result = number / (int)(Math.random() * 10);  // 100 나누기 (0~9)
			System.out.println(result); //0으로 나눌시 오류
		}
	}

}
