package chapter_08;

public class FinallyTest {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
			deleteTempFiles();
			deleteTempFiles();
			
		} catch (Exception e) {
			e.printStackTrace();
			deleteTempFiles();
		} 
		
		
	}
	static void startInstall() {
		System.out.println("프로그램 설치에 필요한 준비");
	}
	static void copyFiles() {
		System.out.println("파일들을 복사");
	}
	static void deleteTempFiles() {
		System.out.println("프로그램 설치에 사용된 임시파일들을 삭제");
	}
	
}
