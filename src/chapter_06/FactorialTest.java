package chapter_06;

public class FactorialTest {
	
	
	//예제 6-18
	static long power(int x, int n) {// x^1부터 x^n까지의 합 구하기
		if(n==1) return x;         //만약 n이 1이면 x로 반환하고
		return x * power(x, n-1);  //아니면 x * power(x, n-1)
	}
	
	//예제 6-16
	static long factorial2(int n) {
		if(n<=0 || n >20) return -1;  //매개변수의 유효성 검사.
		if(n<=1) { return 1; }
		return n * factorial2(n-1);
	}

	//예제 6-15
	static int factorial(int n) {
		int result = 0;
		if(n == 1) {
			result = 1;
		} else {
			result = n * factorial(n-1);   //다시 메서드 자신을 호출한다.
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		
		int x = 2;
		int n = 5;
		long result = 0;
		
		for(int i = 1; i <= n; i++) {
			result += power(x, i);
		}
		System.out.println(result);
		
		/*예제 6-16
		int n = 21;
		long result = 0;
		
		for(int i = 1; i <= n; i++) {
			result = factorial2(i);
			
			if(result == -1) {
				System.out.printf("유효하지 않은 값입니다. (0<n<=20): %d%n", n);
				break;
			}
			System.out.printf("%2d!=%20d%n", i, result);  //n팩토리얼 값
		}
		*/
		
		/*예제 6-15
		int result = factorial(2);
		System.out.println(result);
		*/
	}
}
