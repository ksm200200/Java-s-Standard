package chapter_04;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		/* 예제 4-10
		int score = 0;
		char grade = ' ';
		
		System.out.print("당신의 점수를 입력하세요. (1~100) >> ");
		String tmp = sc.nextLine();
		score = Integer.parseInt(tmp);
		
		switch(score/10) {
			case 10:
			case 9 :
				grade = 'A';
				break;
			case 8 :
				grade = 'B';
				break;
			case 7 :
				grade = 'C';
				break;
			default :
				grade = 'F';
		}
		System.out.println("당신의 학점은 " + grade + " 입니다.");
		*/
		
		
		
		/* 예제 4-8
		System.out.print("주빈등록 뒷자리를 입력하세요. >> ");
		String regNo = sc.nextLine();
		
		char gender = regNo.charAt(0); //입력받은 번호의 8번째 문자를 gender에 저장
		
		switch(gender) {
			case '1': case '3' :
				System.out.println("당신은 남자입니다.");
				break;
			case '2': case '4' :
				System.out.println("당신은 여자입니다.");
				break;
			default:
				System.out.println("유효하지않은 주민등록번호입닌다.");
		}*/
			
		/* 예제 4-7
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요. > ");
		int user = sc.nextInt();
		int com = (int)(Math.random() * 3) + 1;
		
		System.out.println("당신은 "+ user + "입니다.");
		System.out.println("컴은 " + com + "입니다.");
		
		switch(user-com) {
			case 2: case -1:
				System.out.println("당신이 졌습니다.");
				break;
			case 1: case -2:
				System.out.println("당신이 이겼습니다.");
				break;
			case 0:
				System.out.println("비겼습니다.");
		}
		*/
		
		/* 예제 4-6
		System.out.print("현재 월을 입력하세요. : ");
		int month = sc.nextInt();
		
		switch(month) {
			case 3: case 4:case 5:
				System.out.println("현재 계절은 봅입니다.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("현재의 계절은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("현재 계절은 가을입니다.");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("현재 계절을 겨울입니다.");
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				break;
		}*/
		
		
		
		
		/* 예제 4-2
		int input;
		System.out.print("숫자를 하나 입력하세요. : ");
		
		String tmp = sc.nextLine(); //화면을 통해 입력받은 내용을 tmp에 저장
		input = Integer.parseInt(tmp); // 입력받은ㅇ 문자열 (tmp)을 숫자로 변환
		
		if(input == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
		if(input != 0) {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d입니다", input);
		}*/
		
		
	}

}
