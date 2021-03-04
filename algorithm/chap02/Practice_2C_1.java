package algorithm.chap02;


//배열의 모든 요소의 합을 구하여 출력(확장 for문)
public class Practice_2C_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
		
		for(int i=0; i<a.length;i++)
			System.out.println("a["+i+"] = " + a[i]);
		
		double sum=0;	//합계
		for(double i:a)	//for문 ()안의 :콜론은 ~안에 있는 이라는 뜻
			sum+=i;
		/*
		for(int i=0;i<a.length;i++)
		sum += a[i];
		와 같은 의미
		*/	
		
		System.out.println("모든 요소의 합은 " + sum + "입니다.");
	}

}
