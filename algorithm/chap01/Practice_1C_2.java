package algorithm.chap01;

import java.util.Scanner;

//두 자리 양수(10~99)를 입력
public class Practice_1C_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int no;
		
		System.out.println("두 자리의 정수만 입력하세요.");
		
		do {
			System.out.print("입력 : ");
			no = scan.nextInt();
		} while(no<10||no>99);
		
		System.out.println("변수 no의 값은 " + no + "이/가 되었습니다.");
	}

}
