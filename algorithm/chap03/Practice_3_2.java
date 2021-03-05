package algorithm.chap03;

import java.util.Scanner;


//실습 3-1에서 while을 for로 고쳐보기
public class Practice_3_2 {
	//배열 a의 앞쪽 n개의 요소에서 key와 같은 요소 선형 검색
	static int seqSearch(int []a, int n, int key) {
		for (int i=0; i<n; i++)
			if(a[i]==key)
				return i;	//검색에 성공하면 인덱스를 반환
		return -1;			//검색에 실패하면 -1을 반환
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = scan.nextInt();
		int[]x = new int [num];				//요솟수가 num인 배열
		
		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"] : ");
			x[i] = scan.nextInt();
		}
		
		System.out.print("검색할 값 : ");		//키 값을 입력
		int ky = scan.nextInt();
		
		int idx = seqSearch(x,num,ky);		//배열 x에서 키 값이 ky인 요소 검색
		
		if(idx==-1)
			System.out.println("해당값이 존재하지 않습니다.");
		else
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
	}

}
