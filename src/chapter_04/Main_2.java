package chapter_04;

import java.util.Scanner;

public class Main_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* 예제 4-34
		int menu;
		int num;
		
		outer:
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 섲택하세요 (종료: 0)");
		menu = sc.nextInt();
		
		if(menu == 0) {
			System.out.println("프로그램을 종료합니다.");
			break;
		
		} else if (!(1<=menu && menu <= 3)) {
			System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
			continue;
		}
		
		for(;;) {
			System.out.println("계산할 값을 입력하세요. (종료 계산종료: 0, 전체종료: 99) > ");
			num = sc.nextInt();
			
			if(num == 0) {
				break;   //계산종료
			}
			if(num == 99) {
				break outer; //전체종료.
			}
			
			switch(menu) {
				case 1:
					System.out.println("result = " + num * num);
					break;
				case 2:
					System.out.println("result = " + Math.sqrt(num));
					break;
				case 3:
					System.out.println("result = " + Math.log(num));
					break;
				}
			}
			
		}
		*/
		
		/*예제 4-33
		//for문에 Loop1이라는 이름을 붙였다.
		Loop1 : for(int i = 2; i <= 9; i++) {
				for(int j = 1; j <= 9; j++) {
					if(j==5) {
						//break Loop1;
						//break;
						//continue Loop1;
						continue;
					}System.out.println(i + "*" + j + "=" + i*j);
					System.out.println();
				}
		}
		*/
		
		/* 예제 4-32
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1 ~ 3)을 선택하세요.(종료: 0) >> ");
			int n = sc.nextInt();
			
			if( n==0 ) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(!(1 <= n && n <= 33)) {
				System.out.println("메뉴를 잘못 선택했습니다. (종료는 0)");
				continue;
			}
			System.out.println("선택하신 메뉴는 " + n + " 입니다.");
		}*/
		
		
		
		/* 예제 4-31
		for(int i = 0; i <= 10; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.println(i);//3으로 나누었을때 0이면 실행 안하고 다시 반복
		}*/
		
		
		/*예제 4-30
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100) break;
			sum += i;
			i++;
			System.out.println(sum);
		}*/
		
		
		
		/*예제 4-29
		//3, 6, 9 짝!
		for(int i = 1; i <= 100; i++) {
			System.out.print("number = " + i);
			int number = i;
			do {
				// 3의 배수인지 확인 0은제외
				if(number % 10 % 3 == 0 && number % 10 != 0) {
					System.out.print(" 짝");
				}
			} while((number /= 10) != 0);
			System.out.println();
		}*/
		
		
		/* 예제 4-28
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1; // 1 ~ 100사이의 임의의 수 저장
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요. >> ");
			input = sc.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			} else if(input < answer) {
				System.out.println("더 큰수로 다시 시도해보세요.");
			}
		} while(input != answer);
		System.out.println("정답입니다.");*/
		
		
		
		/* 예제 4-27
		int num;
		int sum = 0;
		boolean flag = true;
		
		System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0입력)");
		
		while(flag) {
			System.out.print(">> ");
			num = sc.nextInt();
			
			if(num != 0) {
				sum += num;
			} else {
				flag = false;
			}
		}
		System.out.println("합계: " + sum);*/
		
		/*예제 4-24
		int i = 11;
		System.out.println("카운터 다운을 시작합니다.");
		while(i-- != 0) {
			System.out.println(i);
			for(int j = 0; j < 2_000_000_000; j++) {	
			}
		}
		System.out.println("end");*/
		
		
		/*예제 4-23
		 int i = 5;
		 
		 while(i-- != 0) { //i-- 하강연산자
			 System.out.println(i + " - I can do it!");
		 }*/
		
		
		
		
		/*예제 4-18
		for(int i = 2; i <= 9; i++) {
			System.out.println("-----" + i+"단---------");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + " = " + i * j);
			}
			System.out.println();
			
		}*
		
		/*예제 4-17
		for(int line = 1; line <= 10; line++) {
			for(int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*예제 4-13
		int sum = 0;
		
		for(int i = 1; i <= 1000; i++) {
			sum += i;
			System.out.println("1부터 " + i + "까지의 합 : " + sum);
		}*/
		
		
	}
}
