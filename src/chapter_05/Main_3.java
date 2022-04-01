package chapter_05;

import java.util.Scanner;

public class Main_3 {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		/*예제 5-19 
		int[] [] score = {
							{100, 100, 100},
							{20, 20, 20},
							{30, 30, 30},
							{40, 40, 40},
							{50, 50, 50}
						};
		//과목별 총점
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		
		System.out.println("번호   국어   영어   수학   총점   평균");
		System.out.println("===============================");
		
		for(int i = 0; i < score.length; i++) {
			int sum = 0;   //개인별 총점
			float avg = 0.0f;  //개인별 평균
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d", i+1);
			
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]);
			}
			avg = sum/(float)score[i].length;    //평균계산
			System.out.printf("%5d % 5.1f%n", sum, avg);
		}
		System.out.println("=================================");
		System.out.printf("총점: %3d %4d %4d%n", korTotal, engTotal, mathTotal);
		*/
		
		
		
		/*예제 5-19
		int[] [] score = {
							{100, 100, 100},
							{20, 20, 20},
							{30, 30, 30},
							{40, 40, 40}
							
						};
		
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d] [%d] = %d%n", i, j, score[i][j]);
			}
		}
		for(int[] tmp : score) {
			for(int i : tmp) {
				sum += i;
			}
		}
		System.out.println("sum= " + sum);
		*/
		
		/* 예제 5-16
		System.out.println("매개변수의 개수: " + args.length);
		for(int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] = \""+args[i] + "\"");
		}*/
		
		
		
		/*예제 5-14 char배열과 String클래스의 변환
		String src = "ABCED";
		
		for(int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt(" + i + "): " + ch);
		}
		
		//String을 char[]로 변환
		char[] chArr = src.toCharArray();
		
		//char배열(char[])을 출격
		System.out.println(chArr);
		*/
		
		/*예제 5-12 
		String[] names = {"KIM", "PARK", "YI"};     //names 배열 선언과 동시에 초기화
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]: " + names[i]);
		}
		
		String tmp = names[2];
		System.out.println("tmp: " + tmp);
		names[0] = "Yu"; //배열 names의 첫 번째 요소를 "Yu"로 변경
		for(String str : names) {
			System.out.println(str);
		}
		*/
	}

}
