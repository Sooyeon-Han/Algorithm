package algorithm.chap02;

import java.util.Scanner;

//값을 입력받아 배열 요소의 최댓값 찾기
public class Practice_2_4 {
	
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1;i<a.length;i++)
			if(a[i]>max)
				max=a[i];
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = scan.nextInt();	//배열의 요소 수를 입력받음(사람이 몇 명인지)
		
		int[] height = new int[num];	//위에서 입력한 숫자가 num인 배열 생성
		
		for(int i=0;i<num;i++) {
			System.out.print("height["+i+"] : ");
			height[i] = scan.nextInt();
		}
		
		System.out.println("최대값은 " + maxOf(height)+"입니다.");
	}

}
