package algorithm.chap03;

import java.util.Scanner;

//선형 검색(보초법)
public class Practice_3_3 {
	static int seqSearchSen(int []a, int n, int key) {
		int i=0;
		
		a[n] = key;			//보초(검색하기 전에 검색하고자 하는 키 값을 배열의 맨 끝 요소에 저장하는데 저장하는 값이 보초)를 추가
		
		while(true) {
			if(a[i]==key)	//검색 성공
				break;
			i++;
		}
		return i==n?-1:i;	//변수값 i가 n이면 찾은 값이 보초이므로 검색 실패(찾고자 하는 값이 마지막에 임의로 저장한 값에서 처음으로 찾아졌기 때문에)임으로 -1을 반환
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = scan.nextInt();
		int[]x = new int[num+1];			//요솟수 num+1
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = scan.nextInt();
		}
		System.out.print("검색할 값 : ");		//키 값을 입력
		int ky = scan.nextInt();
		
		int idx = seqSearchSen(x,num,ky);	//배열 x에서 값이 ky인 요소 검색
		
		if(idx==-1)
			System.out.println("해당값이 존재하지 않습니다.");
		else
			System.out.println(ky+"은/는 x["+idx+"]에 있습니다.");
	}

}
