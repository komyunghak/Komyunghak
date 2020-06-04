package kr.or.test;

import java.util.Scanner;

public class HelloWorld {

	String name = "고명학";
	
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("----------------------");
			System.out.println("1.입금|2.출금|3.잔고|4.종료");
			System.out.println("----------------------");
			System.out.print("위 번호를 입력해 주세요>");
			int menuNum = scanner.nextInt();
			switch(menuNum) {
			case 1:
				System.out.print("입금액을 입력 하세요> ");
				balance = balance + scanner.nextInt();
				break;
			case 2:
				System.out.print("출금액을 입력 하세요.> ");
				balance = balance - scanner.nextInt();
				break;
			case 3:
				System.out.print("잔고는 다음과 같습니다.> ");
				System.out.println(balance + " 원 입니다.");
				break;
			case 4:
				run = false;
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		/*int sum = 0;*/
		/*while(int i=1;i<=100;i++) {
			sum = sum + i;
	}*/
	/*int cnt = 1;
	while(cnt<=100) {
		sum = sum + 1;
		cnt = cnt + 1;
	}*/
	//System.out.println("1부터 100까지의 합은: " +sum + " 입니다.");
		/*int x = 10;
		int y = 5;
		System.out.println((x>7)&&(y<=5));//true
		System.out.println((x<7)&&(y<=5));//false
		System.out.println((x<7)||(y<=5));//true
		int score= 85;
		String result= (!(score>90))?"가":"나";
		if(!(score>90)) {
			result = "가";
		}else {
			result = "나";
		}
		System.out.println(result);
		String name = "123":
		System.out.println("안녕하세요, Hello World 자바!"); * 
		 */ 
	}
}


