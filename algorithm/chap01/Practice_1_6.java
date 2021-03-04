package algorithm.chap01;

import java.util.Scanner;

//1,2,...,n의 합을 구함(양수만 입력)
public class Practice_1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.print("n의 값 : ");
			n = scan.nextInt();			
		}while(n<=0);
		//n이 0보다 클 때 까지 반복
		
		int sum=0;	//합
		
		for(int i=1;i<=n;i++)
			sum+=i;
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum +"입니다.");
	}

}
