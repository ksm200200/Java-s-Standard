package chapter_06;

class Data {
	int x;
}

public class ReferenceReturnEx {
	
	static Data copy(Data d) {
		Data tmp = new Data();    //새로운 객체 tmp 생성
		tmp.x = d.x;              //d.x의 값을 tmp.x에 넣는다.
		 
		return tmp;               //객체의 주소 반환.
	}
	
	
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		Data d2 = copy(d);
		System.out.println("d.x = " + d.x );
		System.out.println("d2.x = " + d2.x);
	}
}
