package chapter_05;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		/*예제 5-3
		//배열 arr에 1~5를 저장
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		System.out.println("[변경전]");
		System.out.println("arr.length: " + arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+ i +"]: " + arr[i]);
		}
		
		int[] tmp = new int[arr.length * 2];
		
		//배열 arr에 저장된 값들을 배열 tmp에 복사.
		for(int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		arr = tmp; //tmp에 저장된 값을 arr에 저장
		
		System.out.println("[변경후]");
		System.out.println("arr.length: " + tmp.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+ i +"]: " + arr[i]);
		}
		*/
		
		
		/* 예제 5-1
		int[] score = new int[5];
		int k = 1;
		
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70;
		score[3] = 80;
		score[4] = 90;
		
		int tmp = score[k+2] + score[4]; // int tmp = score[3]  score[4]
		
		for(int i = 1; i < 5; i++) {
			System.out.printf("score[%d]: %d%n", i, score[i]);
		}
		System.out.printf("tmp: %d%n", tmp);
		
		System.out.printf("score[%d]:%d%n", 7, score[7]); //인덱스의 범위를 벗어난 값
		*/
	}

}
