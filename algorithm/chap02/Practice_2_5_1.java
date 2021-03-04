package algorithm.chap02;

import java.util.Scanner;

/*
배열 요소의 최댓값을 나타냄(값은 Math.random으로)

# Random()과 Math.random()의 차이

1. 	Random()은 java.util.Random을 사용, Math.random()은 java.lang.Math 클래스의 정적 메소드인 random() 메소드를 사용
	(Random()을 사용하려면 import가 필요함)
	
2. 	Random()은 boolean, int, long, float, double 난수를 얻을 수 있지만 Math.random()은 0.0.에서 1 사이의 double 난수만 얻을 수 있음
	(Math.random()을 정수 값을 얻는 데 사용하려면 곱해주면 됨)
*/

public class Practice_2_5_1 {
	
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++)
			if(a[i]>max)
				max = a[i];
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = scan.nextInt();	//배열의 요솟수 입력받음
		
		int[] height = new int[num];	//요솟수가 num인 배열을 생성
		
		System.out.println("키 값은 아래와 같습니다.");
		
		for(int i=0;i<num;i++) {
			height[i] = 100 + ((int)(Math.random()*90)+1);	//요소의 값을 난수로 결정
			System.out.println("height["+i+"] : " + height[i]);
		}
		
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
	}

}
