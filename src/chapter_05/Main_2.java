package chapter_05;

import java.util.Arrays;

public class Main_2 {
	
	public static void main(String args[]) {
		
		//예제 5-11 빈도수 구하기
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 10);
			System.out.println(numArr[i]);
		}
		System.out.println();
		
		for(int i = 0; i < numArr.length; i++) {
			counter[numArr[i]]++;
		}
		for(int i = 0; i < numArr.length; i++) {
			System.out.println(i + "의개수: " + counter[i]);
		}
		
		
		/*예제 5-10 정렬하기	
		int[] numArr = new int[10];		
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random() * 10));		
		}
		System.out.println();
		
		for(int i = 0; i < numArr.length - 1; i++) { // 비교횟수 : 배열의 길이 - 1
			boolean changed = false;   //자리바꿈이 발생했는지를 체크한다.
			
			for(int j = 0; j < numArr.length -1-i; j++) {
				if(numArr[j] > numArr[j+1]) { // 옆의 값이 작으면 서로 바뀐다.
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;          //자리바꿈이 발생했으니 changed를 true로
				}
			}
			
			//자리 바꿈이 없다는 뜻은 정렬이 완료되었다는 뜻이다.
			if(!changed) break; //자리바꿈이 없으면 반복문을 벗어난다.
			
			
			for(int k = 0; k < numArr.length; k++) {
				System.out.print(numArr[k]);
			}
			System.out.println();
		}
		*/
		
		/*예제 5-9 임의의 값으로 배열 채우기
		int[] code = {-4, -1, 3, 6, 11};
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int tmp = (int)(Math.random() * code.length);
			arr[i] = code[tmp];
		}
		System.out.println(Arrays.toString(arr));
		*/
		
		
		/*예제 5-8 섞기2(Shuffle) 로또번호 생성 예제
		int[] ball = new int[45];
		
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i+1;
		}
		int temp = 0; //두 값을 바꾸는데 사용할 임시변수
		int j = 0;  //임의의 값을 얻어서 저장할 변수
		
		//배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
		//0번째 부터 5번째 요소까지 얻어서 저장할 변수
		for(int i = 0; i < 6; i++) {
			j = (int)(Math.random() * 45); //0~44범위를 얻는다.
			//ball[i]와 ball[j]의 값을 서로 바꾸는 작업이다.
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		for(int i = 0; i < 7; i++) {
			System.out.println("ball["+i+"]: " + ball[i]);
		}
		*/
		
		
		/*예제 5-7 섞기1(Shuffle)
		int[] numArr = new int[10];
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i; //배열을 0~9로 초기화한다.
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i = 0; i < 100; i++) {
			int n = (int)(Math.random() * 10);
			int tmp = numArr[0];
			numArr[0]  = numArr[n];
			numArr[n] = tmp;
		}
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
		*/
		
		/* 예제 5-6 최대값과 최소값
		int[] score = {79, 88, 91, 33, 99, 55, 95};
		
		int max = score[0]; //배열의 첫 번째 값으로 최대값을 초기화
		int min = score[0]; //배열의 첫 번째 값으로 최소값을 초기화
		
		for(int i = 1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min );
		*/
		
		
		/* 5-5 예제 총합과 평균
		int sum = 0;
		float average = 0f;
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		average = sum / (float)score.length;
		System.out.println("총점: "+ sum);
		System.out.println("평균: "+ average);
		*/
	
		
	
	
	}
	
	
}
