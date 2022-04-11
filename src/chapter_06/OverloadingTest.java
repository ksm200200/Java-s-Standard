package chapter_06;

class MyMath {
	int add(int a, int b) {
		System.out.print("int add(int a int b) = ");
		return a+b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) = ");
		return a + b;
	}
	
	long add(long a, int b) {
		System.out.print("long add(long a, int b) = ");
		return a + b;
	}
	
	long add(long a, long b) {
		System.out.print("long add(long a, long b = ");
		return a + b;
	}
	
	int add(int[] a) {
		System.out.print("int add(int[] a) = ");
		int result = 0;
		for(int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
}


public class OverloadingTest {
	
	public static void main(String args[]) {
		
		MyMath mm = new MyMath();
		System.out.println("m.add(3, 3) 결과: " + mm.add(3, 3));
		System.out.println("m.add(3, 3) 결과: " + mm.add(3L, 3));
		System.out.println("m.add(3, 3) 결과: " + mm.add(3, 3L));
		System.out.println("m.add(3, 3) 결과: " + mm.add(3L, 3L));
		//println보다 add메서드가 더 먼저 출력이된다.
		
	}

}
