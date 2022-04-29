package chapter_08;

public class ExceptionEx5 {
	

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); //0으로 나눠서 고의로 ArithmeticException을 발생
			System.out.println(4);   //실행되지 않는다.
		}catch (ArithmeticException ae) {
			// (0/0)을 출력할 때 예외가 발생하여 5출력
			System.out.println(5);
		}
		System.out.println(6);
	}
}
