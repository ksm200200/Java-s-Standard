package chapter_03;

public class Main {
	public static void main(String[] args) {
		
		/*int i = 5;
		i++;
		System.out.print(i);
		
		System.out.print("");
		
		i = 5;
		++i;
		System.out.print(i);*/
		
		/*
		int i = 5, j = 0;
		//i값을 j에 먼저 대입 후 i값 증가
		j = i++;
		System.out.println("j=i++; 실행 후, i = " + i +", j=" +j);
		
		i = 5;
		j = 0;
		//i값을 증가 시킨 후에 j에 대입
		j = ++i;
		System.out.print("j=++i; 실행 후, i = " + i +", j=" +j);*/
		
		
		//부호 연산자
		/*int i = -10;
		//+연산자는 하는 일이없다.
		i = +i;
		System.out.println(i);
		
		i = -10;
		//-연산자는 피연산자의 부호를 반대로 변경시킨다.
		i = -i;
		System.out.println(i);*/
		
		
		//산술 연산자
		/*int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);*/
		
		/*byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b);
		//10 * 30 = 300이지만 300은 byte형의 범위를 넘기 때문엥 byte형으로 변환하면
		//데이터 손실이 발생하여 결국 44가 byte형 변수 c에 저장된다.
		System.out.print(c);*/
		
		/*int a = 1_000_000; //1,000,000 1백만
		int b = 2_000_000; //2,000,000 2백만
		
		long c = a * b; //a * b = 2,000,000,000,000?
		//c의 자료형이 long타입이기 때문에 충분히 값이 들어갈 것 같지만 그렇지않다.
		//이유는 int형 * int형 연산결과는 int형이기 때문에 이미 값이 int형 값 이므로
		// long형으로 자동 형변환 되어도 값은 변하지 않는다.
		System.out.print(c); // -1454759936*/
		/*
		char a = 'a';
		char d = 'd';
		char zero = '0';
		char two = '2';
		
		System.out.printf("'%c' - '%c' = %d%n", d, a, d - a);//4 - 1 = 3
		System.out.printf("'%c' - '%c' = %d%n", two, zero, two - zero );
		System.out.printf("'%c' = %d%n", a, (int)a);
		System.out.printf("'%c' = %d%n", d, (int)d);
		System.out.printf("'%c' = %d%n", zero, (int)zero);
		System.out.printf("'%c' = %d%n", two, (int)two);*/
		
		/*
		char c1 = 'a';
		//char c2 = c1 + 1; 컴파일 에러
		char c2 = (char)(c1 + 1);
		char c3 = 'a' + 1; //리터럴간의 연산
		System.out.println(c2);
		System.out.print(c3);*/
		
		char c = 'a';
		for(int i = 0; i < 26; i++) {
			System.out.print(c++);
		}
		System.out.println();
		
		c = 'A';
		for(int i = 0; i < 26; i++) {
			System.out.println(c++);
		}
		System.out.println();
		
		c = '0';
		for(int i = 0; i < 10; i++) {
			System.out.println(c++);
		}
		
		
		
	}

}
