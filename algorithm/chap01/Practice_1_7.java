package algorithm.chap01;

//곱셈표를 출력

public class Practice_1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*곱셈표*");
		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%3d",i*j);
				/*
				  %3d는 전체 자리수가 세 자리인 정수로 출력하라는 뜻(오른쪽 정렬)
				  >전체 자리수가 세 자리인< 이 부분이 이해가지 않는다면 %2d로 출력한 후 비교
				*/
				
			}
			System.out.println();
		}
	}

}
