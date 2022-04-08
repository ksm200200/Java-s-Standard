package chapter_06;

class MyMath {
	long a, b;
	
	//인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
	long add() 		{	return a + b;	}
	long subtract() {	return a - b;	}
	long multiply() {	return a * b;	}
	double divide() {	return a / b;	}
	
	
	//인스턴스변수와 관계없이 매개변수만으로 작업이 가능하다.
	static long add(long a, long b) {
		return a + b; //a, b는 지역변수	
	}
	static long substract(long a, long b) {
		return a - b; //a, b는 지역변수
	}
	static long multiply(long a, long b) {
		return a * b; //a, b는 지역변수
	}
	static double divide(double d, double e) {
		return d / e; //a, b는 지역변수
	}

}

public class MyMathTest {

	public static void main(String[] args) {
		//클래스메서드 호출, 인스턴스 생성없이 호출가능
		System.out.println(MyMath.add(200L, 100L));
		System.out.println(MyMath.substract(200L, 100L));
		System.out.println(MyMath.multiply(200L, 100L));
		System.out.println(MyMath.divide(200.0, 100.0));
		System.out.println();
		
		MyMath m = new MyMath(); //인스턴스를 생성
		m.a = 200L;
		m.b = 100L;
		
		//인스턴스 메서드는 객체생성 후에만 호출이 가능함.
		System.out.println(m.add());
		System.out.println(m.subtract());
		System.out.println(m.multiply());
		System.out.println(m.divide());
	}
}
