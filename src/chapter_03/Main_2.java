package chapter_03;

import java.util.Scanner;

public class Main_2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//나머지 연산자
		/*int x = 10;
		int y = 8;
		System.out.printf("%d을 %d로 나누면, %n", x, y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다. %n", x / y, x % y);
		System.out.println(-10 % 8);
		System.out.println(10 % -8);
		System.out.println(-10 % -8);*/
		
		//등가 비교 연산자
		//%b는 boolean 출력
		/*System.out.printf("10 == 10.0f \t %b%n", 10 == 10.0f);
		System.out.printf("'A' == 65 \t %b", 'A' == 65 );
		System.out.println();
		String str1 = "abc";
		String str2 = new String("abc");
		System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1 == \"abc\" ? %b%n", str1=="abc");
		System.out.println();*/
		
		//논리 연산자
		/*int x = 0;
		
		x = 15;
		System.out.printf("x=%2d, 10 < x && x < 20 = %b%n", x, 10 < x && x < 20);
		
		x = 6;
		System.out.printf("x = %2d, x %% 2 == 0 || x %% 3 == 0 && x %% 6 != 0 = %b%n ", x, x % 2 == 0 || x % 3 == 0 && x % 6!=0);*/
		
		char ch = ' ';
		System.out.printf("문자를 하나 입력하세요 : ");
		String input = sc.nextLine();
		ch = input.charAt(0);
		if('0' <= ch && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		} else if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("입력하신 문자는 영문자입니다.%n");
		}
				
				
		
		
	}

}
