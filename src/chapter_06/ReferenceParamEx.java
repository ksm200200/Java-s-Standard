package chapter_06;



public class ReferenceParamEx {
	
	//예제 6-13
	int add(int a, int b) {
		return a + b;
	}
	//예제 6-13
	void add(int a, int b, int[] result) {
		result[0] = a + b;
	}
	
	//예제 6-12
	static void printArr(int [] arr) {
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}
	//예제 6-12
	static void sortArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length -1 -i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
	//예제 6-12
		static int sumArr(int[] arr) {
			int sum = 0;
			for(int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			return sum;
		}
	
	
		
	public static void main(String[] args) {
		
		//예제 6-13
		ReferenceParamEx r = new ReferenceParamEx();
		
		int result = r.add(3,5);
		System.out.println(result);
		
		int[] result2 = {0};
		
		r.add(3, 5, result2);
		System.out.println(result2[0]);
		
		
		/*예제 6-12
		int[]  arr = new int[] {3, 2, 1 ,6, 5, 4};
		
		printArr(arr);  // 배열의 모든 요소를 출력
		sortArr(arr);   // 배열을 정렬
		printArr(arr);  // 배열의 모든 요소를 출력
		System.out.println("sum = " + sumArr(arr));   //배열의 총합을 출력
		*/
		
		
	} 
	
	
	
	
	//예제 6-12
	
	
	
	
	
	

}
