package algorithm.chap02;

import java.util.Scanner;

//두 배열이 같은지 판단
public class Practice_2_7 {
	
	static boolean equals(int[] a, int[] b) {
		if(a.length!=b.length)
			return false;
		
		for(int i=0; i<a.length; i++)
			if(a[i]!=b[i])
				return false;
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열 a의 요솟수 : ");
		int na = scan.nextInt();	//배열 a의 요솟수
		
		int[] a = new int[na];	//요솟수가 na인 배열
		
		for(int i=0; i<na; i++) {
			System.out.print("a["+i+"] : ");
			a[i] = scan.nextInt();
		}
		
		System.out.print("배열 b의 요솟수 : ");
		int nb = scan.nextInt();	//배열 b의 요솟수
		
		int[] b = new int[nb];	//요솟수가 nb인 배열
		
		for(int i=0;i<nb;i++) {
			System.out.print("b["+i+"] : ");
			b[i] = scan.nextInt();
		}
		
		System.out.println("배열 a와 b는 "+(equals(a,b)?"같습니다." : "같지 않습니다."));
	}

}
