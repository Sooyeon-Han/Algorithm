package algorithm.chap02;

//배열 복제
public class Practice_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		int[] b = a.clone(); //b는 a의 복제를 참조
		
		b[3] = 0; //배열 b에서 인덱스가 3인 요소에 0 대입(실제로는 네 번째 요소)
		
		System.out.print("a = ");
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]);
		
		System.out.print("\nb = ");
		for(int i=0;i<b.length;i++)
			System.out.print(" "+b[i]);
	}

}
