package chapter_07;

public class CastingTest1 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;	//car = (Car)fe; 에서 형변환이 생략된 형태이다.
//		car.water();	//컴파일 에러 car타입은 water() 기능이 없기때문에 사용 불가능
		fe2 = (FireEngine)car;	//조상타입 --> 자손타입
		fe2.water();	//water() 가능
	}

}

class Car {
	String color;
	int door;
	
	void drive() {			//운전하는 기능
		System.out.println("drvie, Brrrr~~" );
	}
	
	void stop() {			//멈추는 기능
		System.out.println("stop!!!!");
	}
}

class FireEngine extends Car {	//소방차
	void water() {			//물뿌리기 기능
		System.out.println("water!!!!");
	}
}
