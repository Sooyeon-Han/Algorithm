package algorithm.chap01;

import java.util.Scanner;

//입력한 정숫값이 양수인지 음수인지 0인지 판단

public class Practice_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요.");
		int n = scan.nextInt();
		
		if(n>0)
			System.out.println("이 수는 양수입니다.");
		
		else if(n<0)
			System.out.println("이 수는 음수입니다.");
		
		else System.out.println("이 수는 0입니다.");
	}

}