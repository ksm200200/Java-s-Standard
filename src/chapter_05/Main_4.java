package chapter_05;

import java.util.Scanner;

public class Main_4 {

	public static void main(String args[]) {
		//다차원 배열의 활용
		Scanner sc = new Scanner(System.in);
		
		/* 예제 5-23 단어 맞추기
		String[][] words = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
		};
		
		for(int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은? ", i+1, words[i][0]);
			
			String tmp = sc.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n", words[i][1]);
			}
		}
		*/
		
		
		
		/*예제 5-22 행렬의 곱셈
		
		int[][] m1 = {     //2*3 행렬
				{1, 2, 3},
				{4, 5, 6}
		};
		
		int[][] m2 = {   // 3*2 행렬
				{1,2},
				{3,4},
				{5,6}
		};
		
		final int ROW = m1.length; //m1의 행 길이
		final int COL = m2[0].length; //m1의 열 길이
		final int M2_ROW = m2.length; //m2의 행 길이
		
		int[] [] m3 = new int[ROW][COL];
		
		//행렬곱 m1 * m2의 결과를 m3에 저장
		for(int i = 0; i < ROW; i++) {
			for(int j = 0; j < COL; j++) {
				for(int k = 0; k < M2_ROW; k++) {
					m3[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		
		for(int i = 0; i < ROW; i++) {
			for(int j = 0; j < COL; j++) {
				System.out.printf("%3d ", m3[i][j]);
			}
			System.out.println();
		}
		*/
		
		
		/*예제 5-21 빙고
		final int size = 5;
		int x = 0, y = 0, num = 0;
		
		int[][] bingo = new int[size][size];
		
		//배열의 모든 요소를 1부터 size*size까지의 숫자로 초기화
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				bingo[i][j] = i*size + j + 1;
			}
		}
		
		//배열에 저장된 값을 뒤섞는다
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				x = (int)(Math.random() * size);
				y = (int)(Math.random() * size);
				
				//bingo[i][j]와 임의로 선택된 값 (bing[x][y])을 바꾼다.
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}
		
		do { //셔플한 size * size 빙고판 출력
			for(int i = 0; i <size; i++) {
				for(int j = 0; j < size; j++) {
					System.out.printf("%3d", bingo[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.printf("1~%d의 숫자를 입력하세요. (종료: 0) >> ", size * size);
			num = sc.nextInt();
			
			//입력받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0을 저장
			outer:
			for(int i  = 0; i < size; i++) {
				for(int j = 0; j < size; j++) {
					if(bingo[i][j] == num) {
						bingo[i][j] = 0;     //일치하는 숫자를 찾으면 0으로 변경
						break;       	     //이중 반복문을 벗어난다.
					}
				}
			}
		}while(num != 0);
		*/
		
		
		
		/* 예제 5-20 좌표에 x표하기
		final int Size = 10;
		int x = 0, y = 0;
		
		char[] [] board = new char[Size][Size];
		byte[] [] shipBoard = {
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, //1
				{ 1, 1, 1, 1, 0, 0, 1, 0, 0 }, //2
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, //3
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, //4
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //5
				{ 1, 1, 0, 1, 0, 0, 0, 0, 0 }, //6
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, //7
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, //8
				{ 0, 0, 0, 0, 0, 1, 1, 1, 0 } //9
		};
		
		//1행에 행 변호를, 1열에 열 번호를 저장한다.
		for(int i = 1; i < Size; i++) {
			board[0][i] = board[i][0] = (char)(i+'0');			
		}
		
		while(true) {
			System.out.printf("좌표를 입력하세요. (종료는 00) >> ");
			String input = sc.nextLine();
			
			if(input.length()==2) {
				x = input.charAt(0) - '0'; //문자를 숫자로 변환
				y = input.charAt(1) - '0';
				
				if(x==0 && y==0) break;
			}
			
			if(input.length() != 2 || x <= 0 || x >= Size || y <= 0 || y >= Size) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}
			//shipBoard[x-1][y-1]의 값이 1이면, 'O'을 board[x][y]에 저장한다.
			board[x][y] = shipBoard[x-1][y-1]==1 ? 'O': 'X';
			
			//배열 board의 내용을 화면에 출력한다.
			for(int i = 0; i < Size; i++) {
				System.out.println(board[i]); //board[i]는 1차원 배열
			}
			System.out.println();
			
		}
		*/
		
		
	}

}
