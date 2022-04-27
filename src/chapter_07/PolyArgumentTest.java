package chapter_07;

class Product {
	int price;			//제품의 가격
	int bonusPoint;		//제품 구매시 제공되는 보너스 점수
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);  //보너스점수는 제품가격의 10%
	}
	
}

class Tv extends Product {
	
	Tv() {
		//조상클래스의 생성자 Prodcut(int price)를 호출한다.
		super(100);	//Tv의 가격을 100만원으로 한다.
	}
	
	public String toString() { 
		return "TV";
	}
}

class Computer extends Product {

	Computer() { 
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	int i = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;			//가진 돈에서 제품의 가격을 뺸다
		bonusPoint += p.bonusPoint; //제품의 보너스 점수 추가
		System.out.println(p + "을/를 구입하셨습니다.");
	}
}



public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
	}

}
