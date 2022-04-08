package chapter_06;

public class MeberCall {

	int iv = 10;          //인스턴스 변수
	static int cv = 20;   //클래스 변수
	
	void instanceMethod() {}       //인스턴스 메서드
	static void staticMethod( ) {} //static 메서드
	
	void instanceMethod2() {  //인스턴스메서드 
		instanceMethod();     // 다른 인스턴스메서드를 호출한다.
		staticMethod();       //static 메서드를 호출한다
	}
	
	static void staticMethod2() {  //static 메서드
	    //instanceMethod();           //에러!! static메서드 안에서는 static만 사용할 수 있다.
		staticMethod();             //static메서드 호출 가능.
	}
	static void print() {
		//System.out.println(iv);  //인스턴스 변수 사용 불가
		System.out.println(cv);  //클래스 변수 사용 가능
	}
	
	
	
	
	
	public static void main(String[] args) {
		
	}
}
