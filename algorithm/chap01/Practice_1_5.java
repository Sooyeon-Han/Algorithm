package algorithm.chap01;

import java.util.Scanner;

//1,2,...,n의 합을 구함
public class Practice_1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = scan.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum +"입니다.");
	}

}
