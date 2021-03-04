package algorithm.chap02;

import java.util.Scanner;


//입력받은 10진수를 2진수~36진수로 기수 변환하여 나타냄
public class Practice_2_8 {
	//정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환
	
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x%r);	//r로 나눈 나머지 저장
			
			x/=r;
		}while(x!=0);
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int no;		//변환하는 정수
		int cd;		//기수
		int dno;	//변환 후 자릿수
		int retry;	//다시 한 번?
		char[] cno = new char[32];	//변환 후 각 자리의 숫자를 넣어두는 문자 배열
		
		
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수 : "
						+ "");
				no = scan.nextInt();
			}while(no<0);
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36 사이에서 입력) : ");
				cd = scan.nextInt();
			}while(cd<2 || cd>36);
			
			dno = cardConvR(no,cd,cno);	//no를 cd진수로 변환
			
			System.out.print(cd+"진수로는 ");
			for(int i=dno-1;i>=0;i--)	//윗 자리부터 차례로 나열
				System.out.print(cno[i]);
			System.out.println("입니다.");
			
			System.out.print("한번 더 할까요? (1. 예 / 2. 아니오) : ");
			retry = scan.nextInt();
		} while(retry==1);
	}
}
