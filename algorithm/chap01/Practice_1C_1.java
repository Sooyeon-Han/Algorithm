package algorithm.chap01;

import java.util.Scanner;

//3개의 정숫값을 입력하고 중앙값을 구한 후 중앙값을 출력

public class Practice_1C_1 {
	
	static int med3(int a, int b, int c) {
		if(a>=b)
			if(b>=c)
				return b;
		
			else if(a<=c)
				return a;
			
			else return c;
		
		
		else if(a>c)
			return a;
		
		else if(b>c)
			return c;
		
		else return b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		
		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();
		
		System.out.print("b의 값 : ");
		int b = stdIn.nextInt();
		
		System.out.print("c의 값 : ");
		int c = stdIn.nextInt();
		
		System.out.println("중앙값은 " + med3(a,b,c) + "입니다.");

	}

}
