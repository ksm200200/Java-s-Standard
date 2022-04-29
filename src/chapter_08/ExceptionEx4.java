package chapter_08;

public class ExceptionEx4 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) { 
			//예외가 발생하지 않았으므로 5출력 안함
			System.out.println(5);
		}
		System.out.println(6);
	}

}
